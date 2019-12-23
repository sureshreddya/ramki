package com.gprs.servicesimpl.defaults;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gprs.dao.defaults.DefaultsDAO;
import com.gprs.services.defaults.DefaultsService;
@Service
public class DefaultsServiceImpl implements DefaultsService {
	
	@Autowired
	private DefaultsDAO defaultsService;

	@Override
	public Collection<String> findMasterRoleGroups() {
		// TODO Auto-generated method stub
		return defaultsService.findMasterRoleGroups();
	}

}
