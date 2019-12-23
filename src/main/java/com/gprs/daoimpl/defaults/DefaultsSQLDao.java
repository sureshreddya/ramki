package com.gprs.daoimpl.defaults;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gprs.dao.defaults.DefaultsDAO;
@Repository
public class DefaultsSQLDao implements DefaultsDAO {
	
	@Autowired
	private SessionFactory factory;

	@Override
	@Transactional
	public Collection<String> findMasterRoleGroups() {
		// TODO Auto-generated method stub
		Session session =factory.openSession();
		
		@SuppressWarnings("unchecked" )
		Query<String> query=session.createQuery("select ROLEGROUPCOD from ADMROLGRUPMST");
		List<String> masterRoleGroup=query.getResultList();
		return masterRoleGroup;
	}

}
