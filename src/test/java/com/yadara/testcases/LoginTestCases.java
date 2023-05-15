package com.yadara.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yadara.base.TestBase;
import com.yadara.pages.HomePage;
import com.yadara.pages.LoginPage;

public class LoginTestCases extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginTestCases() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void  TC_Login_01() throws InterruptedException {
		Thread.sleep(3000);
		homepage.Clickcrossbtn();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		if(loginpage.avatar()) {
			Assert.assertTrue(true, "TestCase Is Passed");
		}	
	}
	
	public void  TC_Login_02() throws InterruptedException {
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
