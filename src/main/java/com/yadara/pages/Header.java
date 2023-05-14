package com.yadara.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yadara.base.TestBase;


public class Header extends TestBase{
	Actions action = new Actions(driver);
	
	@FindBy(xpath = "//header/nav[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement yadaralogo;
	@FindBy(xpath = "//a[contains(text(),'Sports')]")
	WebElement headersports;
	@FindBy(xpath = "//a[contains(text(),'Concerts')]")
	WebElement headerconcerts;
	@FindBy(xpath = "//a[contains(text(),'Theatre')]")
	WebElement headertheatre;
	@FindBy(xpath = "//body[1]/div[1]/header[1]/nav[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement headersearch;
	@FindBy(css = "nav.navbar.navbar-expand-lg.navbar-light.bg-light.nav-section.yadara-header-sec.bg-black-navbar div.container.custom-header-section.mobile-container-section div.custom-header-mobile-section div.collapse.navbar-collapse.yadara-right-search-menu:nth-child(6) ul.navbar-nav.humburger-section li.nav-item:nth-child(1) > span.nav-link.currency-menu.pl-0")
	WebElement currency;
	@FindBy(xpath = "//a[contains(text(),'Sam Smith')]")
	WebElement samsmithconcert;
	
			public Header() {
				PageFactory.initElements(driver, this);
			}
			public void clicksportslink() {
				headersports.click();
			}
			public void clickconcertslink() {
				headerconcerts.click();
			}
			public void clicktheatrelink() {
				headertheatre.click();
			}
			public void selectsamsmithconcert() {
				action.moveToElement(headerconcerts).perform();
				samsmithconcert.click();
			}
			
}
