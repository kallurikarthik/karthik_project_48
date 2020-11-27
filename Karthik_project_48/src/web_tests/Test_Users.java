package web_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web_pages.Admin_Home;
import web_pages.Newuser_info;
import web_pages.Ranford_Home;
import web_pages.Users_info;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Method;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_Users 
{
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	Robot robot;
	
	
	@Test(priority=0)
	public void Tc013_Admin_Create_New_User_Valid() throws Exception 
	{
		  Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		  
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Users_button();
		  Users_info UI=new Users_info(driver);
		  UI.Click_on_Newuser_button();
		  
		  Newuser_info NUI=new Newuser_info(driver);
		  NUI.Select_Role_dropdown("icustomer");
		  Thread.sleep(2000);
		  NUI.Select_Branch_dropdown("HayathNagar");
		  Thread.sleep(2000);
		  NUI.Select_Customer_ID_dropdown("38");
		  Thread.sleep(2000);
		  NUI.Type_Customer_Name_editbox("dongarirushi");
		  Thread.sleep(2000);
		  NUI.Type_user_name_editbox("Rushi54");
		  Thread.sleep(2000);
		  NUI.Type_Login_password_editbox("Karthik@30");
		  Thread.sleep(2000);
		  NUI.Type_Transaction_password_editbox("Karthik@30");
		  Thread.sleep(2000);
		  NUI.Click_on_Submit_button();
		  
          Thread.sleep(4000);
		  
		  Assert.assertTrue(NUI.is_Alertpresent());
		  
		  NUI.Close_Alert();
		  
	}
	
	@Test(priority=1)
	public void Tc014_Admin_Create_New_user_blank() throws Exception
	{

		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Users_button();
		  Users_info UI=new Users_info(driver);
		  UI.Click_on_Newuser_button();
		  
		  Newuser_info NUI=new Newuser_info(driver);
		  Assert.assertTrue(NUI.Is_User_homepage_opened());
		  NUI.Click_on_Submit_button();
		  
           Thread.sleep(4000);
		  
		  Assert.assertTrue(NUI.is_Alertpresent());
		  
		  NUI.Close_Alert();
		
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
