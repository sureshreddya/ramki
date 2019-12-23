package com.gprs.daoimpl.product;

import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.gprs.dao.product.ProductDAO;
import com.gprs.entity.product.Product;
import com.gprs.exception.PersistentException;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Product saveProduct(Product product) throws PersistentException{
		if(sessionFactory!=null)
		{
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			try {
				Product SavedProduct=(Product)session.save(product);
				tx.commit();
				return SavedProduct;
			}catch(Exception e){
				throw new PersistentException(e.getMessage());
			}
		}else {
			throw new PersistentException("Somethig went wrong");
		}
	}

	@Override
	public Collection<Product> getProductList() {
		if(sessionFactory!=null)
		{
			Session session=sessionFactory.openSession();
			try {
				Query<Product> query=session.createQuery("from Product",Product.class);
				Collection<Product> products=query.list();
				return products;
			}catch(HibernateException e){
				System.out.println(e.getMessage());
				return null;
			}
		}else {
			return null;
		
		}
		
	}

	@Override
	public Product getProduct(Product product) {
		return null;
	}

}
