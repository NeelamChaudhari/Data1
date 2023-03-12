package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath1
{
    public static void main(String[] args) throws InterruptedException 
    {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Amazon.com");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles phone");
	     Thread.sleep(5000);
	   //  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles phone");
	    // Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	     Thread.sleep(2000);
	     WebElement str= driver.findElement(By.xpath("((//div[@class='a-section'])[1]//span)[11]"));
	    String s3=str.getText();
	    System.out.println(s3);
    
    }
}
