/**
 * 
 */
package com.threemusketeers.followbuyme.contact.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl;
import com.threemusketeers.followbuyme.contact.bo.ContactDetailsBO;
import com.threemusketeers.followbuyme.contact.dao.ContactDetailsDAO;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;
import com.threemusketeers.followbuyme.project.dao.BuildingProjectDAO;

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
@Component("contactDetailsBO")
//@Service("stockBo")
public class ContactDetilsBOImpl extends BaseBOImpl<ContactDetails> implements ContactDetailsBO{

	@Autowired
	ContactDetailsDAO contactDetailsDAO;
	
}
