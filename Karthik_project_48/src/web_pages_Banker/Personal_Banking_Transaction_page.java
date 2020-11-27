package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Banking_Transaction_page 
{
	WebDriver driver; 
    private String title="login";

	public Personal_Banking_Transaction_page(WebDriver driver) 
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
	
	
	public boolean IsPersonal_Banking_Transaction_page_opened()
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
}
