package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payments_homepage 
{
	   WebDriver driver;
	   private String title="Banker_deposits";
  
	public Payments_homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//img[@src='images/admin_but_01.jpg']")
	public WebElement Home_button;
	
	@FindBy(xpath = "//img[@src='images/admin_but_03.jpg']")
	public WebElement Logout_button;
	
	@FindBy(id="TxtaccNO")
	public WebElement Account_number_Editbox;
	
	@FindBy(xpath = "//input[contains(@id,'txttransDate')]")
	public WebElement Transaction_date;
	
	@FindBy(xpath = "//select[contains(@id,'lstTransType')]")
	public WebElement Transaction_type_dropdown;
	
	
	public boolean Is_Payments_homepage_Opened()
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
	
    public void Select_Transaction_type_dropdown(String Transaction_type)
    {
    	new Select(Transaction_type_dropdown).selectByVisibleText(Transaction_type);
    }

}
