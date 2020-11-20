package web_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web_pages.Admin_Home;
import web_pages.Employee_info;
import web_pages.New_Employee_info;
import web_pages.Ranford_Home;

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

public class Test_Employer 
{
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	Robot robot;
  
  
	@Test(priority=0)
	public void Tc010_Admin_Create_New_Employee_Valid() throws Exception
	{
		Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		  
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Employee_button();
		  
		  Employee_info EI=new Employee_info(driver);
		  EI.Click_on_New_Employee_button();
		  
		  New_Employee_info NEI=new New_Employee_info(driver);
		  NEI.Type_Employer_editbox("karthik");
		  NEI.Type_Login_password_editbox("Karthik@30");
		  NEI.Select_Role_dropdown("karthikkkkkkkk");
		  NEI.Select_Branch_dropdown("Whangareiii");
		  NEI.Click_on_Submit_button();
		  
         Thread.sleep(5000);
		  
		  Assert.assertTrue(NEI.is_Alertpresent());
	      NEI.Close_Alert();
		  
		
	}
	
	@Test(priority=1)
	public void Tc011_Admin_Create_New_Employee_Invalid() throws Exception
	{
		  Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		  
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Employee_button();
		  
		  Employee_info EI=new Employee_info(driver);
		  EI.Click_on_New_Employee_button();
		  
		  New_Employee_info NEI=new New_Employee_info(driver);
		  NEI.Type_Employer_editbox("ka");
		  NEI.Employer_editbox.sendKeys(Keys.TAB);
		  
          Thread.sleep(5000);
		  
		  Assert.assertTrue(NEI.is_Alertpresent());
	      NEI.Close_Alert();
		  
		 }
	
	
	@Test(priority=2)
	public void Tc012_Admin_Create_New_Employee_Blank() throws InterruptedException
	{
		  Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		  
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Employee_button();
		  
		  Employee_info EI=new Employee_info(driver);
		  EI.Click_on_New_Employee_button();
		  
		  New_Employee_info NEI=new New_Employee_info(driver);
		  NEI.Click_on_Submit_button();
		  
		  Thread.sleep(5000);
		  
		  Assert.assertTrue(NEI.is_Alertpresent());
	      NEI.Close_Alert();
		  
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
	  System.setProperty("webdriver.chrome.driver",Driver_Path);
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
