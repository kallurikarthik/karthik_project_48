package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Banking_Page
{   
	 WebDriver driver; 
     private String title="login";

	public Personal_Banking_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@href='http://ravinderbasani.com']")
	public WebElement Home_button;
	
	@FindBy(xpath="//a[@href='personal_banking.html']")
	public WebElement Personal_Banking_Button;
	
	@FindBy(xpath="//a[@href='Corporate Banking.html']")
	public WebElement Corporate_Banking_Button;
	
	@FindBy(xpath="//a[@href='International Banking.html']")
	public WebElement International_Banking_Button;
	
	@FindBy(xpath="//a[@href='aboutus.html']")
	public WebElement About_us_Button;
	
	@FindBy(id="idtxt")
	public WebElement Username_editbox;
	
	@FindBy(id="pswdtxt")
	public WebElement Password_editbox;
	
	@FindBy(id="btnGO")
	public WebElement Login_button;
	
	public boolean Is_Personal_Banking_Page_opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
		
	}
	
	
	public void Click_on_Home_button()
	{
		Home_button.click();
		
	}
	
	public void Click_on_Personal_Banking_Button()
	{
		Personal_Banking_Button.click();
		
	}
	
	public void Click_on_Corporate_Banking_Button()
	{
		
		Corporate_Banking_Button.click();
	}
	
	public void Click_on_International_Banking_Button()
	{
		
		International_Banking_Button.click();
		
	}
	
	public void Click_on_About_us_Button()
	{
		
		About_us_Button.click();
	}
	
	public void Type_Username_editbox(String Username)
	{
		Username_editbox.clear();
		Username_editbox.sendKeys(Username);
	}
	
	public void Type_Password_editbox(String Password)
	{
		Password_editbox.clear();
		Password_editbox.sendKeys(Password);
	}
	
	public void Click_on_Login_button()
	{
		Login_button.click();
	}
}
