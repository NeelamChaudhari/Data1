package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenB
{
  public static void main(String[] args) 
  {
	 System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().window().minimize();
     Point P=new Point(200,400);
     driver.manage().window().setPosition(P);
     
     Point p2=driver.manage().window().getPosition();
     System.out.println(p2);
     Dimension d1=new Dimension(100,200);
     driver.manage().window().setSize(d1);
     Dimension d2=driver.manage().window().getSize();
     System.out.println(d2);
     driver.navigate().to("https://www.facebook.com/");
     driver.navigate().forward();
     
     driver.navigate().back();
      
     
     

     
     
     
  }
}
