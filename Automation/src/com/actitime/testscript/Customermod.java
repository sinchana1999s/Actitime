package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class Customermod extends BaseClass
{
	
	@Test
	public void createcustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("createcustomer",true);	
	
		FileLib f=new FileLib();
	    String CustomerName = f.getExcelData("createcustomer", 1,2);
	    String CustomerDesc = f.getExcelData("createcustomer",1,3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		Thread.sleep(3000);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(3000);
		t.getNewCustomerbtn().click();
		Thread.sleep(3000);
		t.getCustomerNametbx().sendKeys(CustomerName);
		Thread.sleep(3000);
		t.getCustomerDesctbx().sendKeys(CustomerDesc);
		Thread.sleep(3000);
		t.getSelectCustDD().click();
		Thread.sleep(3000);
		t.getBigBandtext().click();
		Thread.sleep(3000);
		t.getCreateCustbtn().click();
		Thread.sleep(3000);
		String actualCustomerText = t.getActualCustomer().getText();
		Assert.assertEquals(actualCustomerText, CustomerName);
		
	}
}
		
	
	



