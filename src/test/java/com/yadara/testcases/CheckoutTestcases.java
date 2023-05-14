package com.yadara.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yadara.base.TestBase;
import com.yadara.pages.CategoriesPage;
import com.yadara.pages.ContactInformationPage;
import com.yadara.pages.Header;
import com.yadara.pages.HomePage;
import com.yadara.pages.LoginPage;
import com.yadara.pages.PaymentPage;
import com.yadara.utils.TestUtils;

public class CheckoutTestcases extends TestBase{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		LoginPage loginpage;
		Header header;
		HomePage homepage;
		CategoriesPage category;
		ContactInformationPage continfopage;
		PaymentPage paymentpage;
		TestUtils testutils;
		
		String sheetName = "payment";
		
		
		public CheckoutTestcases() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			initialization();
			loginpage = new LoginPage();
			header = new Header();
			homepage = new HomePage();
			category = new CategoriesPage();
			continfopage = new ContactInformationPage();
			paymentpage = new PaymentPage();
		}
		
		@DataProvider
		public Object[][] getpaymentdata() {
			Object[][] data=TestUtils.getTestData(sheetName);
			return data;	
		}
		
		@Test (priority = 1, dataProvider = "getpaymentdata")
		public void TC_Checkout_Without_Signin_User(String Firstname, String Lastname, String Cardnumber, String ExpirationDate, String CVV, String StreetAddress, String City, String State, String ZipCode) throws InterruptedException {
			Thread.sleep(3000);
			homepage.Clickcrossbtn();
			header.selectsamsmithconcert();
			category.addtocartcategory();
			continfopage.fillcontactpage("yash","kabra","yash@yadara.com","8370043219");
			paymentpage.fillpaymentpageinfo(Firstname, Lastname, Cardnumber, ExpirationDate, CVV, StreetAddress, City, State, ZipCode);
		
		}
		@Test(priority = 2, dataProvider = "getpaymentdata")
		public void TC_Checkout_With_SignIn_User(String Firstname, String Lastname, String Cardnumber, String ExpirationDate, String CVV, String StreetAddress, String City, String State, String ZipCode) throws InterruptedException {
			Thread.sleep(3000);
			homepage.Clickcrossbtn();
			loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			header.selectsamsmithconcert();
			category.addtocartcategory();
			continfopage.clickonpayment();
			paymentpage.fillpaymentpageinfo(Firstname, Lastname, Cardnumber, ExpirationDate, CVV, StreetAddress, City, State, ZipCode);	
	
		}

		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
}
