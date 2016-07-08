/**
 * 
 */
package com.threemusketeers.followbuyme.person.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.threemusketeers.followbuyme.base.model.Base;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;

/**
 * -------------------------------------------------
 * @ClassName:	Person.java
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
@MappedSuperclass
public abstract class Person extends Base{
	
	
	private static final long serialVersionUID = -8532189565707424967L;
	
	@Column(name = "SURNAME", unique = false, nullable = true, length = 30)
	private String surname = null;
	
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 30)
    private String firstname = null;
	
	@OneToOne(cascade = CascadeType.ALL)
    private ContactDetails contact = null;
    

    
    public Person() {
		super();
	}

	public Person(String surname, String firstname, ContactDetails contact) {
		super();
		this.surname = surname;
		this.firstname = firstname;
		this.contact = contact;
	}

    
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}

    
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	public ContactDetails getContact() {
		return contact;
	}


	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}

	@Transient
	public String getFullname ()
    {
        return this.firstname + " " + this.surname;
    }
}
