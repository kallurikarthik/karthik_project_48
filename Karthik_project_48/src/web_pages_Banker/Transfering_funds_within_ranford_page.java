package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Transfering_funds_within_ranford_page
{  
	WebDriver driver; 
    private String title="moneytransfer";


	public Transfering_funds_within_ranford_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//img[@src='images/admin_but_01.jpg']")
	public WebElement Home_button;
	
	@FindBy(xpath = "//img[@src='images/admin_but_02.jpg']")
	public WebElement Change_Password_button;
	
	@FindBy(xpath = "//img[@src='images/admin_but_03.jpg']")
	public WebElement Logout_button;
	
	@FindBy(xpath = "//img[@src='images/Acc_but.jpg']")
	public WebElement Account_Summary_button;
	
	@FindBy(xpath = "//img[@src='images/money_but.jpg']")
	public WebElement Monet_Transfer_button;
	
	@FindBy(xpath = "//img[@src='images/smart_but.jpg']")
	public WebElement Smart_Money_order_button;
	
	@FindBy(xpath = "//img[@src='images/req_but.jpg']")
	public WebElement Request_for_Cheque_button;
	
	@FindBy(id="txtaCCNO")
	public WebElement Receivers_Account_number_editbox;
	
	@FindBy(xpath = "//input[contains(@id,'txtTPWD')]")
	public WebElement Transaction_password_editbox;
	
	@FindBy(xpath = "//select[contains(@id,'lst_branchname')]")
	public WebElement Select_receivers_branchname;
	
	@FindBy(xpath = "//input[contains(@id,'btnsubmit')]")
	public WebElement Continue_button;
	
	@FindBy(xpath = "//input[contains(@id,'btncancel')]")
	public WebElement Cancel_button;
	
	@FindBy(id="txtAmmount")
	public WebElement Amount_to_pay_editbox;
	
	@FindBy(id="btn_pay")
	public WebElement Pay_button;
	
	@FindBy(id="btnreset")
	public WebElement Reset_button;
	

	

	public boolean Is_Transfering_funds_within_ranford_page_opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
		
	}
	
	
	public void Click_on_Home_button()
	{
		Home_button.click();
	}
	
	public void Click_on_Change_Password_button()
	{
		Change_Password_button.click();
	}
	
	public void Click_on_Logout_button()
	{
		Logout_button.click();
	}
	
	public void Click_on_Account_Summary_button()
	{
		Account_Summary_button.click();
	}
	
	public void Click_on_Monet_Transfer_button()
	{
		
		Monet_Transfer_button.click();
	}
	
	public void Click_on_Smart_Money_order_button()
	{
		Smart_Money_order_button.click();
	}
	
	public void Click_on_Request_for_Cheque_button()
	{
		Request_for_Cheque_button.click();
	}
	public void Type_Receivers_Account_number_editbox(String Account_number)
	{
		Receivers_Account_number_editbox.clear();
		Receivers_Account_number_editbox.sendKeys(Account_number);
		
	}
	
	public void Type_Transaction_password_editbox(String Transaction_password)
	{
		Transaction_password_editbox.clear();
		Transaction_password_editbox.sendKeys(Transaction_password);
		
	}
	
	public void Select_receivers_branchname(String Branchname)
	{
		new Select(Select_receivers_branchname).selectByVisibleText(Branchname);
	}
	
	public void Click_on_Continue_button()
	{
		Continue_button.click();
	}
	
	public void Click_on_Cancel_button()
	{
		Cancel_button.click();
	}
    
	public void Type_Amount_to_pay_editbox(String Amount)
	{
		Amount_to_pay_editbox.clear();
		Amount_to_pay_editbox.sendKeys(Amount);
	}
	
	public void Click_on_Pay_button()
	{
		Pay_button.click();
	}
	
	public void Click_on_Reset_button()
	{
		Reset_button.click();
	}
}
