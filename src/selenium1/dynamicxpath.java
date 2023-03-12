package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicxpath
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
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	     Thread.sleep(2000);
	     WebElement str= driver.findElement(By.xpath(" /html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]"));
	     String s1=str.getText();
	     System.out.println(s1);
	     Thread.sleep(2000);
	     WebElement str1= driver.findElement(By.xpath(" /html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[2]/span[2]/span/span[3]"));
	     String s2=str.getText();
	     System.out.println(s2);
	     
	     
	  WebElement str3=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
	  String str4=str3.getText();
	  System.out.println(str4);
	}
}
