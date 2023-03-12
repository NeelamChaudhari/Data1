package testng_Series;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngProg2 
{
	@Test(enabled=false)
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
	@Test(timeOut=2000) 
	public void m3()
	{
		Reporter.log("TimeRelated");
	}

}
