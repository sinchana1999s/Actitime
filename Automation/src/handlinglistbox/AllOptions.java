package handlinglistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sinch/OneDrive/Desktop/Hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			
			System.out.println(text);
		}
			driver.quit();
		}
		
		
	}


