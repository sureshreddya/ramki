package com.gprs.services.user;

import java.util.List;

import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.vo.PriceUnitVO;
import com.gprs.vo.UserSignUpVO;
/**
 * 
 * @author Suvvala Ramki
 *
 */
public interface UserServices {
	/**
	 * 
	 * @param user
	 * @return serializable id
	 */
	public User save(User user);
	/**
	 * 
	 * @param user
	 * @return User entity
	 */
	public User getUser(User user);
	public PriceUnit getPriceUnitByID(int id) ;
	/**
	 * 
	 * @param userID
	 * @return User Entity
	 */
	public UserSignUpVO getUserById(int userID);
	/**
	 * 
	 * @param user
	 * @return Integer
	 */
	public List<User> authentication(User user);
	/**
	 * 
	 * @return PriceUnit
	 */
	
	public List<PriceUnit> getPriceUnit();
	
	public PriceUnit savePriceUnit(PriceUnitVO priceUnitVO);
	
	public void deletePriceUnit(int id);
	public void updatePriceUnit(PriceUnitVO priceUnitVO);
	
	public List<User> findUsers();

}
