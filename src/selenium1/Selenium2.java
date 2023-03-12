package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 
{


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chaudhari");
	  	 boolean w=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).isDisplayed();
	  	 System.out.println(w);
	  	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  	 
	  	 
	  	 
	 
	 
	}

}
