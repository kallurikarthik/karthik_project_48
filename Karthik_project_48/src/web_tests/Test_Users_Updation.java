package web_tests;

import org.testng.annotations.Test;

import web_pages.Admin_Home;
import web_pages.Ranford_Home;
import web_pages.User_Update_page;
import web_pages.Users_info;

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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_Users_Updation 
{
    
	WebDriver driver;
	String Driver_Path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Drivers\\chromedriver.exe";
	String Screen_path="C:\\Users\\karthik\\git\\karthik_project_48\\Karthik_project_48\\Screens\\";
	Robot robot;
	String Expected_Header_txt="User Updation";
	
	
	
	
	@Test(priority=0)
	public void Tc019_verify_Users_deletion_link() throws Exception 
	{
		  Ranford_Home RHP=new Ranford_Home(driver);
		  Assert.assertTrue(RHP.Is_Ranford_Homepage_opened());
		  RHP.Type_admin_Username_Editbox("Admin");
		  RHP.Type_admin_Password_Editbox("M1ndq");
		  RHP.Click_on_admin_login_button();
		
		  Admin_Home AH=new Admin_Home(driver);
		  AH.Click_on_Users_button();
		  
		  Users_info UI=new Users_info(driver);
		  UI.Click_on_Delete_button();
		  
		  Thread.sleep(5000);
		  Assert.assertTrue(UI.is_Alertpresent());
	      UI.Close_Alert();
	      
	      Thread.sleep(5000);
		  Assert.assertTrue(UI.is_Alertpresent());
	      UI.Close_Alert();
		  
		  
		  
	 }
	
	@Test(priority=1)
	public void Tc020_Verify_User_updation_link()
	{
		
		Users_info UI=new Users_info(driver);
		 UI.Click_on_Edit_button();
		 
		 User_Update_page UUP=new  User_Update_page(driver);
		 String Header_txt=UUP.Header_txt.getText();
		 

		 if (Header_txt.equals(Expected_Header_txt)) 
			{
				System.out.println(Header_txt);
			}
			else
				System.out.println("Expected header txt not displayed");
		
		 
		  
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
	  driver.getTitle();
	  
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  
	  Thread.sleep(15000);
	  driver.close();
	  
  }

}
