package com.gprs.converter;

import com.gprs.entity.user.User;
import com.gprs.vo.UserSignUpVO;

public class UserConverter {
	public static UserSignUpVO convertToUser(User user) {
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

}
