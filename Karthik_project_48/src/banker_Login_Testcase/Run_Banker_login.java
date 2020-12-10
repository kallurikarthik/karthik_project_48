package banker_Login_Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Keywords.Repository;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Run_Banker_login 
{
	  

 
  
  
    String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	String Property_file_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\src\\banker_Login_Testcase\\Banker_input.properties\\";
	FileInputStream fi;
	Properties properties;
	WebDriver driver;
	banker_tests banker;
	
   
  
  
  
	 @Test(priority=0)
	  public void Tc021_Login_As_Banker()
	  { 
		 String Banker_Page_URL=properties.getProperty("Banker_URL");
		 String Branch_name=properties.getProperty("Branch_Name");
		 String Banker_name=properties.getProperty("Banker_Name");
		 String Banker_passowrd=properties.getProperty("Banker_Password");
		 String Expected_Banker_page_title=properties.getProperty("Exp_title");
		 
		 driver.get(Banker_Page_URL);
		 banker=new banker_tests(driver);
		 banker.Banker_login(Branch_name, Banker_name, Banker_passowrd, Expected_Banker_page_title);
				 
	  }
	 
	 @Test(priority=1,dependsOnMethods="Tc021_Login_As_Banker")
	 public void TC022_verify_account_details_displayed_using_valid_account_number() throws Exception
	 {
		 String Accout_number=properties.getProperty("AccoutNumber");
		 String Transaction_type=properties.getProperty("Transaction_Type");
		 banker.Receipts_DD_Deposit_using_Valid_AccoutNumber(Accout_number, Transaction_type);
		 
		 
     }
	 
	 @Test(priority=2,dependsOnMethods="Tc021_Login_As_Banker")
	 public void TC023_verify_alert_displayed_using_invalid_account_number() throws Exception
	 {
		 String invalid_Accout_number=properties.getProperty("invalid_AccoutNumber");
		 String Transaction_type=properties.getProperty("Transaction_Type");
		 banker.Receipts_DD_Deposit_using_inValid_AccoutNumber(invalid_Accout_number, Transaction_type);
		 
		 
	 }
	 
	 
	  @Test(priority=3,dependsOnMethods="Tc021_Login_As_Banker")
	  public void Tc_024_Verify_DD_Deposit() throws Exception
	  {
		  String Accout_number=properties.getProperty("AccoutNumber");
		  String Enter_cash=properties.getProperty("enter_cash");
		  String Customer_name=properties.getProperty("Customer_name");
		  String DD_no=properties.getProperty("DD_Number");
		  banker.Verify_DD_Deposit_Valid_Transaction(Enter_cash, Accout_number, Customer_name,DD_no);
	  }
	  
	  @Test(priority=4,dependsOnMethods="Tc021_Login_As_Banker")
	  public void Tc_025_Verify_Cheque_Deposit() throws Exception
	  {
		  String Accout_number=properties.getProperty("AccoutNumber");
		  String Transaction_type1=properties.getProperty("Transaction_Type1");
		  banker.Receipts_Cheque_Deposit_using_Valid_AccoutNumber(Accout_number, Transaction_type1);
		  String Enter_cash=properties.getProperty("enter_cash");
		  String Customer_name=properties.getProperty("Customer_name");
		  String Cheque_no=properties.getProperty("cheque_number");
		  banker.Verify_Cheque_Deposit_Valid_Transaction(Enter_cash, Accout_number, Customer_name,Cheque_no);
	  }
	  
	  

	 @Test(priority=5,dependsOnMethods="Tc021_Login_As_Banker")
	 public void TC026_verify_account_details_displayed_using_valid_account_number() throws Exception
		 {
			 String Accout_number=properties.getProperty("AccoutNumber");
			 String Transaction_type5=properties.getProperty("Transaction_Type5");
			 banker.Payments_Cash_Withdraw_using_Valid_AccoutNumber(Accout_number, Transaction_type5);
			 
	     }
	 
	 @Test(priority=6,dependsOnMethods="Tc021_Login_As_Banker")
	  public void Tc_027_Verify_Cash_Withdraw() throws Exception
	  {
		  String Accout_number=properties.getProperty("AccoutNumber");
		  String Enter_cash=properties.getProperty("enter_cash");
		  String Customer_name=properties.getProperty("Customer_name");
		  
		  banker.Verify_Cash_Withdraw_Valid_Transaction(Enter_cash, Accout_number, Customer_name);
	  }
	 

@AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	Repository R=new Repository(driver);
	R.Capture_Screen_At_Alert(method);
	  
	  
  }

  @BeforeClass
  public void beforeClass() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver",Driver_Path);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  
	  
	  fi=new FileInputStream(Property_file_path);
	  properties=new Properties();
	  properties.load(fi);
	  
	  
	  
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(10000);
	  driver.close();
	  
  }

}
