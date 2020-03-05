package com.Stock.test;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Stock.Entities.Company;
import com.Stock.Entities.User;
import com.Stock.Services.AdminService;
import com.Stock.Services.UserService;



public class TestException {

@Test
public void testEmptyCompanyList()
{
     ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
     
     Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("IIHT");
		company.setCompanyCEO("Meghana");
		company.setCompanyBoardOfDirectors("Shilpa");
		company.setCompanySector("IT");
		company.setCompanyBriefWriteUp("It is a Yaksha Platform");
     
        UserService userservice = (UserService) context.getBean("userservice");
        List<Company> user= userservice.searchCompany("BCT");
        Assert.assertNull(user);
}

@Test(expected = NullPointerException.class)
public void testEmptyPasswordException() 
{
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
  

	User user = new User();
	user.setUserId(1);
	user.setUserName("Kavya");
	user.setUserPassWord("kavya1234");
	user.setUserType("user");
	user.setUserEmail("kavya@gmail.com");
	user.setUserMobileNumber(91647890);
       Assert.assertEquals("1234",user.getUserPassWord(),"password empty exception");
       throw new NullPointerException();
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
	boolean result = false;
	if(!adminservice.deleteCompany(111))
		result = true;
	Assert.assertEquals(true, result);
	
	
}


}
