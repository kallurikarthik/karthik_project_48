
package web_tests;

import org.testng.annotations.Test;

import web_pages.Admin_Home;
import web_pages.Branches_info_page;
import web_pages.New_Branch_Info;

import web_pages.Ranford_Home;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import java.lang.reflect.Method;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Test_Branches 
{
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	Robot robot;
	
	
	
  @Test(priority=0)
  public void Tc001_Admin_login_Invalid_Password() throws Exception 
  {
	  Ranford_Home RHP=new Ranford_Home(driver);
	  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
	  RHP.Type_admin_Username_Editbox("Admin");
	  RHP.Type_admin_Password_Editbox("Admin");
	  RHP.Click_on_admin_login_button();
	  Thread.sleep(5000);
	  
	  Assert.assertTrue(RHP.is_Alertpresent());
	  
	  RHP.Close_Alert();
	 
  }
  
  @Test(priority=1)
  public void Tc002_Admin_login_Invalid_Username() throws Exception
  {
	  Ranford_Home RHP=new Ranford_Home(driver);
	  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
	  RHP.Type_admin_Username_Editbox("Rakesh");
	  RHP.Type_admin_Password_Editbox("M1ndq");
	  RHP.Click_on_admin_login_button();
	  
	  Thread.sleep(5000);
	  
	  Assert.assertTrue(RHP.is_Alertpresent());
	  
	  RHP.Close_Alert();
	  
  }
  
  @Test(priority=2)
  public void Tc003_Admin_login_valid()
  {
	  Ranford_Home RHP=new Ranford_Home(driver);
	  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
	  RHP.Type_admin_Username_Editbox("Admin");
	  RHP.Type_admin_Password_Editbox("M1ndq");
	  RHP.Click_on_admin_login_button();
	  
  }
  
  @Test(priority=3)
  public void Tc004_Admin_Create_New_branch_Valid() throws Exception
  {
	  Admin_Home AH=new Admin_Home(driver);
	  AH.Click_on_Branches_button();
	  
	  Branches_info_page BI=new Branches_info_page(driver);
	  BI.Click_on_New_branch_button();
	  
	  New_Branch_Info NBI=new New_Branch_Info(driver);
	  Assert.assertTrue(NBI.Is_New_Branch_Homepage_opened());
	  NBI.Type_Branch_Name_edit_box("Whangareiii");
	  NBI.Type_Address1_editbox("59 Hill top Avenue");
	  NBI.Type_Address2_editbox("Morningsidee");
	  NBI.Type_Address3_editbox("Whangarei westt");
	  NBI.Type_Area_editbox("Whangareii");
	  NBI.Type_Zipcode_editbox("50006");
	  NBI.Select_Country_dropdown("INDIA");
	  NBI.Select_State_dropdown("Andhra Pradesh");
	  NBI.Select_City_dropdown("Hyderabad");
	  NBI.Click_on_Submit_button();
	  Thread.sleep(5000);
	  
	  Assert.assertTrue(NBI.is_Alertpresent());
      NBI.Close_Alert();
  }
  
  @Test(priority=4)
  public void Tc005_Admin_Create_New_branch_Invalid_BranchName() throws Exception
  {
	  Admin_Home AH=new Admin_Home(driver);
	  AH.Click_on_Branches_button();
	  
	  Branches_info_page BI=new Branches_info_page(driver);
	  BI.Click_on_New_branch_button();
	  
	  New_Branch_Info NBI=new New_Branch_Info(driver);
	  Assert.assertTrue(NBI.Is_New_Branch_Homepage_opened());
	  NBI.Type_Branch_Name_edit_box("abcd");
	  NBI.Branch_Name_edit_box.sendKeys(Keys.TAB);
	  Thread.sleep(4000);
	  
      Assert.assertTrue(NBI.is_Alertpresent());
      NBI.Close_Alert();
      NBI.Click_on_home_button();
     
      
	  
  }
  
  @Test(priority=5)
  public void Tc006_Admin_Create_New_branch_Blank() throws Exception
  {
	  Admin_Home AH=new Admin_Home(driver);
	  AH.Click_on_Branches_button();
	  
	  Branches_info_page BI=new Branches_info_page(driver);
	  BI.Click_on_New_branch_button();
	  
	  New_Branch_Info NBI=new New_Branch_Info(driver);
	  Assert.assertTrue(NBI.Is_New_Branch_Homepage_opened());
	  
	  NBI.Click_on_Submit_button();
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(NBI.is_Alertpresent());
      NBI.Close_Alert();
	  
	  
  }
  
  

  @AfterMethod
  public void afterMethod(Method method) throws Exception
  {
	  Dimension scree_size=Toolkit.getDefaultToolkit().getScreenSize();
	  robot=new Robot();
	  BufferedImage Bimage=robot.createScreenCapture(new Rectangle(scree_size));
	  ImageIO.write(Bimage, "PNG", new File(Screen_path+method+".png")); 
	  
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
