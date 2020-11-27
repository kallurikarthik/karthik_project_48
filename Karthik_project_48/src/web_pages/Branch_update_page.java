package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branch_update_page 
{
    WebDriver driver;
	
	String title="admin_banker_master";
	
	

	public Branch_update_page(WebDriver driver) 
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
	
	 
    @FindBy(id="BtnNewBR")
    public WebElement New_branch_button;
    
    @FindBy(xpath = "//span[contains(@id,'Labbrau')]")
    public WebElement Header_txt_location;
    
    @FindBy(id="txtUbranchid")
    public WebElement Branch_id;
    
    @FindBy(id="txtbnameU")
	public WebElement Branch_Name_edit_box;
    
    @FindBy(id="txtadd1u")
	public WebElement Address1_editbox;
	
	@FindBy(id="txtadd2u")
	public WebElement Address2_editbox;
	
	@FindBy(id="txtadd3U")
	public WebElement Address3_editbox;
	
	@FindBy(id="txtareaU")
	public WebElement Area_editbox;
	
	@FindBy(id="txtzipu")
	public WebElement Zipcode_editbox;
	
	@FindBy(xpath="//select[contains(@id,'drlst_countryU')]")
	public WebElement Country_dropdown;
	
	@FindBy(xpath="//select[@id='lst_stateU']")
	public WebElement State_dropdown;
	
	@FindBy(xpath="//select[@id='LST_cityU']")
    public WebElement City_dropdown;
	
	@FindBy(id="btnupdate")
	public WebElement Update_button;
	
	@FindBy(id="Btncancel")
	public WebElement Cancel_button;
	
	public boolean Is_Branch_update_page_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
	
	 public void Click_on_New_branch_button()
	    {
	    	
	    	New_branch_button.click();
	    }
	 
	 public void Header_text_location()
	 {
		 
		 Header_txt_location.getText();
		 
		
	 }
	 
	 public void Type_Branch_Name_edit_box(String Branch_name)
	    {
	    	
		 Branch_Name_edit_box.clear();
		 Branch_Name_edit_box.sendKeys(Branch_name);
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
