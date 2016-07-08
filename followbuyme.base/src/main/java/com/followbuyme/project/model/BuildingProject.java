/**
 * 
 */
package com.followbuyme.project.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.threemusketeers.followbuyme.base.model.Base;
import com.threemusketeers.followbuyme.document.model.Document;
import com.threemusketeers.followbuyme.person.model.BuildingContractor;
import com.threemusketeers.followbuyme.person.model.Customer;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProject.java
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
@Table(name = "BUILDING_PROJECT", catalog = "building")
public class BuildingProject extends Base{
	
	
	private static final long serialVersionUID = -4234258257522576484L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PROJECT_ID", unique = true, nullable = false)
	private Long id = null;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private BuildingContractor Constractor = null;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Customer> customers = null;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Document> documents = null;
	
	@Column(name = "PROJECT_NAME", unique = false, nullable = true, length = 40)
	private String projectName = null;
	
	
	
	public BuildingProject() {
		super();
	}

	public BuildingProject(BuildingContractor constractor,
			List<Customer> customers) {
		super();
		Constractor = constractor;
		this.customers = customers;
	}
	
	
	public BuildingContractor getConstractor() {
		return Constractor;
	}
	public void setConstractor(BuildingContractor constractor) {
		Constractor = constractor;
	}
	
	
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

    
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
