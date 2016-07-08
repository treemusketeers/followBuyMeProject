/**
 * 
 */
package com.threemusketeers.followbuyme.contact.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	Phone.java
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
@Table(name = "PHONE", catalog = "building")
public class Phone extends Base{
	
	
	private static final long serialVersionUID = -41617131244351503L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PHONE_ID", unique = true, nullable = false)
	private Long id = null;
	
	@Column(name = "PREFIX", unique = false, nullable = false, length = 3)
	private String prefix = null;
	
	@Column(name = "NUMBER", unique = false, nullable = false, length = 7)
	private String number = null;
	
	@Column(name = "INTERNATIONAL_AREA_CODE", unique = false, nullable = true, length = 3)
	private String internationalAreaCode = null;
	
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Phone(String prefix, String number, String internationalAreaCode) {
		super();
		this.prefix = prefix;
		this.number = number;
		this.internationalAreaCode = internationalAreaCode;
	}


    
	public String getPrefix() {
		return prefix;
	}



	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


    
	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}


    
	public String getInternationalAreaCode() {
		return internationalAreaCode;
	}



	public void setInternationalAreaCode(String internationalAreaCode) {
		this.internationalAreaCode = internationalAreaCode;
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
