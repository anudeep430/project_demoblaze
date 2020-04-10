package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorsPage extends BasePage {
	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	WebElement monitor;
	@FindBy(linkText = "Apple monitor 24")
	WebElement monitorselect;
	@FindBy(linkText = "Add to cart")
	WebElement cart;

	public MonitorsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	// To click on monitor
	public void monitor() {
		monitor.click();
	}

	// To click on desired monitor
	public void selectMonitor() {
		monitorselect.click();
	}

	// Add to cart
	public void cart() {
		cart.click();
	}

	// To get String
	public String getText() {
		return monitorselect.getText();
	}
}
