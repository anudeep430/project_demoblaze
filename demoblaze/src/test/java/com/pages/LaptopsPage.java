package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPage extends BasePage {
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement laptop;
	@FindBy(linkText = "MacBook air")
	WebElement laptopselect;
	@FindBy(linkText = "Add to cart")
	WebElement cart;

	public LaptopsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// To click on laptop
	public void laptop() {
		laptop.click();
	}

	// To click on desired laptop
	public void selectLaptop() {
		laptopselect.click();
	}

	// Add to cart
	public void cart() {
		cart.click();
	}

	// TO get String
	public String getLaptop() {
		return laptopselect.getText();
	}

}
