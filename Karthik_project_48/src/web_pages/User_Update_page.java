package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Update_page
{
	WebDriver driver;
	private String title="UserDetails";

	

	public User_Update_page(WebDriver driver)
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
	
	@FindBy(xpath = "//span[@id='labmain']")
	public WebElement Header_txt;
	
	@FindBy(id="txtUname")
	public WebElement Username_editbox;
	
	@FindBy(id="txtLPwd")
	public WebElement L_password_editbox;
	
	@FindBy(id="txtTPwd")
	public WebElement T_password_editbox;
	
	@FindBy(id="btn_edit")
	public WebElement Update_button;
	
	@FindBy(id="Btncancel")
	public WebElement Cancel_button;
	
	
	public boolean Is_User_Update_page_Opened()
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
	
	public void Type_Username_editbox(String Username)
	{
		Username_editbox.clear();
		Username_editbox.sendKeys(Username);
	}
	
	public void Type_L_password_editbox(String L_password)
	{
		L_password_editbox.clear();
		L_password_editbox.sendKeys(L_password);
	}
	
	public void Type_T_password_editbox(String T_password)
	{
		T_password_editbox.clear();
		T_password_editbox.sendKeys(T_password);
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

