package web_pages_Banker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Receipts_Transaction_page 
{
    WebDriver driver;
    private String title="Banker_deposits";
	
	public Receipts_Transaction_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
   @FindBy(id="txtCqueNO")
   public WebElement Cheque_DD_number_editbox;
   
   @FindBy(id="txtnaration")
   public WebElement Narration_editbox;
   
   @FindBy(id="txtamount")
   public WebElement Amount_editbox;
   
   @FindBy(id="btnSubmit")
   public WebElement Submit_button;
   
   @FindBy(id="btnreset")
   public WebElement Reset_button;
   
   @FindBy(id="btncancel")
   public WebElement Cancel_button;
   
   public boolean Is_Receipts_Transaction_page_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
   
   public void Type_Cheque_DD_number_editbox(String Cheque_DD_numbers)
   {
	   Cheque_DD_number_editbox.clear();
	   Cheque_DD_number_editbox.sendKeys(Cheque_DD_numbers);
   }
   
   public void Type_Narration_editbox(String Narration)
   {
	   Narration_editbox.clear();
	   Narration_editbox.sendKeys(Narration);
   }
   
   public void Type_Amount_editbox(String Amount)
   {
	   Amount_editbox.clear();
	   Amount_editbox.sendKeys(Amount);
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
}
