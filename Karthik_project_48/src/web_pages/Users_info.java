package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users_info {
	
	WebDriver driver;
	private String title="UserDetails";

	public Users_info(WebDriver driver) 
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
	
	@FindBy(id="Btnuser")
	public WebElement Newuser_button;
	

	@FindBy(xpath="//select[@id='lst_branchS']")
	public WebElement Branches_dropdown;
	
	@FindBy(xpath="//select[@id='lst_rolesS']")
	public WebElement Roles_dropdown;
	
	@FindBy(id="btn_search")
	public WebElement Search_button;
	
	@FindBy(id="btn_clear")
	public WebElement Clear_button;
	
	@FindBy(xpath="(//img[@src='images/b-edit.png'])[1]")
	public WebElement Edit_button;
	
	@FindBy(xpath="(//img[contains(@src,'delete.gif')])[1]")
	public WebElement Delete_button;
	
	public boolean Is_Users_homepage_opened()
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
	
	public void Click_on_Newuser_button()
	{
		Newuser_button.click();
	}
	
	public void Select_Branches_dropdown(String Branch_name)
	{
		new Select(Branches_dropdown).selectByVisibleText(Branch_name);
	}
	
	public void Select_Roles_dropdown(String Role_name)
	{
		new Select(Roles_dropdown).selectByVisibleText(Role_name);
	}
	
	public void click_on_Search_button() 
	{
		
		Search_button.click();
	}
	
	public void Click_on_Clear_button()
	{
		Clear_button.click();
	}
	
	public void Click_on_Edit_button()
	{
		Edit_button.click();
	}
	
	public void Click_on_Delete_button()
	{
		Delete_button.click();
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
