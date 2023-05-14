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

public class LoginTC01 extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginTC01() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void  loginpage() throws InterruptedException {
		Thread.sleep(3000);
		homepage.Clickcrossbtn();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean Actual = loginpage.avtar();
		WebElement Expected = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/span[1]/div[1]/img[1]"));
		Assert.assertEquals(Actual,Expected);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
