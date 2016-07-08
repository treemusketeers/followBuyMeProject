/**
 * 
 */
package com.threemusketeers.followbuyme.person.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.threemusketeers.followbuyme.contact.model.ContactDetails;

/**
 * -------------------------------------------------
 * @ClassName:	Customer.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	13 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
@Entity
@Table(name = "CUSTOMER", catalog = "building")
public class Customer extends Person {

	
	private static final long serialVersionUID = 2237714331722853084L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false)
	private Long id = null;
	
	public Customer() {
		super();
	}

	public Customer(String surname, String firstname, ContactDetails contact) {
		super(surname, firstname, contact);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
