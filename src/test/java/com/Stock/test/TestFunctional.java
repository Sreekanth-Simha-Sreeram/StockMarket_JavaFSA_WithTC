package com.Stock.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;
import com.Stock.Entities.User;
import com.Stock.Services.AdminService;
import com.Stock.Services.LoginService;
import com.Stock.Services.UserService;


import junit.framework.Assert;

public class TestFunctional {
	
	@Test
	public void testCreateCompany()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Chetana");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		AdminService adminservice = (AdminService) context.getBean("adminService");
		adminservice.createCompany(company);
		company = adminservice.findCompany(1);
		String companyName="IIHT";
		Assert.assertEquals(companyName,adminservice.findCompany(1));
	}
	
	@Test
	public void testeditCompany()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Company company = new Company();

		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		AdminService adminservice=(AdminService) context.getBean("adminService");
		company =adminservice.editCompany("IIHT",1);
		assertNotNull(company);
		
		
	}
	
	@Test
	public void testviewCompany()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Company company = new Company();
		
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		AdminService adminservice=(AdminService) context.getBean("adminService");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<Company> companyList=new ArrayList<Company>();
		companyList=adminservice.viewCompany(company);
	
	}

	@Test
	public void testUpdateIPODetails()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		IPODetails ipoDetails = new IPODetails();

		ipoDetails.setIpoId(1);
		ipoDetails.setIpocompanyName("IIHT");
		ipoDetails.setIpoPricePerShare(2);
		ipoDetails.setIpoTotalNumberOfShares(3);
		
		AdminService adminservice=(AdminService) context.getBean("adminService");
		ipoDetails =adminservice.updateIPODetails(1);
		assertNotNull(ipoDetails);

	
	}
	
	public void testUpdateProfile()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUserName("Kavya");
		user.setUserPassWord("kavya1234");
		user.setUserType("user");
		user.setUserEmail("kavya@gmail.com");
		user.setUserMobileNumber(91647890);
		
		UserService userservice=(UserService) context.getBean("userservice");
		user =userservice.updateProfile(1);
		assertNotNull(user);

	
	}
	
	public void testSearchCompany() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		UserService userservice=(UserService) context.getBean("userservice");
		List Company = userservice.searchCompany("IIHT");
		Assert.assertNotNull(company);
	}
	
	@Test
	public void testDeleteCompany() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		
		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		AdminService adminservice=(AdminService) context.getBean("adminService");
		boolean isdeleted = adminservice.deleteCompany(company.getCompanyId());
		assertEquals("1",isdeleted,"should deleted from db");
	}
	
	@Test
	public void testGetCompany() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
		
		AdminService adminservice=(AdminService) context.getBean("adminService");
		Company companyfromdb = adminservice.getCompany(company.getCompanyName(),company.getCompanyId());
		assertEquals(company,companyfromdb);
	}
	

	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");

		User user = new User();
		user.setUserId(1);
		user.setUserName("Kavya");
		user.setUserPassWord("kavya1234");
		user.setUserType("user");
		user.setUserEmail("kavya@gmail.com");
		user.setUserMobileNumber(91647890);
		
		
		LoginService loginservice=(LoginService) context.getBean("loginService");
		loginservice.signUp(user);
		boolean userfromdb =loginservice.signUp(user);
		assertSame(user,userfromdb);
	}
	
	@Test
	public void testSignIn()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");

		User user = new User();
		
		user.setUserName("Kavya");
		user.setUserPassWord("kavya1234");
		user.setUserType("user");
		user.setUserEmail("kavya@gmail.com");
		user.setUserMobileNumber(91647890);
		
		LoginService loginservice=(LoginService) context.getBean("loginService");
		loginservice.signIn(user.getUserName(),user.getUserPassWord());
		boolean userfromdb =loginservice.signIn(user.getUserName(),user.getUserPassWord());
		assertSame(true,userfromdb);
	}
	
}
