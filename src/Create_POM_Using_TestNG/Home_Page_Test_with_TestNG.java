package Create_POM_Using_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page_Test_with_TestNG extends BaseClass
{
	POM1_UN_PWS P1;
	POM2_PIN P2;
	User_ID_Verification P3;
@BeforeClass()
public void OpenBrowser()
{
	 P1=new  POM1_UN_PWS (driver);
	 P2=new POM2_PIN(driver);
	 P3=new User_ID_Verification(driver);
	
}
@BeforeMethod()
public void OpenApp()
{
 P1.UN1();
}
@Test()
public void VerifiedTest()
{
	
}
@AfterMethod()
public void CloseApp()
{
	
}
@AfterClass()
public void closebrowser()
{
	
}
}
