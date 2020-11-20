package web_pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Role_info {
     
	WebDriver driver;
	private String title="Admin_Roles_details";
	
	
	public New_Role_info(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="txtRname")
	public WebElement Role_Name_editbox;
	
	@FindBy(id="txtRDesc")
	public WebElement Role_desc_editbox;
	
	@FindBy(xpath="//select[@id='lstRtypeN']")
	public WebElement Role_type_dropdown;
	
	@FindBy(id="btninsert")
	public WebElement Submit_button;
	
	@FindBy(id="Btn_Reset")
	public WebElement Reset_button;
	
	@FindBy(id="Btn_cancel")
	public WebElement Cancel_button;
	
	public boolean Is_Roles_Homepage_opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
	
	public void Type_on_Role_Name_editbox(String Rolename)
	{
		Role_Name_editbox.clear();
		Role_Name_editbox.sendKeys(Rolename);
	}
	
	public void Type_on_Role_desc_editbox(String Roledesc)
	{
		Role_desc_editbox.clear();
		Role_desc_editbox.sendKeys(Roledesc);
	}
	
	public void Select_Role_type_dropdown(String Role_type)
	{
		new Select(Role_type_dropdown).selectByVisibleText(Role_type);
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
