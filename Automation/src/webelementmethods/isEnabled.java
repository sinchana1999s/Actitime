package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean res=driver.findElement(By.xpath("//div[text()='Lo gin']/..")).isEnabled();
		if(res)
		{
			System.out.println("login button is enabled");
			
		}
		else
		{
			System.out.println("login button is not enabled");
		}
	}
}
				
		
		
	

