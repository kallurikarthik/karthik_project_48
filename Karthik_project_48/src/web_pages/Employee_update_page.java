package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Employee_update_page 
{
	WebDriver driver;
	private String title="Admin_Emp_details";

	public Employee_update_page(WebDriver driver)
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
	
	@FindBy(xpath = "//span[@id='Label12']")
	public WebElement Header_txt;
	
	@FindBy(xpath = "//td[contains(.,'4355')]")
	public WebElement Banker_id;
	
	@FindBy(id="txtBnameU")
	public WebElement Employee_name_editbox;
	
	@FindBy(id="txtPwdU")
	public WebElement Login_password_editbox;
	
	@FindBy(xpath = "//select[@id='lstrolesU']")
	public WebElement Role_dropdown;
	
	@FindBy(xpath = "//select[@id='lstBidU']")
	public WebElement Branch_dropdown;
	
	@FindBy(id="btnupdate")
	public WebElement Update_button;
	
	@FindBy(id="Btncancel")
	public WebElement Cancel_button;
	
	public boolean Is_Employee_update_page_Opened()
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
	
	public void Header_txt()
	{
		Header_txt.getText();
		
	}
	
	public void Type_Employee_name_editbox(String Employee_name)
	{
		Employee_name_editbox.clear();
		Employee_name_editbox.sendKeys(Employee_name);
	}

	public void Type_Login_password_editbox(String Login_name)
	{
		Login_password_editbox.clear();
		Login_password_editbox.sendKeys(Login_name);
	}
	
	public void Select_Role_dropdown(String Role)
	{
		new Select(Role_dropdown).selectByVisibleText(Role);
	}
	
	public void Select_Branch_dropdown(String Branch_name)
	{
		new Select(Branch_dropdown).selectByVisibleText(Branch_name);
	}
	
	public void Click_on_Update_button()
	{
		Update_button.click();
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
		{
			driver.switchTo().alert().accept();
			System.out.println("alert closed successfully");
		}	
		else
			System.out.println("Alert not presented");
	}
	
	
	
}
