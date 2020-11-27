package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers_page
{
	WebDriver driver;
	private String title="admin_customer_update";
	
	public Customers_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	@FindBy(xpath = "//img[@src='images/admin_but_01.jpg']")
	public WebElement Home_button;
	
	@FindBy(xpath = "//img[@src='images/admin_but_03.jpg']")
	public WebElement Logout_button;
	
	@FindBy(xpath = "(//img[@src='images/b-edit.png'])[1]")
	public WebElement Edit_button;
	
	@FindBy(xpath = "(//img[@src='images/i_delete.gif'])[1]")
	public WebElement Delete_button;
	
	
	public boolean Is_Customers_Homepage_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
	
	 public void Click_on_home_button()
		
		{
			
			Home_button.click();
		}
	    
	    
	 public void Click_on_Logout_button()
		{
			
			Logout_button.click();
		}
	 
	 public void Click_on_Edit_button()
	 {
		 Edit_button.click();
	 }
	 
	 public void Click_on_Delete_button()
	 {
		 Delete_button.click();
		 
	 }
}
