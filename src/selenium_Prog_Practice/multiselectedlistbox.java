package selenium_Prog_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectedlistbox 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    Thread.sleep(5000);
		driver.get("file:///D:/XYZ/Neha/selenium/Multiselected_ListBox/MultiselectableListbox.html");
	    WebElement month=driver.findElement(By.xpath("//select[@id='1234']"));
	     Select s1=new Select(month);
	     s1.selectByIndex(0);
	   //  s1.selectByValue("Pak");
	     s1.selectByVisibleText("Sri");
	     s1.selectByIndex(1);
	     s1.selectByIndex(2);
	  List<WebElement> s2=s1.getAllSelectedOptions();
	        for(WebElement s:s2)
	        {
	        	System.out.println(s.getText());
	        }
	
	}

}
