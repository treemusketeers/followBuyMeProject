/**
 * 
 */
package com.followbuyme.personaldetails.model;

import java.util.List;

/**
 * @author Yachin
 *
 */
public class Category {
	String name;
	List<String> subNames;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubNames() {
		return subNames;
	}
	public void setSubNames(List<String> subNames) {
		this.subNames = subNames;
	}
}
