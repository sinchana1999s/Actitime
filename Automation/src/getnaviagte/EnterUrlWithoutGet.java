package getnaviagte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlWithoutGet
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.gmail.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.quit();
	}
	
	
	
		
	}


