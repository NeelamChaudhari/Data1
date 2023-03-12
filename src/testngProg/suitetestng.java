package testngProg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class suitetestng
{
	  @Test
	    public void TC5()
	    {
	    	Reporter.log("Execution of TC5",true);
	    	String AR="Hi";
	    	String ER="Hello";
	    	boolean AR1=true;
	    	Assert.assertEquals(AR,ER);
	    	Assert.assertNotEquals(AR,ER);
	    	Assert.assertTrue(AR1);
	    	Assert.assertFalse(AR1);
	    	Assert.assertNotNull(AR1);
	    	Assert.assertNull(AR1);
	    }
	  @Test
	    public void TC6()
	    {
		  
		//  Assert.fail();
	    	Reporter.log("Execution of TC6",true);
	    }
}
