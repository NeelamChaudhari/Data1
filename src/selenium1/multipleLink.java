package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLink
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     List<WebElement> list=driver.findElements(By.xpath("//a"));
	     for(WebElement l1:list)
	     {
	    	 System.out.println(l1.getText());
	     }
	     
	}

}
