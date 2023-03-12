package selenium_Prog_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{
   public static void main(String[] args) throws InterruptedException, IOException 
   {

		
	   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	  Thread.sleep(5000);
	  //  driver.get("https://www.amazon.in");
	
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Thread.sleep(2000);
	    File destination=new File("D:\\XYZ\\newscreenshot\\A.jpg");
	    FileHandler.copy(source, destination);
	    
	    }
}
