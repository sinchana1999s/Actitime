package handlinglistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sinch/OneDrive/Desktop/Hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		WebElement fsoption = s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text = fsoption.getText();
		Thread.sleep(2000);
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
