/**
 * 
 */
package com.followbuyme.event.model;

import com.followbuyme.location.Location;
import com.followbuyme.personaldetails.model.Category;

/**
 * @author Yachin
 *
 */
public class PubEvent {
	
	private Long id;
	private Long customerId;
	private Location location;
	private String message;
	private Object picture;
	private String category;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//private 
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getPicture() {
		return picture;
	}
	public void setPicture(Object picture) {
		this.picture = picture;
	}

}
