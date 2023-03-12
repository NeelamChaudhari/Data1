package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_Selenium 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    Thread.sleep(5000);
    //driver.findElement(null)
    WebElement str=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[4]"));
    String s1=str.getText();
    System.out.println(s1);
    
   }
}