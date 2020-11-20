package web_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ranford_Home {

	WebDriver driver;
	
	private String url="http://122.175.8.158/Ranford2/home.aspx";
	private String title="MINDQ RANFORD BANK";
	
	public Ranford_Home(WebDriver driver) 
	{
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.get(url);
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
	
	@FindBy(id="personal")
	public WebElement Customer_personal_banking_button;
	
	@FindBy(id="corporate")
	public WebElement Customer_corporate_banking_button;
	
	@FindBy(id="NRI")
	public WebElement Customer_NRI_banking_button;
	
	@FindBy(xpath="//select[@id='drlist']")
	public WebElement Branch_Selection_Dropdown;
	
	@FindBy(id="txtuId")
	public WebElement admin_Username_Editbox;
	
	@FindBy(id="txtPword")
	public WebElement admin_Password_Editbox;
	
	@FindBy(id="login")
	public WebElement admin_login_button;
	
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
	
	public boolean Is_Ranford_Homepage_opened()
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
	
	public void Click_on_Customer_personal_banking_button()
	{
		Customer_personal_banking_button.click();
		
	}
	
	public void Click_on_Customer_corporate_banking_button()
	{
		
		Customer_corporate_banking_button.click();
		
	}
	
	public void Click_on_Customer_NRI_banking_button()
	{
		
		Customer_NRI_banking_button.click();
		
	}
	
	public void Click_on_Branch_Selection_Dropdown(String Branch_Selection)
	{
		
		new Select(Branch_Selection_Dropdown).selectByVisibleText(Branch_Selection);
	}
	
	public void Type_admin_Username_Editbox(String Username)
	{
		admin_Username_Editbox.clear();
		admin_Username_Editbox.sendKeys(Username);
	}
	
	public void Type_admin_Password_Editbox(String Password)
	
	{
		admin_Password_Editbox.clear();
		admin_Password_Editbox.sendKeys(Password);
		
	}
	
	public void Click_on_admin_login_button()
	{
		admin_login_button.click();
		
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
	
	public boolean is_Alertpresent()
	{
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public void Close_Alert()
	{
		if(is_Alertpresent())
		driver.switchTo().alert().accept();
		
		else
			System.out.println("Alert not present");
	}
	
	
	
	
	
	
	
}
