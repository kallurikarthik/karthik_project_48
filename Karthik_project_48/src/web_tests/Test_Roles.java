package web_tests;

import org.testng.annotations.Test;

import web_pages.Admin_Home;
import web_pages.New_Role_info;
import web_pages.Ranford_Home;
import web_pages.Roles_info;
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

public class Test_Roles {
  
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	Robot robot;
	
	
	@Test(priority=0)
	  public void Tc007_Admin_Create_New_Role_Valid() throws Exception
	  {
		  Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		  
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Roles_button();
		  
		  Roles_info RI=new Roles_info(driver);
		  RI.Click_on_New_Role_button();
		  
		  New_Role_info NRI=new New_Role_info(driver);
		  Assert.assertTrue(NRI.Is_Roles_Homepage_opened());
		  NRI.Type_on_Role_Name_editbox("karthikkkkkkkk");
		  NRI.Type_on_Role_desc_editbox("Accepts money deposits,money withdraw, cheque deposits and cheque withdraw");
		  NRI.Select_Role_type_dropdown("E");
		  NRI.Click_on_Submit_button();
		  Thread.sleep(5000);
		  
		  Assert.assertTrue(NRI.is_Alertpresent());
	      NRI.Close_Alert();
		  
	  }
	@Test(priority=1)
	   public void Tc008_Admin_Create_New_Role_Invalid() throws Exception
	   {
	   
	      Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Roles_button();
		  
		  Roles_info RI=new Roles_info(driver);
		  RI.Click_on_New_Role_button();
		  
		  New_Role_info NRI=new New_Role_info(driver);
		  Assert.assertTrue(NRI.Is_Roles_Homepage_opened());
		  NRI.Type_on_Role_Name_editbox("ka");
		  NRI.Role_Name_editbox.sendKeys(Keys.TAB);
		  Thread.sleep(4000);
		  
		  Assert.assertTrue(NRI.is_Alertpresent());
	      NRI.Close_Alert();
	      
		  
	   }
	
	@Test(priority=2)
	public void Tc009_Admin_Create_New_Role_Blank() throws InterruptedException
	{
		
		
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Roles_button();
		  
		  Roles_info RI=new Roles_info(driver);
		  RI.Click_on_New_Role_button();
		  
		  New_Role_info NRI=new New_Role_info(driver);
		  Assert.assertTrue(NRI.Is_Roles_Homepage_opened());
		  
		  NRI.Click_on_Submit_button();
		  Thread.sleep(4000);
		  
		  Assert.assertTrue(NRI.is_Alertpresent());
		  
		  NRI.Close_Alert();
		  
		
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
	  Thread.sleep(10000);
	  driver.close();
	  
  }

}
