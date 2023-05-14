package com.yadara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;

public class PaymentPage extends TestBase{
	@FindBy(name = "firstName")
	WebElement payfname;
	@FindBy(name = "lastName")
	WebElement paylname;
	@FindBy(name = "card_number")
	WebElement paycardno;
	@FindBy(name = "expiration_date")
	WebElement payexpdate;
	@FindBy(name = "cvv")
	WebElement paycvv;
	@FindBy(name = "street_address")
	WebElement payaddress;
	@FindBy(name = "city")
	WebElement paycity;
	@FindBy(name = "state")
	WebElement paystate;
	@FindBy(name = "zip_code")
	WebElement payzip;
	@FindBy(xpath = "//button[contains(text(),'Order Tickets')]")
	WebElement payorderbtn;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void fillpaymentpageinfo(String Firstname, String Lastname, String Cardnumber, String ExpirationDate, String CVV, String StreetAddress, String City, String State, String ZipCode) {
		payfname.sendKeys(Firstname);
		paylname.sendKeys(Lastname);
		paycardno.sendKeys(Cardnumber);
		payexpdate.sendKeys(ExpirationDate);
		paycvv.sendKeys(CVV);
		payaddress.sendKeys(StreetAddress);
		paycity.sendKeys(City);
		paystate.sendKeys(State);
		payzip.sendKeys(ZipCode);
		payorderbtn.click();
	}
	
}
