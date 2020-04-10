package com.stepdefinition.laptop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.BasePage;
import com.pages.LaptopsPage;
import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Laptop_TC extends BaseClass {
	WebDriver driver = null;
	ScreenShot screenshot;
	LaptopsPage laptoppage;
	BasePage basepage;
	final static Logger logger = LogManager.getLogger(Laptop_TC.class.getName());

	@Given("^user click on laptop$")
	public void user_click_on_laptop() throws Throwable {

		driver = launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
		laptoppage = new LaptopsPage(driver);
		basepage = new BasePage(driver);
		screenshot = new ScreenShot(driver);
		logger.info("Click on laptop");
		laptoppage.laptop();

	}

	@When("^user click on desired laptop$")
	public void user_click_on_desired_laptop() throws Throwable {
		implicitWait();
		Assert.assertNotEquals("DELL", laptoppage.getLaptop());
		logger.info("Select laptop");
		laptoppage.selectLaptop();
	}

	@Then("^navigate to cart page$")
	public void click_on_cart_page() throws Throwable {
		basepage.cart();
		Thread.sleep(2000);
		screenshot.takeSnapShot("src\\test\\resources\\Screenshot\\Laptop.png");
		quit();
	}

	@And("^add product to cart$")
	public void user_click_on_add_to_cart() throws Throwable {

		logger.info("Add product to cart");
		laptoppage.cart();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		Assert.assertNotEquals("added", text);
		logger.warn("Window alert");
		windowAlert();
	}

}
