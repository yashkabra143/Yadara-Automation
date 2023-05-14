package com.yadara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;

public class ContactInformationPage extends TestBase{

	@FindBy(name = "first_name")
	WebElement firstname;
	@FindBy(name = "last_name")
	WebElement lastname;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "phone")
	WebElement phoneno;
	@FindBy(xpath = "//button[contains(text(),'Continue to Payments')]")
	WebElement paymentbtn;
	
	public ContactInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void fillcontactpage(String contfname, String Contlname, String Contemail, String contphone) {
		firstname.sendKeys(contfname);
		lastname.sendKeys(Contlname);
		email.sendKeys(Contemail);
		phoneno.sendKeys(contphone);
		paymentbtn.click();
		
	}
	public void clickonpayment() {
		paymentbtn.click();
	}
}
