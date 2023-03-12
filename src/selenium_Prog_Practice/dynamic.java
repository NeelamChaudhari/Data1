package selenium_Prog_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic
{
	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		  
		    driver.get("https://www.flipkart.com");
		     Thread.sleep(5000);
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		     driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles"); 
		     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		     Thread.sleep(2000);
		    WebElement l= driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
		    String str=l.getText();
		    System.out.println(str);
		     
	}

}
