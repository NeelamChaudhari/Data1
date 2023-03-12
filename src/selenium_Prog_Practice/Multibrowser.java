package selenium_Prog_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser
{    
	WebDriver driver=null;
      
	  @Parameters("BrowserName")
      @Test
        public void brows1(String browserName) throws InterruptedException
        {
		//WebDriver driver=null;
   
	   if(browserName.equalsIgnoreCase("chrome"))
	   {
	   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	    Thread.sleep(5000);
	   }
	  else if(browserName.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecho.driver","D:\\gecho\\geckodriver-v0.32.2-win32\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    Thread.sleep(5000);
	   
	}
	driver.get("https://www.flipkart.com");
}
}