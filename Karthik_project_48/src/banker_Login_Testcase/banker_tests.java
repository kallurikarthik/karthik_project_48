package banker_Login_Testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Keywords.Repository;
import web_pages.Ranford_Home;
import web_pages_Banker.Bankers_homepage;
import web_pages_Banker.Payments_Transaction_page;
import web_pages_Banker.Payments_homepage;
import web_pages_Banker.Receipts_Homepage;
import web_pages_Banker.Receipts_Transaction_page;

public class banker_tests extends Repository
{
	
	WebDriver driver;

	public banker_tests(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		Set_timeout();
		
	}
	
	
	
	

	public void Banker_login(String Branch_Name, String Banker_Name, String Banker_Password,String Exp_title)
	{
		Ranford_Home RH=new Ranford_Home(driver);
		Select_Drodpown(RH.Branch_Selection_Dropdown,Branch_Name);
		Type_text(RH.admin_Username_Editbox,Banker_Name);
		Type_text(RH.admin_Password_Editbox,Banker_Password);
		click_element(RH.admin_login_button);
		Assert.assertTrue(Is_title_presented(Exp_title));
	}
	
	
	public void Receipts_DD_Deposit_using_Valid_AccoutNumber(String AccoutNumber, String Customer_name) throws Exception
	{
		Bankers_homepage BH=new Bankers_homepage(driver);
		click_element(BH.Receipts_button);
		Receipts_Homepage RHP=new Receipts_Homepage(driver);
		Type_text(RHP.Account_number_Editbox,AccoutNumber);
		Select_Drodpown(RHP.Transaction_type_dropdown,"dd deposite(+)");
		Receipts_Transaction_page RTP=new Receipts_Transaction_page(driver);
		Assert.assertTrue(wait_and_verify_element_visible(RTP.Customer_name_editbox));
		Assert.assertTrue(Verify_input_Value(RTP.Customer_name_editbox,Customer_name));
		
	
	}
	
	public void Receipts_DD_Deposit_using_inValid_AccoutNumber(String invalid_AccoutNumber, String Transaction_Type) throws Exception
	{
		Bankers_homepage BH=new Bankers_homepage(driver);
		click_element(BH.Receipts_button);
		Receipts_Homepage RHP=new Receipts_Homepage(driver);
		Type_text(RHP.Account_number_Editbox,invalid_AccoutNumber);
		Select_Drodpown(RHP.Transaction_type_dropdown,"dd deposite(+)");
		Thread.sleep(5000);
		is_AlertPresent();
		close_Alert();
		
	}
	
	public void Verify_DD_Deposit_Valid_Transaction(String Enter_Cash,String AccoutNumber,String Customer_name,String DD_Number) throws Exception
	{
		Receipts_DD_Deposit_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		Receipts_Transaction_page RTP = new Receipts_Transaction_page(driver);
		String Before_Balance=Get_editbox_input(RTP.Account_balance_editbox);
		double Bf_balance=Double.parseDouble(Before_Balance);
		System.out.println(Bf_balance);
		
		Type_text(RTP.Amount_editbox, Enter_Cash);
		Thread.sleep(3000);
		Type_text(RTP.Cheque_DD_number_editbox,DD_Number);
		click_element(RTP.Submit_button);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Receipts_DD_Deposit_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		
		String After_Balance=Get_editbox_input(RTP.Account_balance_editbox);
		double Af_balance=Double.parseDouble(After_Balance); 
		System.out.println(Af_balance);
		
		double total=Af_balance-Bf_balance;
		double E_cash=Double.parseDouble(Enter_Cash);
		Assert.assertEquals(total, E_cash);
		System.out.println("Transaction completed");
		
	}
	
	public void Receipts_Cheque_Deposit_using_Valid_AccoutNumber(String AccoutNumber, String Customer_name) throws Exception
	{
		Bankers_homepage BH=new Bankers_homepage(driver);
		click_element(BH.Receipts_button);
		Receipts_Homepage RHP=new Receipts_Homepage(driver);
		Type_text(RHP.Account_number_Editbox,AccoutNumber);
		Select_Drodpown(RHP.Transaction_type_dropdown,"cheque deposite(+)");
		Receipts_Transaction_page RTP=new Receipts_Transaction_page(driver);
		Assert.assertTrue(wait_and_verify_element_visible(RTP.Customer_name_editbox));
		Assert.assertTrue(Verify_input_Value(RTP.Customer_name_editbox,Customer_name));
		
	
	}
	
	public void Verify_Cheque_Deposit_Valid_Transaction(String Enter_Cash,String AccoutNumber,String Customer_name,String cheque_number) throws Exception
	{
		Receipts_Cheque_Deposit_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		Receipts_Transaction_page RTP = new Receipts_Transaction_page(driver);
		String Before_Balance=Get_editbox_input(RTP.Account_balance_editbox);
		double Bf_balance=Double.parseDouble(Before_Balance);
		System.out.println(Bf_balance);
		
		Type_text(RTP.Amount_editbox, Enter_Cash);
		Thread.sleep(3000);
		Type_text(RTP.Cheque_DD_number_editbox,cheque_number);
		click_element(RTP.Submit_button);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Receipts_Cheque_Deposit_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		
		String After_Balance=Get_editbox_input(RTP.Account_balance_editbox);
		double Af_balance=Double.parseDouble(After_Balance); 
		System.out.println(Af_balance);
		
		double total=Af_balance-Bf_balance;
		double E_cash=Double.parseDouble(Enter_Cash);
		Assert.assertEquals(total, E_cash);
		System.out.println("Transaction completed");
		
	}
	
	public void Payments_Cash_Withdraw_using_Valid_AccoutNumber(String AccoutNumber, String Customer_name) throws Exception
	{
		Bankers_homepage BH=new Bankers_homepage(driver);
		click_element(BH.Payments_button);
		Payments_homepage PHP=new Payments_homepage(driver);
		Type_text(PHP.Account_number_Editbox,AccoutNumber);
		Select_Drodpown(PHP.Transaction_type_dropdown,"cash withdraw(-)");
		Payments_Transaction_page PTP=new Payments_Transaction_page(driver);
		
	}
		
		
	
	public void Verify_Cash_Withdraw_Valid_Transaction(String Enter_Cash,String AccoutNumber,String Customer_name) throws Exception
	{
		Payments_Cash_Withdraw_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		Payments_Transaction_page PTP = new Payments_Transaction_page(driver);
		String Before_Balance=Get_editbox_input(PTP.Available_balance);
		double Bfore_balance=Double.parseDouble(Before_Balance);
		System.out.println(Bfore_balance);
		
		Type_text(PTP.Amount_editbox, Enter_Cash);
		Thread.sleep(3000);
		click_element(PTP.Submit_button);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Payments_Cash_Withdraw_using_Valid_AccoutNumber(AccoutNumber, Customer_name);
		String After_Balance=Get_editbox_input(PTP.Available_balance);
		double Aftr_balance=Double.parseDouble(After_Balance); 
		System.out.println(Aftr_balance);
		
		double total=Bfore_balance-Aftr_balance;
		double Exp_cash=Double.parseDouble(Enter_Cash);
		Assert.assertEquals(total, Exp_cash);
		System.out.println("Transaction completed");
		
	}
	
	
	
	
}

