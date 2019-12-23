package com.gprs.daoimpl.user;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gprs.dao.user.UserDAO;
import com.gprs.entity.PriceUnit;
import com.gprs.entity.user.User;
import com.gprs.vo.PriceUnitVO;
@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public User save(User user) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			User savedUser= (User)session.save(user);
			tx.commit();
			session.close();
			return savedUser;
		}catch(ConstraintViolationException ex) {
			System.out.println("Email/Mobile already registered");
			return null;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;			
		}
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userID) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			User use=session.get(User.class,userID);
			return use;
		}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<User> authentication(User user) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			String query1=null;
			if(user.getUserName().contains("@")) {
				 query1="from User where emailId = ?1 and password = ?2";
			}else {
				query1="from User where mobileNumber = ?1 and password = ?2";
			}
			Query<User> query=session.createQuery(query1,User.class);
			query.setParameter(1, user.getUserName());
			query.setParameter(2, user.getPassword());
			List<User> use=query.list();
			if(use!=null && use.size() > 0) {
				return use;
			}else {
				return null;
			}
		}catch(HibernateException e) {
			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<PriceUnit> getPriceUnit() {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			/* List<PriceUnit> priceUnit=session.createCriteria("PriceUnit").list(); */
			Query<PriceUnit> query=session.createQuery("from PriceUnit" ,PriceUnit.class);
			List<PriceUnit> priceUnit2=query.list();
			if(priceUnit2.size()>0) {
			return priceUnit2;}
			else {
				return null;
			}
		}catch(HibernateException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public PriceUnit getPriceUnitByID(int id) {
		// TODO Auto-generated method stub
		try {
			Session session=sessionFactory.openSession();
			return session.get(PriceUnit.class, id);
		}catch(HibernateException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	@Override
	public PriceUnit savePriceUnit(PriceUnit priceUnit) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try {
			
			Serializable ide =session.save(priceUnit);
			tx.commit();
			session.close();
			return priceUnit;
		}catch(HibernateException e){
			tx.commit();
			e.printStackTrace();
			session.close();
			return null;
		}
		
	}
	
	public void deletePriceUnit(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
try {
			PriceUnit unit=getPriceUnitByID(id);
			session.delete(unit);
			tx.commit();
			session.close();
		}catch(HibernateException e){
			session.close();
			e.printStackTrace();
		}
	}
	
	public void updatePriceUnit(PriceUnit priceUni) {
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try {
			session.saveOrUpdate(priceUni);
			tx.commit();
			session.close();
		}catch(HibernateException e){
			tx.commit();
			session.close();
			throw new HibernateException("Connection problem");
		}
		
	}


	@Override
	public List<User> findUsers() {
		Session session=sessionFactory.openSession();
		try {
			Query<User> query=session.createQuery("from User", User.class);
			return query.list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
