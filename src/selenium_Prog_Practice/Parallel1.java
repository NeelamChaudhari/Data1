package selenium_Prog_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1
{
	@Test
	public void TC1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    Thread.sleep(5000);
	    driver.get("https://www.facebook.com");
	    
	}

}
