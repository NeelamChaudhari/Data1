package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe
{
  public static void main(String[] args) throws InterruptedException
  {

		 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	     driver.switchTo().frame("iframeResult");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type='button']")).click();
	     driver.switchTo().defaultContent();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	     
	     
	     
	     
}
}
