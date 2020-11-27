package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Money_Transfer_page 
{
	WebDriver driver; 
    private String title="moneytransfer";

	public Money_Transfer_page(WebDriver driver)
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
	
	@FindBy(xpath = "//a[contains(@id,'samebr')][contains(.,'Transfering Funds with in Ranford')]")
	public WebElement Tranfering_Funds_within_ranford_button;
	
	@FindBy(xpath = "//a[contains(@id,'diffbr')][contains(.,'Transfering Funds to Non Ranford')]")
	public WebElement transfering_Funds_nonranford_button;
	
	
	public boolean Is_Money_Transfer_page_opened()
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
	
	public void Click_on_Tranfering_Funds_within_ranford_button()
	{
		Tranfering_Funds_within_ranford_button.click();
	}
	
	public void Click_on_transfering_Funds_nonranford_button()
	{
		transfering_Funds_nonranford_button.click();
	}
	
}
