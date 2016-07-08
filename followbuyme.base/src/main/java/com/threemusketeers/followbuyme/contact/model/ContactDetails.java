/**
 * 
 */
package com.threemusketeers.followbuyme.contact.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	ContactDetails.java
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
@Table(name = "CONTACT_DETAILS", catalog = "building")
public class ContactDetails extends Base{
	
	
	public ContactDetails() {
		super();
	}

	private static final long serialVersionUID = -3753560826699367627L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id = null;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Phone> phones = null;
	
	@Column(name = "EMAIL", unique = false, nullable = true, length = 30)
	private String email = null;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address = null;
	
	public ContactDetails(Phone phone, String email, Address address) {
		super();
		phones = new ArrayList<Phone>();
		phones.add(phone);
		this.email = email;
		this.address = address;
	}
	
	public ContactDetails(List<Phone> phones, String email, Address address) {
		super();
		this.phones = phones;
		this.email = email;
		this.address = address;
	}
	
	
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	

}
