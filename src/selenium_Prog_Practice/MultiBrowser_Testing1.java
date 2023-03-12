package selenium_Prog_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing1
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equals("FireFox"))
		{
			  System.setProperty("webdriver.chrome.driver","D:\\gecho\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			   driver=new FirefoxDriver();
			   
		}
		else if(browserName.equals("Chrome"))
		{
			  System.setProperty("webdriver.gecho.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
			
			   driver=new ChromeDriver();
			
		}
		driver.get("http://www.flipkart.com");
		
	}

}
