package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
