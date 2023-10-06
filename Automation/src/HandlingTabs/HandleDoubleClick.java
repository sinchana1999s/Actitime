package HandlingTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDoubleClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.doubleClick(target).perform();
		
				
		
	}

}
