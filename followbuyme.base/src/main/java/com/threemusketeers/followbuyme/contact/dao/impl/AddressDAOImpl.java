/**
 * 
 */
package com.threemusketeers.followbuyme.contact.dao.impl;

import org.springframework.stereotype.Repository;

import com.threemusketeers.followbuyme.base.dao.impl.BaseDAOImpl;
import com.threemusketeers.followbuyme.contact.dao.AddressDAO;
import com.threemusketeers.followbuyme.contact.model.Address;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProjectDAOImpl.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	15 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
@Repository("addressDAO")
public class AddressDAOImpl extends BaseDAOImpl<Address> implements AddressDAO {

	
}
