package com.gprs.controller.user;

import java.util.Base64;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gprs.converter.UserConverter;
import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.services.defaults.DefaultsService;
import com.gprs.services.user.UserServices;
import com.gprs.vo.PriceUnitVO;
import com.gprs.vo.UserSignInVO;
import com.gprs.vo.UserSignUpVO;

@RestController
public class UserController {

	private static Logger logger = LogManager.getLogger(UserController.class);
	@Autowired
	private UserServices userServices;
	@Autowired
	private DefaultsService DefaultsService;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/")
	public ModelAndView welcomeHome() {
		return new ModelAndView("Welcome");
	}

	@RequestMapping(value = "/loadSignUp")
	public ModelAndView loadSignUp() {
		logger.info("loadSignUp ");
		return new ModelAndView("SignUp", "SignUp", new UserSignUpVO());
	}

	@RequestMapping(value = "/signUp")
	public ModelAndView SignUp(@Valid @ModelAttribute UserSignUpVO signUp, ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Welcome");
		
		if (signUp.getPassword().equals(signUp.getConfirmPassword())) {
			User user = new User();
			String encrypt = Base64.getEncoder().encodeToString(signUp.getPassword().getBytes());
			user.setPassword(encrypt);
			user.setFirstName(signUp.getFirstName());
			user.setEmailID(signUp.getEmailID());
			user.setMobileNumber(signUp.getMobileNumber());
			try {
				logger.info("userdetails is going to save");
				User userDetails = userServices.save(user);
				if (userDetails != null) {
					logger.info(" saved Successfully");
					HttpSession session = request.getSession();
					session.setMaxInactiveInterval(120);
					modelAndView.setStatus(HttpStatus.OK);
					session.setAttribute("User", userDetails);
				} else {
					modelMap.addAttribute("error", "Something went Wrong");
					modelAndView.setStatus(HttpStatus.CONFLICT);
				}
				return modelAndView;
			} catch (Exception e) {
				modelAndView.setStatus(HttpStatus.CONFLICT);
				return modelAndView;
			}
		} else {
			modelMap.addAttribute("error", "Password & Confirm password wrong");
			modelAndView.setStatus(HttpStatus.CONFLICT);
			return modelAndView;
		}
	}

	@RequestMapping(value = "/signIn")
	public ModelAndView loadSignIn() {
		ModelAndView modelAndView = new ModelAndView("SignIn", "SignIn", new UserSignInVO());
		return modelAndView;
	}

	@RequestMapping(value = "/login")
	public ModelAndView SignIn(@ModelAttribute UserSignInVO signIn, ModelMap modelMap) {
		ModelAndView modelAndView = null;

		User user = new User();
		user.setUserName(signIn.getUserName());
		String encrypt = Base64.getEncoder().encodeToString(signIn.getPassword().getBytes());
		user.setPassword(encrypt);
		try {
			List<User> userDetails = userServices.authentication(user);
			if (userDetails != null && userDetails.size() > 0) {
				modelAndView = new ModelAndView("Welcome");
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(120);
				session.setAttribute("User", userDetails.get(0));
				return modelAndView;
			} else {
				modelMap.addAttribute("error", "Username/password is wrong");
				modelAndView = new ModelAndView("SignIn", "SignIn", new UserSignInVO());
				modelAndView.setStatus(HttpStatus.CONFLICT);
			}
			return modelAndView;
		} catch (Exception e) {
			modelAndView = new ModelAndView("SignIn", "SignIn", new UserSignInVO());
			modelMap.addAttribute("error", "someting wrong please try after sometime");
			e.printStackTrace();
			return modelAndView;
		}
	}

	@RequestMapping(value = "/logOut")
	public ModelAndView logOut(ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Welcome");
		try {

			HttpSession session = request.getSession(false);
			if (session != null) {
				User user = (User) request.getSession().getAttribute("User");
				if (user != null) {
					request.getSession().removeAttribute("User");
					request.getSession().invalidate();
					return modelAndView;
				}
			}
			return modelAndView;
		} catch (Exception e) {
			logger.catching(e);
			return modelAndView;
		}

	}

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/maintainPriceUnit")
	public ModelAndView maintainPriceUnit(HttpServletRequest request, ModelMap modelMap) {
		logger.entry("maintainPriceUnit");
		ModelAndView modelAndView = new ModelAndView();
		List<PriceUnit> priceUnit = userServices.getPriceUnit();
		if (priceUnit != null) {
			request.setAttribute("priceUnits", priceUnit);
		}
		modelAndView.setViewName("defaults/MaintainPriceUnit");
		return modelAndView;
	}

	@RequestMapping(value = "/priceUnitLoad")
	public ModelAndView createPriceUnitLoad() {
		ModelAndView modelAndView;
		modelAndView = new ModelAndView("defaults/CreatePriceUnit", "priceUnitVO", new PriceUnitVO());
		return modelAndView;
	}

	@RequestMapping(value = "/priceUnitInsert")
	public ModelAndView createPriceUnit(@ModelAttribute PriceUnitVO priceUnitVO, ModelMap modelMap) {
		ModelAndView modelAndView;
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("User");
		if (user != null) {
			priceUnitVO.setLastUpdatedBy(user.getFirstName());
		}
		if (userServices.savePriceUnit(priceUnitVO) != null) {
			modelAndView = new ModelAndView("Welcome");
		} else {
			modelAndView = new ModelAndView("defaults/CreatePriceUnit", "priceUnitVO", priceUnitVO);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deletePriceUnit(@PathVariable int id, ModelMap modelMap) {
		try {
			userServices.deletePriceUnit(id);
			return new ModelAndView("defaults/MaintainPriceUnit");
		} catch (Exception e) {
			modelMap.addAttribute("error", "someting wrong please try after sometime");
			return new ModelAndView("Welcome");
		}
	}
	@RequestMapping(value = "/profile")
	public ModelAndView userProfile() {
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("User");
		
		UserSignUpVO userVO= UserConverter.convertToUser(user);
		return new ModelAndView("user/MaintainUserProfile","User",userVO);
	}
	@RequestMapping(value = "/maintainUser{id}")
	public ModelAndView maintainUser(@PathVariable int id) {
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("User");
		UserSignUpVO userVO= UserConverter.convertToUser(user);
		return new ModelAndView("user/MaintainUserProfile","User",userVO);
	}
	
	@RequestMapping(value = "/users")
	public ModelAndView findUsers() {
		ModelAndView modelAndView=new ModelAndView();
		/* Collection<String> roles=DefaultsService.findMasterRoleGroups(); */
		modelAndView.setViewName("user/Users");
		List<User> users= userServices.findUsers();
		HttpSession session = request.getSession(false);
		session.setAttribute("Users", users);
		return modelAndView;
	}
}
