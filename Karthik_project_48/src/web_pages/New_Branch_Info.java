package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Branch_Info {

	WebDriver driver;
	private String title="admin_banker_master";
	
	public New_Branch_Info(WebDriver driver) 
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

	@FindBy(id="txtbName")
	public WebElement Branch_Name_edit_box;
	
	@FindBy(id="txtAdd1")
	public WebElement Address1_editbox;
	
	@FindBy(id="Txtadd2")
	public WebElement Address2_editbox;
	
	@FindBy(id="txtadd3")
	public WebElement Address3_editbox;
	
	@FindBy(id="txtArea")
	public WebElement Area_editbox;
	
	@FindBy(id="txtZip")
	public WebElement Zipcode_editbox;
	
	@FindBy(xpath="//select[@id='lst_counrtyU']")
	public WebElement Country_dropdown;
	
	@FindBy(xpath="//select[@id='lst_stateI']")
	public WebElement State_dropdown;
	
	@FindBy(xpath="//select[@id='lst_cityI']")
    public WebElement City_dropdown;
	
	@FindBy(id="btn_insert")
	public WebElement Submit_button;
	
	@FindBy(id="Btn_Reset")
	public WebElement Reset_button;
	
	@FindBy(id="Btn_cancel")
	public WebElement Cancel_button;
	
	public boolean Is_New_Branch_Homepage_opened()
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
	
	public void Type_Branch_Name_edit_box(String Branchname)
	{
		Branch_Name_edit_box.clear();
		Branch_Name_edit_box.sendKeys(Branchname);
		
	}
	
	public void Type_Address1_editbox(String Address1)
	{
		Address1_editbox.clear();
		Address1_editbox.sendKeys(Address1);
	}
	
	public void Type_Address2_editbox(String Address2)
	{
		
		Address2_editbox.clear();
		Address2_editbox.sendKeys(Address2);
	}
	
	public void Type_Address3_editbox(String Address3)
	{
		Address3_editbox.clear();
		Address3_editbox.sendKeys(Address3);
	}
	
	public void Type_Area_editbox(String Area)
	{
		
		Area_editbox.clear();
		Area_editbox.sendKeys(Area);
	}
	
	public void Type_Zipcode_editbox(String Zipcode)
	{
		Zipcode_editbox.clear();
		Zipcode_editbox.sendKeys(Zipcode);
		
	}
	
	public void Select_Country_dropdown(String Country_name)
    {
		new Select(Country_dropdown).selectByVisibleText(Country_name);
    	
    }
    
    public void Select_State_dropdown(String State_name)
    {
    	new Select(State_dropdown).selectByVisibleText(State_name);
    	
    }
    
    public void Select_City_dropdown(String City_name)
    {
    	
       new Select(City_dropdown).selectByVisibleText(City_name);
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
		{
			driver.switchTo().alert().accept();
			System.out.println("alert closed successfully");
		}	
		else
			System.out.println("Alert not presented");
	}
	
	
}
