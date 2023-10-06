package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerNametbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDesctbx;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBandtext;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustbtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement actualCustomer;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddNewBtn()
	{
		return addNewBtn;
	}
	
	public WebElement getNewCustomerbtn()
	{
		return newCustomerbtn;
	}
	
	public WebElement getCustomerNametbx()
	{
		return customerNametbx;
	}
	
	public WebElement getCustomerDesctbx()
	{
		return customerDesctbx;
	}
	
	public WebElement getSelectCustDD()
	{
		return selectCustDD;
	}

    public WebElement getBigBandtext()
    {
	return bigBandtext;
    }

    public WebElement getCreateCustbtn()
    {
	return createCustbtn;
    }

    public WebElement getActualCustomer()
   {
	return actualCustomer;
   }
   }
