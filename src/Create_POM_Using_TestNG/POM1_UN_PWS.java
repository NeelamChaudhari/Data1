package Create_POM_Using_TestNG;


	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class POM1_UN_PWS 
	{
	
	   @FindBy(xpath="//input[@type='text']")private WebElement UN;
	   @FindBy(xpath="//input[@type='password']")private WebElement PSW;
	   @FindBy(xpath="//button[text()='Login ']")private WebElement Login;
	   
	   
	   public POM1_UN_PWS (WebDriver driver)
	   {
		   PageFactory.initElements( driver,this);
	   }
	   
	   public void UN1()
	   {
		   UN.sendKeys("GDA698");
	   }
	   public void PSW1()
	   {
		   PSW.sendKeys("Neelam@1984");
	   }
	   public void Login()
	   {
		   Login.click();
	   }
}
