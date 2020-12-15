package excel_Datadriven;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Keywords.Repository;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Run_Datadriven_test 
{
  
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	String Filepath="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\src\\Resources\\Inputdata.xlsx\\";
	FileInputStream fi;
	Datadriven_Admin_test banker;
	
	
	
	

	@Test(priority=0)
	public void TC030_Creat_a_branch_valid_data() throws Exception
	{   
		banker = new Datadriven_Admin_test(driver);
		banker.Creat_a_branch_with_valid_data();
		
		
	}
	
	

	@Test(priority=1)
	public void TC031_Creat_a_branch_with_Blank_data() throws Exception
	{   
		banker = new Datadriven_Admin_test(driver);
		banker.Creat_a_branch_with_Blank_data();
		
		
	}
	
	
	
	
	@Test(priority=2,dependsOnMethods="TC030_Creat_a_branch_valid_data")
	public void TC032_Creat_a_branch_invalid_data() throws Exception
	{   
		banker = new Datadriven_Admin_test(driver);
		banker.Creat_a_branch_with_invalid_data();
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	  public void afterMethod(Method method) throws Exception
	  {
		  Repository R = new Repository(driver);
		  R.Capture_Screen_At_Alert(method);
		  
	  }
	
	
	 @BeforeClass
	  public void beforeClass()
	  {
		  
		  System.setProperty("webdriver.chrome.driver", Driver_Path);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	  
	  

	  @AfterClass
	  public void afterClass() throws Exception
	  {
		  Thread.sleep(15000);
		  driver.close();
		  
	  }

}
