package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_info {

	WebDriver driver;
	private String title="Admin_Emp_details";
	
	public Employee_info(WebDriver driver)
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
	
	@FindBy(id="BtnNew")
	public WebElement New_Employee_button;
	
	@FindBy(xpath="(//img[@src='images/b-edit.png'])[1]")
	public WebElement Edit_button;
	
	@FindBy(xpath="(//img[@src='images/i_delete.gif'])[1]")
	public WebElement Delete_button;
	
	@FindBy(xpath="//a[contains(.,'...')]")
	public WebElement Next_button;
	
	@FindBy(xpath="(//a[contains(.,'...')])[1]")
	public WebElement Back_button;
	
	@FindBy(xpath="(//a[contains(.,'...')])[2]")
	public WebElement Next_Next_button;
	
	public boolean Is_Employee_homepage_opened()
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
	
	public void Click_on_Edit_button()
	{
		Edit_button.click();
		
	}
	
	public void Click_on_Delete_button()
	{
		Delete_button.click();
	}
	
	 public void Click_on_Next_button()
	    {
	    	Next_button.click();
	    }
	    
	    public void Click_on_Back_Button()
	    {
	    	
	    	Back_button.click();
	    }
	    
	    public void Click_on_Next_Next_Button()
	    {
	    	Next_Next_button.click();
	    }

	
}
