package com.threemusketeers.followbuyme.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CustomHibernateDaoSupport
{    
	@Autowired
	 private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
	  this.sessionFactory = sessionFactory;
	}
}