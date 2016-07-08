/**
 * 
 */
package com.threemusketeers.followbuyme.base.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.threemusketeers.followbuyme.base.bo.BaseBO;
import com.threemusketeers.followbuyme.base.dao.BaseDAO;
import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	BaseBOImpl.java
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
public abstract class BaseBOImpl<T extends Base> implements BaseBO<T>{

	@Autowired
	BaseDAO<T> baseDao;
	//@Override
	public void create(T input) throws Exception{
		baseDao.create(input);
	}
	//@Override
	public T update(T input) throws Exception{
		//return baseDao.update(input);;
		return null;
	}
	//@Override
	public void delete(Long id,Class<?> clazz) throws Exception{
		
	}
	//@Override
	public T retrieveById(Long id) throws Exception{
		return baseDao.retrieveById(id);
	}

}
