/**
 * 
 */
package com.followbuyme.personaldetails.model;

import java.util.List;

/**
 * @author Yachin
 *
 */
public class OpenningHours {
	
	private String day;
	private List<HourRange> hours;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public List<HourRange> getHours() {
		return hours;
	}
	public void setHours(List<HourRange> hours) {
		this.hours = hours;
	}

	
}
