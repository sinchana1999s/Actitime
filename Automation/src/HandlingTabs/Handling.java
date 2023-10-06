package HandlingTabs;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handling {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String>allWh=driver.getWindowHandles();
		int count=allWh.size();
		System.out.println(count);
		for(String wh:allWh) {
			System.out.println(wh);
		}
			driver.quit();
	}
}
