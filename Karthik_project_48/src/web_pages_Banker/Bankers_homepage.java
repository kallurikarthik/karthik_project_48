package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class Bankers_homepage {
	WebDriver driver;
	private String title="RANFORD BANK";

	public Bankers_homepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//img[@src='images/admin_but_01.jpg']")
	public WebElement Home_button;
	
	@FindBy(xpath = "//img[@src='images/admin_but_03.jpg']")
	public WebElement Logout_button;
	
	@FindBy(xpath = "//img[@src='images/Customer_but.jpg']")
	public WebElement Customers_button;
	
	@FindBy(xpath = "//img[@src='images/Receipts_but.jpg']")
	public WebElement Receipts_button;
	
	@FindBy(xpath = "//img[@src='images/Pay_but.jpg']")
	public WebElement Payments_button;
	
	
	public boolean Is_Bankers_Homepage_Opened()
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
    
    public void Click_on_Customers_button()
    {
    	Customers_button.click();
    }
    
    public void Click_on_Receipts_button()
    {
    	Receipts_button.click();
    }
    
    public void Click_on_Payments_button()
    {
    	Payments_button.click();
    }
	

}
