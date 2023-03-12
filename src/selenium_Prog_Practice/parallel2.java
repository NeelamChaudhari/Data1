package selenium_Prog_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 
{
	@Test()
	public void TC2() throws InterruptedException
	{ 
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    Thread.sleep(5000);
    driver.get("https://www.Amazon.com");

     }
}