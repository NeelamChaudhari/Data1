package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{
 public static void main(String[] args) throws IOException 
 {

	 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("D:\\screenshot\\A.jpg");
	FileHandler.copy(source, destination);
	
}
}
