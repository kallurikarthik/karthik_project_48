package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Home {

	WebDriver driver;
	private String title="RANFORD BANK";
	
	public Admin_Home(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement home_button;
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement Change_password_button;
	
	@FindBy(xpath="//a[href='home.aspx']")
	public WebElement Logout_button;
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement Branches_button;
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement Roles_button;
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement Users_button;
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement Employee_button;
	
	
	public boolean Is_Admin_Home_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
	
	
	
	public void Click_on_home_button()
	
	{
		
		home_button.click();
	}
	
	public void Click_on_Change_password_button()
	{
		
		Change_password_button.click();
	}
	
	public void Click_on_Logout_button()
	{
		
		Logout_button.click();
	}
	
	public void Click_on_Branches_button()
	{
	
		Branches_button.click();
	}
	
	public void Click_on_Roles_button()
	{
	    Roles_button.click();
	
	}
	
	public void Click_on_Users_button()
	{
		Users_button.click();
		
	}
	
	public void Click_on_Employee_button()
	{
		
		Employee_button.click();
	}
	

}
