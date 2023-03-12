package CreatePOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Create_POM_Using_TestNG.POM1_UN_PWS;
import Create_POM_Using_TestNG.POM2_PIN;
import Create_POM_Using_TestNG.User_ID_Verification;

public class Home_Page
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	
	
			System.setProperty("webdriver.chrome.driver","D:\\chromeFile\\chromedriver_win32\\chromedriver.exe\\");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com");
			
		
		
			driver.manage().window().maximize();
		
			POM1_UN_PWS UN_Pass=new POM1_UN_PWS(driver);
			UN_Pass.UN1();
		    UN_Pass.PSW1();
		    UN_Pass.Login();
		     Thread.sleep(5000);
		    POM2_PIN PIN=new POM2_PIN(driver);
		    PIN.continue1();
		    
		    Thread.sleep(5000);
		    
		    User_ID_Verification v=new  User_ID_Verification(driver);
		
		    v.Verification();
		    
}
}