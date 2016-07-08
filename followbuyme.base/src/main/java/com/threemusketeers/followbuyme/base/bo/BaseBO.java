package com.threemusketeers.followbuyme.base.bo;

import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	BaseBO.java
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
public interface BaseBO<T extends Base> {
	
	public void create(T input) throws Exception;
	public T update(T input) throws Exception;
	public void delete(Long id,Class<?> clazz) throws Exception;
	public T retrieveById(Long id) throws Exception;
	
}
