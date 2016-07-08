/**
 * 
 */
package com.followbuyme.customer.model;

import com.followbuyme.personaldetails.model.Interests;
import com.followbuyme.personaldetails.model.PersonalDetails;
import com.followbuyme.personaldetails.model.SubModeEnum;


public class Customer {
	
	private Long id;
	
	private PersonalDetails privateDetails;
	private Interests interests;
	private SubModeEnum subMode;
	private int range;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PersonalDetails getPrivateDetails() {
		return privateDetails;
	}
	public void setPrivateDetails(PersonalDetails privateDetails) {
		this.privateDetails = privateDetails;
	}
	public Interests getInterests() {
		return interests;
	}
	public void setInterests(Interests interests) {
		this.interests = interests;
	}
	public SubModeEnum getSubMode() {
		return subMode;
	}
	public void setSubMode(SubModeEnum subMode) {
		this.subMode = subMode;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
	
}