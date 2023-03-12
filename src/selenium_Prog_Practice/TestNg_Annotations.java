package selenium_Prog_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Annotations
{
   @Test(timeOut=7000)
   public void TC1() throws InterruptedException
   {
	   Thread.sleep(5000);
	   Reporter.log("Execute TC1",true);
	   
   }
   
   @Test(priority=-1)
   public void TC2()
   {
	   Reporter.log("Execute TC2",true);
	   
   }
   
}
