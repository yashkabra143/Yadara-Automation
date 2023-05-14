package com.yadara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/img")
	WebElement crsbtn;
	
	//initializing page objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public void Clickcrossbtn() {
			crsbtn.click();
			
		}
		
		
}
