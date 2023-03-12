package Create_POM_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_PIN
{

	@FindBy(xpath="//button[text()='Continue ']")private WebElement ctn;
	
	public  POM2_PIN(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void continue1()
	{
		ctn.click();
	}
	
	
	
}
