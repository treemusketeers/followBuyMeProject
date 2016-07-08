/**
 * 
 */
package com.threemusketeers.followbuyme.base.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threemusketeers.followbuyme.base.dao.BaseDAO;
import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	BaseDAOImpl.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	14 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
@Repository
@Transactional
public abstract class BaseDAOImpl<T extends Base> implements BaseDAO<T>{
	
	@Autowired
	 private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
	  this.sessionFactory = sessionFactory;
	}
	  
	//@Override
	
	public void create(T input) throws Exception{
		 sessionFactory.getCurrentSession().save(input);
	}
	//@Override
	public void update(T input) throws Exception{
		sessionFactory.getCurrentSession().update(input);
	}
	//@Override
	public void delete(Long id,Class<?> clazz) throws Exception{
		Session session = sessionFactory.openSession();
		Object o = session.load(clazz, id);
		session.delete(o);
	}
	
	//@Override
	@SuppressWarnings("unchecked")
	public T retrieveById(Long id) throws Exception{
		T result = (T) sessionFactory.openSession().get(getGenericTypeClass(), id);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> getGenericTypeClass() {
		Class<T> clazz = null;
		Type[] genericTypes = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
		if (genericTypes[0] instanceof ParameterizedType) {
			clazz = (Class<T>) ((ParameterizedType) genericTypes[0]).getRawType();
		}else{
			clazz = (Class<T>) genericTypes[0];
		}
		return clazz;
	}

}
