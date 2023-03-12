package testng_Series;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngProg1 
{
	@BeforeSuite()
	public void suite1()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	@BeforeTest()
	public void test()
	{
		Reporter.log("Suite Execution before execution of all test cases",true);
	}
	@BeforeClass()
	public void class1()
	{
		Reporter.log("browser Open",true);
	}
	@BeforeMethod()
	public void m1()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	@Test(invocationCount=1)
	public void  TC1()
	{
		
		Reporter.log("Execute first Prog of testng TC1",true);
	}
	@Test(priority=0)
	public void  TC2()
	{
		
		Reporter.log("Execute first Prog of testng TC2",true);
	}
	@Test(priority=-1)
	public void  TC3()
	{
		
		Reporter.log("Execute first Prog of testng TC3",true);
	}
	@Test
	public void  Login()
	{
		Assert.fail();
		
		Reporter.log("Execute first Prog of testng LogIn",true);
	}
	@Test(dependsOnMethods="Login")
	public void  LogOut()
	{
		
		Reporter.log("Execute first Prog of testng Logout",true);
	}
	@Test(enabled=false)
	public void  TC4()
	{
		
		Reporter.log("Execute first Prog of testng TC3",true);
	}
	@AfterMethod()
	public void m2()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	@AfterClass()
	public void m3()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	@AfterTest()
	public void m6()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	@AfterSuite()
	public void m9()
	{
		Reporter.log("Suite Execution separate url to execute test cases",true);
	}
	
	
}
