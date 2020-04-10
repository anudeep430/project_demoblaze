package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(linkText = "Home")
	WebElement home;
	@FindBy(linkText = "Contact")
	WebElement contact;
	@FindBy(linkText = "About us")
	WebElement about;
	@FindBy(id = "cartur")
	WebElement cart;
	public WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// To click on home
	public void home() {
		home.click();
	}

	// To click on contact
	public void contact() {
		contact.click();
	}

	// To click on about
	public void about() {
		about.click();
	}

	// To click on cart
	public void cart() {
		cart.click();
	}

}
