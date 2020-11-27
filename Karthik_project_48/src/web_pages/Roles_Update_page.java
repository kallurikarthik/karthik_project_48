package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Roles_Update_page 
{
	    WebDriver driver;
		
		String title="Admin_Roles_details";

	public Roles_Update_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		
	}

	@FindBy(xpath = "//a[@href='adminflow.aspx']")
	public WebElement home_button;

	@FindBy(xpath = "//a[@href='change_password.aspx']")
	public WebElement Change_password_button;

	@FindBy(xpath = "//a[href='home.aspx']")
	public WebElement Logout_button;
	
	@FindBy(xpath = "//span[@id='Label1']")
	public WebElement Header_txt;
	
	@FindBy(id="txtroleidU")
	public WebElement Roles_id;
	
	@FindBy(id="txtrNameU")
	public WebElement Role_name_editbox;
	
	@FindBy(id="txtrdescU")
	public WebElement Role_description_editbox;
	
	@FindBy(xpath = "//select[@id='lstRtype']")
	public WebElement Role_type_dropdown;
	
	@FindBy(id="btnupdate")
	public WebElement Update_button;
	
	@FindBy(id="Btncancel")
	public WebElement Cancel_button;
	
	
	public boolean Is_Roles_Update_page_Opened()
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
	
	public void Header_text_location()
	 {
		 
		 Header_txt.getText();
		
	 }
	
	public void Type_Role_name_editbox(String Role_name)
	{
		Role_name_editbox.clear();
		Role_name_editbox.sendKeys(Role_name);
		
	}
	
	public void Type_Role_description_editbox(String Role_desc)
	{
		Role_description_editbox.clear();
		Role_description_editbox.sendKeys(Role_desc);
		
	}
	
	public void Select_Role_type_dropdown(String Role_type)
	{
		new Select(Role_type_dropdown).selectByVisibleText(Role_type);
		
		
	}
	
	public void click_on_Update_button()
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


