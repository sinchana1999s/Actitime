package upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		Demo1.testA(driver);
		WebDriver driver1=new FirefoxDriver();
		Demo1.testA(driver1);
		
	}

}
