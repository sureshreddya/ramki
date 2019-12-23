package com.gprs.servicesimpl.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gprs.dao.user.UserDAO;
import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.services.user.UserServices;
import com.gprs.vo.PriceUnitVO;
import com.gprs.vo.UserSignUpVO;
@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User save(User user) {
		try {
			User saveduser=userDAO.save(user);
			return saveduser;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.getUser(user);
	}

	@Override
	public UserSignUpVO getUserById(int userID) {
		// TODO Auto-generated method stub
		User user=	userDAO.getUserById(userID);
		if(user!=null) {
			return convertToUser(user);
		}else {
			return null;
		}
	}

	@Override
	public List<User> authentication(User user) {
		// TODO Auto-generated method stub
		List<User> userList=userDAO.authentication(user);
		return userList;
	}

	@Override
	public List<PriceUnit> getPriceUnit() {
		return userDAO.getPriceUnit();
	}

	@Override
	public PriceUnit savePriceUnit(PriceUnitVO priceUnitVO) {
		// TODO Auto-generated method stub
		return userDAO.savePriceUnit(priceUnit(priceUnitVO));
	}

	private PriceUnit priceUnit(PriceUnitVO priceUnitVO) {
		// TODO Auto-generated method stub
		PriceUnit  priceUnit=new PriceUnit();
		priceUnit.setPriceUnitID(priceUnitVO.getPriceUnitID());
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		priceUnit.setConvertUnit(priceUnitVO.getConvertUnit());
		priceUnit.setConversionRate(priceUnitVO.getConversionRate());
		if(priceUnitVO.getEndDate()!=null) {
			
			try {
				Date date=dateFormat.parse(priceUnitVO.getEndDate());

				priceUnit.setEndDate(date);
			}catch(ParseException e) {
				System.out.println(e.getMessage());
			}
		}
		if(priceUnitVO.getLastUpdatedBy()!=null) {
			priceUnit.setLastUpdatedBy(priceUnitVO.getLastUpdatedBy());
		}
		priceUnit.setLastUpdated(new Date());
		
		if(priceUnitVO.getStartDate()!=null) {
			try {
				Date date=dateFormat.parse(priceUnitVO.getStartDate());
				priceUnit.setStartDate(date);
			}catch(ParseException e) {
				System.out.println(e.getMessage());
			}
		}
		priceUnit.setPriceUnit(priceUnitVO.getPriceUnit());
		priceUnit.setCountry(priceUnitVO.getCountry());
		return priceUnit;
	}

	@Override
	public void deletePriceUnit(int id) {
		userDAO.deletePriceUnit(id);
		
	}

	@Override
	public PriceUnit getPriceUnitByID(int id) {
		return userDAO.getPriceUnitByID(id);
	}
	
	private UserSignUpVO convertToUser(User user) {
		UserSignUpVO signUpVO=new UserSignUpVO();
		signUpVO.setFirstName(user.getFirstName());
		signUpVO.setUserID(user.getUserID());
		signUpVO.setLastName(user.getLastName());
		signUpVO.setEmailID(user.getEmailID());
		signUpVO.setMobileNumber(user.getMobileNumber());
		signUpVO.setPassword(user.getPassword());
		signUpVO.setProfilePic(user.getProfilePic());
		signUpVO.setRoleGroup(user.getRoleGroup());
		return signUpVO;
	}
	public void updatePriceUnit(PriceUnitVO priceUnitVO) {
	 userDAO.updatePriceUnit(priceUnit(priceUnitVO));
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
