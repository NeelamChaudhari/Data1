package Create_POM_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_ID_Verification
{
  @FindBy(xpath="//span[@class='user-id']")private WebElement UID;
  



public User_ID_Verification(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void Verification()
  {
	  String ER="GDA698";
	  String AR=UID.getText();
	  if(ER.equals(AR))
	  {
		  System.out.println("Pass");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
  }
 
}
