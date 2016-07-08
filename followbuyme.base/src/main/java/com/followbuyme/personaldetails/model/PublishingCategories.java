/**
 * 
 */
package com.followbuyme.personaldetails.model;

/**
 * @author Yachin
 *
 */
public class PublishingCategories {
	
	private GenderEnum gender;
	private AgeRange ageRange;
	
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public AgeRange getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(AgeRange ageRange) {
		this.ageRange = ageRange;
	}
	
}
