package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassDragDrop
{
	public static void main(String[] args) 
	{
	        System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.get("https://demo.guru99.com/test/drag_drop.html");
		 WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
		 WebElement destination=driver.findElement(By.xpath("//ol[@id='amt8']"));
		 
		    Actions act=new Actions(driver);
		    act.dragAndDrop(source, destination).perform();
     }
}