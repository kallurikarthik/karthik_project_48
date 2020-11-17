package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branches_info_page {
	
	WebDriver driver;
	
	String title="admin_banker_master";
	
    public Branches_info_page(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    
    @FindBy(id="BtnNewBR")
    public WebElement New_branch_button;
    
    @FindBy(xpath="//select[@id='lst_countryS']")
    public WebElement country_dropdown;
    
    @FindBy(xpath="//select[@id='lst_stateS']")
    public WebElement State_dropdown;
    
    @FindBy(xpath="//select[@id='lst_cityS']")
    public WebElement city_dropdown;
    
    @FindBy(id="btn_search")
    public WebElement Search_button;
    
    @FindBy(id="btn_clsearch")
    public WebElement Clear_button;
    
    @FindBy(xpath="(//img[@src='images/b-edit.png'])[1]")
    public WebElement Edit_button;
    
    @FindBy(xpath="(//img[@src='images/i_delete.gif'])[1]")
    public WebElement Delete_button;
    
    @FindBy(xpath="//a[contains(.,'...')]")
    public WebElement Next_button;
    
    @FindBy(xpath="(//a[contains(.,'...')])[1]")
    public WebElement Back_Button;
    
    @FindBy(xpath="(//a[contains(.,'...')])[2]")
    public WebElement Next_Next_Button;
    
    
    public boolean Is_Branches_Homepage_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(title);
		return flag;
	}
    
    public void Click_on_New_branch_button()
    {
    	
    	New_branch_button.click();
    }
    
    public void Select_country_dropdown(String Country_name)
    {
    	new Select(driver.findElement(By.xpath("//select[@id='lst_countryS']"))).selectByVisibleText(Country_name);
    	
    }
    
    public void Select_State_dropdown(String State_name)
    {
    	new Select(driver.findElement(By.xpath("//select[@id='lst_stateS']"))).selectByVisibleText(State_name);
    	
    }
    
    public void Select_city_dropdown(String City_name)
    {
    	
    	new Select(driver.findElement(By.xpath("//select[@id='lst_cityS']"))).selectByVisibleText(City_name);
    }
    
    public void Click_on_Search_button()
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
    
    public void Click_on_Next_button()
    {
    	Next_button.click();
    }
    
    public void Click_on_Back_Button()
    {
    	
    	Back_Button.click();
    }
    
    public void Click_on_Next_Next_Button()
    {
    	Next_Next_Button.click();
    }

}
