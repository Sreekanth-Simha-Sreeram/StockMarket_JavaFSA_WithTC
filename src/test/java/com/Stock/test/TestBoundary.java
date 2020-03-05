package com.Stock.test;

	import static org.junit.Assert.assertNotEquals;
	import static org.junit.Assert.assertNotNull;
	import static org.junit.Assert.assertNull;

	import java.util.ArrayList;

	import org.junit.Test;

	import com.Stock.Entities.Company;
	import com.Stock.Entities.IPODetails;
	import com.Stock.Entities.User;



	public class TestBoundary {
	//password word length must be 10
	    @Test
	    public void testpasswordLength()
	    {
	        User user=new User();
	        user.setUserId(12);
	        user.setUserName("james");
	        user.setUserMobileNumber(1234567890);
	        user.setUserEmail("james@gmail.com");
	        user.setUserType("admin");
	        user.setUserPassWord("hello@456");


	        int passwordLength=10;
	assertNotEquals(passwordLength,user.getUserPassWord().length());


	    }

	    //email should not be null
	    @Test
	    public void testEmail()
	    {
	        User user=new User();
	        user.setUserId(12);
	        user.setUserName("james");
	        user.setUserMobileNumber(1234567890);
	        user.setUserEmail("james@gmail.com");
	        user.setUserType("admin");
	        user.setUserPassWord("hello@456");

	        assertNotNull(user.getUserEmail());


	    }
	    //pricepershare should not be null
	    @Test
	    public void testIPOPriceperShare()
	    {
	        IPODetails ip=new IPODetails();
	        ip.setIpocompanyName("iiht");
	        ip.setIpoId(12);
	        ip.setIpoTotalNumberOfShares(4);
	        assertNotNull(ip.getIpoPricePerShare());

	    }

	    // number of shares should not be null
	    @Test
	    public void testIPONumberOfShare()
	    {
	        IPODetails ip=new IPODetails();
	        ip.setIpocompanyName("iiht");
	        ip.setIpoId(12);
	        ip.setIpoTotalNumberOfShares(4);
	        assertNotNull(ip.getIpoTotalNumberOfShares());

	    }

	    //company turnover should not be null
	    @Test
	    public void testCompanyTurnover()
	    {
	        Company company=new Company();
	        company.setCompanyCEO("alexa");
	        company.setCompanyName("iiht");
	        company.setCompanySector("it");
	        company.setCompanyBriefWriteUp("open work");
	        company.setCompanyTurnover(120000);
	        assertNotNull(company.getCompanyTurnover());
	    }

	} 

