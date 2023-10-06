package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule 
{
	@Test(priority=1,invocationCount=3)
	public void createcustomer()
	{
		Reporter.log("createcustomer",true);
	}
	@Test(priority=2,dependsOnMethods="createcustomer")
	public void modifycustomer()
	{
		Reporter.log("modifycustomer",true);
		
	}
	@Test(priority=3,dependsOnMethods={"createcustomer","modifycustomer"})
	public void deletecustomer()
	{
		Reporter.log("deletecustomer",true);
	}
	}
	


