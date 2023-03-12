package selenium1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassMouse 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    WebElement dropdown=driver.findElement(By.id("month"));
    Actions act=new Actions(driver);
    act.moveToElement(dropdown).perform();
    act.doubleClick(dropdown).perform();
    act.click(dropdown).perform();
    Thread.sleep(2000);
    act.contextClick(dropdown).perform();
    
    
  }
}