package com.threemusketeers.followbuyme.contact.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	Address.java
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
@Table(name = "ADDRESS", catalog = "building")
public class Address extends Base{
	
	private static final long serialVersionUID = 2708914953422668418L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ADDRESS_ID", unique = true, nullable = false)
	private Long id = null;
	
    @Column(name = "STREET", unique = false, nullable = true, length = 50)
	private String street = null;
    
    @Column(name = "DISTRICT", unique = false, nullable = true, length = 10)
    private String district = null;
    
    @Column(name = "CITY", unique = false, nullable = true, length = 10)
    private String city = null;
    
    @Column(name = "POST_CODE", unique = false, nullable = true, length = 10)
    private String postcode = null;
    
    @Column(name = "COUNTRY", unique = false, nullable = true, length = 20)
    private String country = null;

    
    public Address() {
		super();
	}



	public Address (String street, String district, String city, String postcode, String country)
    {
        
        this.street = street;
        this.district = district;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }

    

    public String getStreet ()
    {
        return this.street;
    }
    
    
    public String getDistrict ()
    {
        return this.district;
    }
    
    
    public String getCity ()
    {
        return this.city;
    }
    
	public void setCity(String city) {
		this.city = city;
	}



	
    public String getPostcode ()
    {
        return this.postcode;
    }

    
	@Transient
    public String getFulladdress ()
    {
        return this.street + " " + this.district + " " + this.city + " " + this.postcode + " " + this.country;
    }


    
	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
