package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Newuser_info {
	
	WebDriver driver;
	private String title="AdminUserCreation";

	public Newuser_info(WebDriver driver)
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
	
	@FindBy(xpath="//select[contains(@id,'lst_Roles')]")
	public WebElement Role_dropdown;
	
	@FindBy(xpath="//select[@id='lst_Branch']")
	public WebElement Branch_dropdown;
	
	@FindBy(xpath="//select[@id='DrCName']")
	public WebElement Customer_ID_dropdown;
	
	@FindBy(id="Lbc_name")
	public WebElement Customer_Name_editbox;
	
	@FindBy(id="txtUname")
	public WebElement user_name_editbox;
	
	@FindBy(id="txtLpwd")
	public WebElement Login_password_editbox;
	
	@FindBy(id="txtTpwd")
	public WebElement Transaction_password_editbox;
	
	@FindBy(id="BtnSubmit")
	public WebElement Submit_button;
	
	@FindBy(id="btnreset")
	public WebElement Reset_button;
	
	@FindBy(id="btnCancel")
	public WebElement Cancel_button;
	
	public boolean Is_User_homepage_opened()
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
	
	public void Select_Role_dropdown(String Role_name)
	{
		new Select(Role_dropdown).selectByVisibleText(Role_name);
	}
	
	public void Select_Branch_dropdown(String Branch_name)
	{
		new Select(Branch_dropdown).selectByVisibleText(Branch_name);
	}
	
	public void Select_Customer_ID_dropdown(String id)
	{
		new Select(Customer_ID_dropdown).selectByVisibleText(id);
	}
	
	public void Type_Customer_Name_editbox(String Customername)
	{
		Customer_Name_editbox.clear();
		Customer_Name_editbox.sendKeys(Customername);	
	}
	
	public void Type_user_name_editbox(String Username)
	{
		user_name_editbox.clear();
		user_name_editbox.sendKeys(Username);
	}
	
	public void Type_Login_password_editbox(String loginpassword)
	{
		Login_password_editbox.clear();
		Login_password_editbox.sendKeys(loginpassword);
		
	}
	
	public void Type_Transaction_password_editbox(String Transpassword)
	{
		Transaction_password_editbox.clear();
		Transaction_password_editbox.sendKeys(Transpassword);
		
	}
	
	public void Click_on_Submit_button()
    {
    	Submit_button.click();
    }
    
    public void Click_on_Reset_button()
    {
    	Reset_button.click();
    }
    
    public void Click_on_Cancel_button()
    {
    	Cancel_button.click();
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
