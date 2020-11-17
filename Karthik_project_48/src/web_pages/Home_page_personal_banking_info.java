package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_personal_banking_info {
	
	WebDriver driver;
	private String title="RANFORD BANK";
	
	public Home_page_personal_banking_info(WebDriver driver) 
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

	@FindBy(xpath="//a[@href='savings_account.html']")
	public WebElement Savings_account_button;
	
	@FindBy(xpath="//a[@href='fixed_deposits.htm']")
	public WebElement Fixed_deposit_button;
	
	@FindBy(xpath="//img[@src='images/money_trans_but.jpg']")
	public WebElement Money_transfer_button;
	
	@FindBy(xpath="//a[@href='cards.html']")
	public WebElement Cards_button;
	
	@FindBy(xpath="//a[@href='loans.html']")
	public WebElement Loans_button;
	
	@FindBy(xpath="//a[@href='payments.html']")
	public WebElement Payments_button;
	
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
	
	public void Click_on_Savings_account_button()
	{
		Savings_account_button.click();
	}
	
	public void Click_on_Fixed_deposit_button()
	{
		Fixed_deposit_button.click();
	}
	
	public void Click_on_Money_transfer_button()
	{
		Money_transfer_button.click();
	}
	
	public void Click_on_Cards_button()
	{
		Cards_button.click();
	}
	
	public void Click_on_Loans_button()
	{
		Loans_button.click();
	}
	
	public void Click_on_Payments_button()
	{
		Payments_button.click();
	}
	
	
	
	
	
	
}
