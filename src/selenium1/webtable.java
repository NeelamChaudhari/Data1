package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webtable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("file:///D:/XYZ/Neha/SeleniumProg_Sequencewise/WebTable/Table1.html");
	    //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    //Thread.sleep(2000);
	   //  driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
	 
	   //Thread.sleep(2000);
	  // driver.findElement(By.xpath("(//div[@class='xtXmba'])[10]']")).sendKeys("mobiles");
	WebElement str=driver.findElement(By.xpath("//table[@id='1234']//tr[2]"));
	String s1=str.getText();
	System.out.println(s1);
	   
	}

}
