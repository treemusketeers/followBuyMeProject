package com.threemusketeers.followbuyme.person.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.followbuyme.project.model.BuildingProject;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingContractor.java
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
@Table(name = "BUILDING_COTRACTOR", catalog = "building")
public class BuildingContractor extends Person{

	
	private static final long serialVersionUID = -7572869250951584751L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CONTRACTOR_ID", unique = true, nullable = false)
	private Long id = null;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<BuildingProject> projects = null;
	
	
	public BuildingContractor() {
		super();
	}

	public BuildingContractor(String surname, String firstname, ContactDetails contact) {
		super(surname, firstname, contact);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	

	public void setId(Long id) {
		this.id = id;
	}

	
	public List<BuildingProject> getProjects() {
		return projects;
	}

	public void setProjects(List<BuildingProject> projects) {
		this.projects = projects;
	}
	
	

}
