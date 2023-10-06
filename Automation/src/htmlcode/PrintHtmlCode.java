package htmlcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlCode
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.google.com/");
		String htmlcode = driver.getPageSource();
		System.out.println(htmlcode);
		driver.quit();
	
		
		
	}

}
