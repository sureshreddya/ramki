package com.gprs.dao.user;

import java.util.List;

import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.vo.PriceUnitVO;

public interface UserDAO {

	/**
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
	/**
	 * 
	 * @param userID
	 * @return User Entity
	 */
	public User getUserById(int userID);
	/**
	 * 
	 * @param user
	 * @return
	 */
	public List<User> authentication(User user);
	/**
	 * 
	 * @return PriceUnit
	 */
	public List<PriceUnit> getPriceUnit();
	
	public	PriceUnit savePriceUnit(PriceUnit priceUnit);
	public void deletePriceUnit(int id);
	public PriceUnit getPriceUnitByID(int id) ;
	public void updatePriceUnit(PriceUnit priceUnit);
	
	public List<User> findUsers();

}
