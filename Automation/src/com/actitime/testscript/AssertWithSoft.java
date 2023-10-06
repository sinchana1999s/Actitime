package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertWithSoft 
{
	public void verifyTitle()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "soogle";
	String aTitle = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(aTitle, eTitle);
	driver.close();
	s.assertAll();
	}
			

}
