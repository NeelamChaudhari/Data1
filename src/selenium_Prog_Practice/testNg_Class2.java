package selenium_Prog_Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNg_Class2
{
	 @Test
	 public void TC3()
	   {
	       Assert.fail();
		   Reporter.log("Execute TC3",true);
		   
	   }
	   
	
	 @Test(dependsOnMethods="TC3")
	 
	   public void TC4()
	   {
		
		   Reporter.log("Execute TC4",true);
		   
	   }
	   
	
}
