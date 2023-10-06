package handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sinch/OneDrive/Desktop/Hotel.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrlistbox);
		 s.selectByIndex(0);
		 s.selectByValue("v");
		 s.deselectByVisibleText("dose");
		 s.deselectByIndex(2);
		 s.deselectByValue("d");
		 s.deselectByVisibleText("idly");
		 System.out.println(s.isMultiple());	 
		 
	}
	}


