package testngProg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testsuite 
{
    @Test
    public void TC1()
    {
    	Reporter.log("Execution of TC1",true);
    }
    @Test
    public void TC2()
    {
    	Reporter.log("Execution of TC2",true);
    }
}
