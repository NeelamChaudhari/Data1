package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	    driver.get("file:///D:/XYZ/Neha/selenium/Multiselected_ListBox/MultiselectableListbox.html");
	    WebElement Multiselectable=driver.findElement(By.xpath("//select[@id='1234']"));
	     Select s1=new Select(Multiselectable);
	     s1.selectByVisibleText("Sri");
	     
	     s1.selectByIndex(0);
	    List< WebElement> c1=s1.getAllSelectedOptions();
	    for(WebElement c2:c1)
	    {
	    	System.out.println(c2.getText());
	    }
	     
	 }
}
