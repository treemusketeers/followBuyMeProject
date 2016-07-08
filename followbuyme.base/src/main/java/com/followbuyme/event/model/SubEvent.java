/**
 * 
 */
package com.followbuyme.event.model;

import com.followbuyme.location.Location;
import com.followbuyme.personaldetails.model.Category;
import com.followbuyme.personaldetails.model.LifeCycle;
import com.followbuyme.personaldetails.model.Ranking;

/**
 * @author Yachin
 *
 */
public class SubEvent {
	
	private Long id;
	private Long pubReqId;
	private String pubNickName;
	private String message;
	private Object picture;
	private Category ctegory;
	private Ranking pubRanking;
	private Location location;
	private LifeCycle lifeCycle;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPubReqId() {
		return pubReqId;
	}
	public void setPubReqId(Long pubReqId) {
		this.pubReqId = pubReqId;
	}
	public String getPubNickName() {
		return pubNickName;
	}
	public void setPubNickName(String pubNickName) {
		this.pubNickName = pubNickName;
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
	public Category getCtegory() {
		return ctegory;
	}
	public void setCtegory(Category ctegory) {
		this.ctegory = ctegory;
	}
	public Ranking getPubRanking() {
		return pubRanking;
	}
	public void setPubRanking(Ranking pubRanking) {
		this.pubRanking = pubRanking;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
