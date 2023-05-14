package com.yadara.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;

public class CategoriesPage extends TestBase{
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/li[1]/div[1]/div[4]/button[1]")
	WebElement buynowbtn;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[2]/button[1]")
	WebElement pricebtn;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[1]")
	WebElement qtybtn;
	@FindBy(xpath = "//button[@id='pre-checkout-price-cta']")
	WebElement continuebtn;
	
	
	public CategoriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartcategory() {
		js.executeScript("arguments[0].scrollIntoView();", buynowbtn);
		buynowbtn.click();
		pricebtn.click();
		qtybtn.click();
		continuebtn.click();	
		
	}
	
	//h3[contains(text(),'Order Confirmed!')]
	
	
	
	
	
}
