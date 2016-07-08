/**
 * 
 */
package com.threemusketeers.followbuyme.contact.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl;
import com.threemusketeers.followbuyme.contact.bo.AddressBO;
import com.threemusketeers.followbuyme.contact.dao.AddressDAO;
import com.threemusketeers.followbuyme.contact.model.Address;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProjectBOImpl.java
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
@Component("addressBO")
//@Service("stockBo")
public class AddressBOImpl extends BaseBOImpl<Address> implements AddressBO{

	@Autowired
	AddressDAO addressDAO;
	
}
