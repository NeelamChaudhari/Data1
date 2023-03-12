package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassKeyboardAction 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    WebElement dropdown=driver.findElement(By.id("month"));
	    Actions act=new Actions(driver);
	    act.click(dropdown).perform();
	    act.sendKeys(Keys.ARROW_UP).perform();
	    act.sendKeys(Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.HOME).perform();
	    act.sendKeys(Keys.END).perform();
	    
	    for(int i=1;i<=4;i++)
	    {
	    	act.sendKeys(Keys.ARROW_UP).perform();
	    }
	   
	    act.sendKeys(Keys.ENTER).perform();
	  }
}
