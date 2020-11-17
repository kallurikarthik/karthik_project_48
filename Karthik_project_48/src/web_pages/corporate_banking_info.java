package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corporate_banking_info {
	WebDriver driver;
	private String title="login";
	

	public corporate_banking_info(WebDriver driver) 
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
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr/td/marquee")
	public WebElement News_Pages;
	
	@FindBy(linkText="Customer Service")
	public WebElement Customer_Service_link_button;
	
	@FindBy(linkText="Internet Banking FAQ's")
	public WebElement International_banking_faqs_button;
	
	@FindBy(linkText=" Privacy")
	public WebElement privacy_button;
	
	@FindBy(linkText="Terms and Conditions")
	public WebElement Terms_and_Conditions_button;
	
	@FindBy(linkText="Disclaimer ")
	public WebElement Disclaimer_button;
	
	@FindBy(linkText="Site Map")
	public WebElement Site_map_button;
	
	public boolean Is_Ranford_Homepage_Opened()
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
	
	public void Click_on_Customer_Service_link_button()
	{
		Customer_Service_link_button.click();
	}
	
	public void Click_on_International_banking_faqs_button()
	{
		
		International_banking_faqs_button.click();
	}
	
	public void Click_on_privacy_button()
	
	{
		
		privacy_button.click();
	}
	
	public void Click_on_Terms_and_Conditions_button()
	{
		
		Terms_and_Conditions_button.click();
		
	}
	
	public void Click_on_Disclaimer_button()
	{
		Disclaimer_button.click();
		
	}
	
	public void Click_on_Site_map_button()
	{
		
		Site_map_button.click();
	}
}
