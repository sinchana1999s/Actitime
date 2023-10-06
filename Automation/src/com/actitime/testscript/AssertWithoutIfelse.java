package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertWithoutIfelse 
{
	@Test
	public void veriftTitle()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "soogle";
	String aTitle = driver.getTitle();
	Assert.assertEquals(aTitle,eTitle);
	driver.quit();
	}

}
