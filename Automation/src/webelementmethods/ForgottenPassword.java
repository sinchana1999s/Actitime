package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPassword 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String value = link.getAttribute("href");
	System.out.println(value);
	driver.quit();	
}
}

