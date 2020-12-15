package excel_Datadriven;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Keywords.Repository;
import Keywords.excel_keywords;
import web_pages.Admin_Home;
import web_pages.Branches_info_page;
import web_pages.New_Branch_Info;
import web_pages.Ranford_Home;

public class Datadriven_Admin_test extends Repository
{
	WebDriver driver;
	

	public Datadriven_Admin_test(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

	
	
	public void Creat_a_branch_with_valid_data() throws Exception
	{
		excel_keywords.get_workbook("InputData", "Sheet1");
		Ranford_Home RH=new Ranford_Home(driver);
		RH.Type_admin_Username_Editbox("Admin");
		RH.Type_admin_Password_Editbox("M1ndq");
		RH.Click_on_admin_login_button();
		
		Admin_Home AH=new Admin_Home(driver);
		AH.Click_on_Branches_button();
		
		Branches_info_page BIP=new Branches_info_page(driver);
		BIP.Click_on_New_branch_button();
		
		New_Branch_Info NBI=new New_Branch_Info(driver);
		Type_text(NBI.Branch_Name_edit_box, excel_keywords.get_cell_Data(1, 0));
		Type_text(NBI.Address1_editbox,excel_keywords.get_cell_Data(1, 1));
		Type_text(NBI.Zipcode_editbox,excel_keywords.get_cell_Data(1, 2));
		Select_Drodpown(NBI.Country_dropdown, excel_keywords.get_cell_Data(1, 3));
		Select_Drodpown(NBI.State_dropdown,excel_keywords.get_cell_Data(1, 4));
		Select_Drodpown(NBI.City_dropdown,excel_keywords.get_cell_Data(1, 5));
		click_element(NBI.Submit_button);
		
		Thread.sleep(5000);
		Assert.assertTrue(NBI.is_Alertpresent());
		NBI.Close_Alert();
	
	
	}
	
	public void Creat_a_branch_with_invalid_data() throws Exception
	{
		excel_keywords.get_workbook("InputData", "Sheet1");
		
		Admin_Home AH=new Admin_Home(driver);
		AH.Click_on_Branches_button();
		
		Branches_info_page BIP=new Branches_info_page(driver);
		BIP.Click_on_New_branch_button();
		
		New_Branch_Info NBI=new New_Branch_Info(driver);
		Type_text(NBI.Branch_Name_edit_box, excel_keywords.get_cell_Data(2, 0));
		Type_text(NBI.Address1_editbox,excel_keywords.get_cell_Data(2, 1));
		Type_text(NBI.Zipcode_editbox,excel_keywords.get_cell_Data(2, 2));
		
		Thread.sleep(5000);
		Assert.assertTrue(NBI.is_Alertpresent());
		NBI.Close_Alert();
		
	
	
	}
	
	

	public void Creat_a_branch_with_Blank_data() throws Exception
	{
		excel_keywords.get_workbook("InputData", "Sheet1");
		
		Admin_Home AH=new Admin_Home(driver);
		AH.Click_on_Branches_button();
		
		Branches_info_page BIP=new Branches_info_page(driver);
		BIP.Click_on_New_branch_button();
		
		New_Branch_Info NBI=new New_Branch_Info(driver);
        click_element(NBI.Submit_button);
		
		Thread.sleep(5000);
		Assert.assertTrue(NBI.is_Alertpresent());
		
		NBI.Close_Alert();
		
	
	
	}
}
