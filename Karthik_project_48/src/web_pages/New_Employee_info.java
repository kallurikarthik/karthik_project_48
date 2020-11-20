package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Employee_info {

	WebDriver driver;
	private String title="Admin_Emp_details";
	
	public New_Employee_info(WebDriver driver) 
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
	
	@FindBy(id="txtUname")
    public WebElement Employer_editbox;
	
	@FindBy(id="txtLpwd")
	public WebElement Login_password_editbox;
	
	@FindBy(xpath = "//select[contains(@id,'lst_Roles')]")
	public WebElement Role_dropdown;
	
	@FindBy(xpath="//select[@id='lst_Branch']")
	public WebElement Branch_dropdown;
	
	@FindBy(id="BtnSubmit")
	public WebElement Submit_button;
	
	@FindBy(id="btnreset")
	public WebElement Reset_button;
	
	@FindBy(id="btnCancel")
	public WebElement Cancel_button;
	
	public boolean Is_NewEmployee_homepage_opened()
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
	
	public void Type_Employer_editbox(String Employername)
	{
		Employer_editbox.clear();
		Employer_editbox.sendKeys(Employername);
	}
	
	public void Type_Login_password_editbox(String Password)
	{
		Login_password_editbox.clear();
		Login_password_editbox.sendKeys(Password);
	}
	
	public void Select_Role_dropdown(String Role)
	{
		new Select(Role_dropdown).selectByVisibleText(Role);
	}
	
	public void Select_Branch_dropdown(String Branch)
	{
		new Select(Branch_dropdown).selectByVisibleText(Branch);
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
