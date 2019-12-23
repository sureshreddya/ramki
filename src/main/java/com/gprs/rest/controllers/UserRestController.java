package com.gprs.rest.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.exception.DBAccessException;
import com.gprs.exception.NotFoundException;
import com.gprs.exception.PriceUnitNotFoundException;
import com.gprs.rest.response.LoginResponse;
import com.gprs.rest.response.SuccessResponse;
import com.gprs.services.user.UserServices;
import com.gprs.vo.PriceUnitVO;
import com.gprs.vo.UserSignInVO;

@RestController
@RequestMapping(path="/restApi")
public class UserRestController {
	
	@Autowired
	private UserServices userServices;
	@Autowired
	private HttpServletRequest request;
	
	  @GetMapping(value="/hello", produces = "application/json")
	  public String sayHellow() 
	  	{ 
		  return "hello world"; 
		}
	  
	  @GetMapping(value="/priceUnitDetails", produces = "application/json")
	  public List<PriceUnit> getPriceUnits(){
		  return userServices.getPriceUnit();
	  }
	  @GetMapping(value="/priceUnitDetails/{id}")
	  public PriceUnit getPriceUnit(@PathVariable int id){
		  
		  PriceUnit priceUnit= userServices.getPriceUnitByID(id);
		  if(priceUnit == null) {
			  throw new PriceUnitNotFoundException("PriceUnit not Found- "+id);
		  }
		  return priceUnit;
	  }
	  @PostMapping(value="/priceUnitDetails")
	  public ResponseEntity<SuccessResponse> addPriceUnit(@RequestBody PriceUnitVO priceUnitVO){
		  PriceUnit savedPriceUnit= userServices.savePriceUnit(priceUnitVO);
		  SuccessResponse successResponse=new SuccessResponse();
		  successResponse.setStatus(HttpStatus.CREATED.toString());
		  successResponse.setObject(savedPriceUnit);
		  successResponse.setMessage("PriceUnit Saved Successfully");
		  String dateTime=LocalDateTime.of(LocalDate.now(),LocalTime.now()).toString();
		  successResponse.setTimestamp(dateTime);
		  return new ResponseEntity<SuccessResponse>(successResponse,HttpStatus.CREATED);
	  }
	  @PutMapping(value="/priceUnitDetails")
	  public ResponseEntity<SuccessResponse> updatePriceUnit(@RequestBody PriceUnitVO priceUnitVO){
		  try {
			  HttpSession session = request.getSession(false);
			  if(session!=null) {
				  User user = (User) session.getAttribute("User");
				  if(user!=null) {
					  priceUnitVO.setLastUpdatedBy(user.getFirstName());
				  }
			  }
			  userServices.updatePriceUnit(priceUnitVO);
			  SuccessResponse response=new SuccessResponse();
			  response.setStatus(HttpStatus.OK.toString());
			  response.setMessage("Updated Successfully");
			  response.setObject(priceUnitVO);
			  return new ResponseEntity<SuccessResponse>(response,HttpStatus.OK);
		  }catch(HibernateException e) {
			  throw new DBAccessException(e.getMessage());
		  }
	  }
	  @DeleteMapping(value="/priceUnitDetails/{id}")
	  public String deletePriceUnit(@PathVariable int id) {
		  PriceUnit priceUnit=userServices.getPriceUnitByID(id);
		  if(priceUnit == null) {
			  throw new PriceUnitNotFoundException("PriceUnit not Found- "+id);
		  } 
		  userServices.deletePriceUnit(id);
		  return "Customer deleted";
	  }
	  @GetMapping(value="/login")
	  public ResponseEntity<LoginResponse>  login(@RequestBody UserSignInVO userSignInVO){

			User user = new User();
			user.setUserName(userSignInVO.getUserName());
			String encrypt = Base64.getEncoder().encodeToString(userSignInVO.getPassword().getBytes());
			user.setPassword(encrypt);
			try {
				List<User> userDetails = userServices.authentication(user);
				if (userDetails != null && userDetails.size() > 0) {
					HttpSession session = request.getSession();
					session.setMaxInactiveInterval(120);
					LoginResponse loginResponse=new LoginResponse();
					loginResponse.setMessage("Logined-In Successfully");
					loginResponse.setStatus(HttpStatus.OK.value());
					loginResponse.setSessionId(session.getId());
					session.setAttribute("User", userDetails.get(0));
					return new ResponseEntity<LoginResponse> (loginResponse,HttpStatus.OK);
				}else {
					throw new NotFoundException("User details not Found");
				}
			} catch (Exception e) {
				throw new DBAccessException("Some thing went wrong please try after some time");
			}
			
		
	  }
		  
	  
}