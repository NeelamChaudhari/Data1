package Create_POM_Using_TestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseClass 
{

	public  WebDriver driver;
	@Test
  public void InitializeBrowser()
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
    driver=new ChromeDriver();
   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 //   driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com");
	
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.manage().window().maximize();

}
}