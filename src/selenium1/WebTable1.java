package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 
{
     public static void main(String[] args) throws InterruptedException 
     {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///D:/XYZ/Neha/SeleniumProg_Sequencewise/WebTable/Table1.html");
	     
			
	     Thread.sleep(5000);
	   WebElement link=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[3]"));
	   String str=link.getText();
	   System.out.println(str);
	     
	}
}
