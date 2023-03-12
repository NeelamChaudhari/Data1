package selenium_Prog_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox
{
	public static void main(String[] args) throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    Thread.sleep(5000);
		    driver.get("https://www.facebook.com/");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neelam");
		  Thread.sleep(5000);
		 WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		  Select s1=new Select(month);
		  s1.selectByVisibleText("Feb");
		  s1.selectByValue("3");
		 s1.selectByIndex(0);
		 String s2=month.getText();
		 System.out.println(s2);
	
	   WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	   String s5=link.getText();
	   System.out.println(s5);
	   Dimension d1=new Dimension(200,400);
	   driver.manage().window().setSize(d1);
	 Dimension d2=  driver.manage().window().getSize();
	 System.out.println(d2);
	 String str=driver.getTitle();
	 System.out.println(str);
	 String str1=driver.getCurrentUrl();
	 System.out.println(str1);
	}

}
