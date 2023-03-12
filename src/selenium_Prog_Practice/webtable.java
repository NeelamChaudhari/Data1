package selenium_Prog_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable
{
  public static void main(String[] args) throws InterruptedException
  {
	     System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  
	    driver.get("file:///D:/XYZ/Neha/selenium/SeleniumProg_Sequencewise/WebTable/Table1.html");
	     Thread.sleep(5000);
	     
	 WebElement  list =driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]"));
	 String s1=list.getText();
	 System.out.println(s1);
	 
	 
	    
}
}