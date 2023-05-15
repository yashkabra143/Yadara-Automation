package com.yadara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath ="//span[contains(text(),'Sign In')]")
	WebElement homesignin;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement signinbtn;
	@FindBy(xpath = "//span[contains(text(),'Forgot Password')]")
	WebElement forgotpwd;
	@FindBy(xpath = "//span[contains(text(),'Sign up')]")
	WebElement signupbtn;
	@FindBy(xpath = "//header/nav[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/span[1]/div[1]/img[1]")
	WebElement avatar;
	
	//initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void homesigninbtn() {
		homesignin.isDisplayed();
	}
	//Actions
	public void login(String un, String pwd) {
		homesignin.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		signinbtn.click();
	}
	public boolean avatar() {
		return avatar.isDisplayed();
	}
	public void enteremail() {
		//email.sendKeys("");
	}
	

}
