/**
 * 
 */
package com.followbuyme.customer.model;

import java.util.List;

import com.followbuyme.personaldetails.model.Address;
import com.followbuyme.personaldetails.model.Category;
import com.followbuyme.personaldetails.model.OpenningHours;
import com.followbuyme.personaldetails.model.PublishingCategories;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;

/**
 * @author Yachin
 *
 */
public class BusinessCustomer {
	
	private Long id;
	private String compenyName;
	private String email;
	private Address address;
	private List<Category> categories;
	private List<OpenningHours> openningHours;
	private String compenyLogo;
	private String productImage;
	private String exactLocation;
	private PublishingCategories publishingCategories;
	private ContactDetails contactDetails;
	private String companyPhone;
	public String getCompenyName() {
		return compenyName;
	}
	public void setCompenyName(String compenyName) {
		this.compenyName = compenyName;
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
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<OpenningHours> getOpenningHours() {
		return openningHours;
	}
	public void setOpenningHours(List<OpenningHours> openningHours) {
		this.openningHours = openningHours;
	}
	public String getCompenyLogo() {
		return compenyLogo;
	}
	public void setCompenyLogo(String compenyLogo) {
		this.compenyLogo = compenyLogo;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getExactLocation() {
		return exactLocation;
	}
	public void setExactLocation(String exactLocation) {
		this.exactLocation = exactLocation;
	}
	public PublishingCategories getPublishingCategories() {
		return publishingCategories;
	}
	public void setPublishingCategories(PublishingCategories publishingCategories) {
		this.publishingCategories = publishingCategories;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
