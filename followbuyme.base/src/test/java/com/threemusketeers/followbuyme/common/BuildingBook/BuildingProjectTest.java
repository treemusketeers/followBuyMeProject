/**
 * 
 */
package com.threemusketeers.followbuyme.common.BuildingBook;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.followbuyme.project.model.BuildingProject;
import com.threemusketeers.followbuyme.contact.model.Address;
import com.threemusketeers.followbuyme.contact.model.ContactDetails;
import com.threemusketeers.followbuyme.contact.model.Phone;
import com.threemusketeers.followbuyme.document.enumeration.DocumentType;
import com.threemusketeers.followbuyme.document.model.Document;
import com.threemusketeers.followbuyme.person.model.BuildingContractor;
import com.threemusketeers.followbuyme.person.model.Customer;
import com.threemusketeers.followbuyme.project.bo.BuildingProjectBO;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProjectTest.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	15 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
public class BuildingProjectTest {

	
	@Autowired
	private BuildingProjectBO projectBO;
	
	//@Autowired
	//private BuildingProjectDAO projectDAO;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl#create(com.threemusketeers.followbuyme.base.model.Base)}.
	 */
	//@Test
	//@Transactional
	public void testCreate() {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		BuildingProjectBO projectBO = (BuildingProjectBO)appContext.getBean("buildingProjectBO");
		
		ContactDetails contact = createContactDetails("052", "2484935", "972", "שמואל תמיר", "", "ירושלים", "972856", "ישראל", "yachin.elul@gmail.com");
		
		BuildingContractor contractor = new BuildingContractor("אלול", "יכין", contact);
		
		contact = createContactDetails("053", "2480005", "972", "שמואל נחשון", "", "ירושלים", "972856", "ישראל", "amos.levi@gmail.com");
		
		Customer customer = new Customer("לוי", "עמוס", contact);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		
		BuildingProject project = new BuildingProject(contractor, customers);
		
		try {
			projectBO.create(project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//fail("Not yet implemented");
	}
	
	//@Test
	//@Transactional
	public void addDocument() {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		BuildingProjectBO projectBO = (BuildingProjectBO)appContext.getBean("buildingProjectBO");
		
		ContactDetails contact = createContactDetails("052", "2484935", "972", "שמואל תמיר", "", "ירושלים", "972856", "ישראל", "yachin.elul@gmail.com");
		
		BuildingContractor contractor = new BuildingContractor("אלול", "יכין", contact);
		
		contact = createContactDetails("053", "2480005", "972", "שמואל נחשון", "", "ירושלים", "972856", "ישראל", "amos.levi@gmail.com");
		
		Customer customer = new Customer("לוי", "עמוס", contact);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		
		BuildingProject project = new BuildingProject(contractor, customers);
		
		try {
			projectBO.create(project);
			Resource resource = appContext.getResource("file:c:\\Users\\Yachin\\audi.jpg");
			Document document = new Document("schema",DocumentType.JPG,resource.getInputStream());
			projectBO.addDocument(document, project);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl#update(com.threemusketeers.followbuyme.base.model.Base)}.
	 */
	//@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl#delete(com.threemusketeers.followbuyme.base.model.Base)}.
	 */
	//@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl#retrieveById(java.lang.Long)}.
	 */
	//@Test
	public void testRetrieveById() {
		fail("Not yet implemented");
	}

	private ContactDetails createContactDetails(String prefix, String number, String internationalAreaCode,String street, String district, String city, String postcode, String country, String email){
		Phone phone = new Phone(prefix,number,internationalAreaCode);
		Address address = new Address(street, district, city, postcode, country);
		ContactDetails contact = new ContactDetails(phone, email, address);
		return contact;
	}
	
	private Customer createCustomer(String prefix, String number, String internationalAreaCode,String street, String district, String city, String postcode, String country, String email,String surname, String firstname){
		Phone phone = new Phone(prefix,number,internationalAreaCode);
		Address address = new Address(street, district, city, postcode, country);
		ContactDetails contact = new ContactDetails(phone, email, address);
		Customer customer = new Customer(surname, firstname, contact);
		return customer;
	}

}
