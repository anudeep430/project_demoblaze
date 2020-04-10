package com.stepdefinition.purchase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.BasePage;
import com.pages.PhonesPage;
import com.pages.PlaceOrder;
import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchase_TC extends BaseClass {
	WebDriver driver = null;
	PlaceOrder placeorder;
	PhonesPage phonepage;
	BasePage basepage;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(Purchase_TC.class.getName());

	@Given("^user click on desired product$")
	public void user_click_on_desired_product() throws Throwable {
		driver = launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
		phonepage = new PhonesPage(driver);
		basepage = new BasePage(driver);
		placeorder = new PlaceOrder(driver);
		screenshot = new ScreenShot(driver);
		implicitWait();
		logger.info("Select a product");
		phonepage.selectMobile();

	}

	@When("^user click on add to cart$")
	public void user_click_on_add_to_cart() throws Throwable {

		logger.info("add product to cart");
		phonepage.cart();
		Thread.sleep(1000);
		logger.debug("Window Alert");
		String text = driver.switchTo().alert().getText();
		Assert.assertEquals("Product added", text);
		windowAlert();

	}

	@And("^move to cart page$")
	public void click_on_cart_page() throws Throwable {
		Assert.assertFalse(false);
		basepage.cart();
	}

	@And("^click on place order$")
	public void click_on_place_order() throws Throwable {
		Thread.sleep(1000);
		logger.info("Order product");
		placeorder.order();
	}

	@And("^fill the details$")
	public void fill_the_details() throws Throwable {

		logger.trace("Fill all the details");
		Assert.assertNotEquals("user", placeorder.getText());
		placeorder.name();
		placeorder.country();
		placeorder.city();
		placeorder.creditCard();
		placeorder.month();
		placeorder.year();

	}

	@And("^click on purchase$")
	public void click_on_purchase() throws Throwable {

		logger.info("Purchase product");
		Assert.assertTrue(true);
		placeorder.purchase();

	}

	@Then("^click on ok$")
	public void click_on_ok() throws Throwable {

		screenshot.takeSnapShot("src\\test\\resources\\Screenshot\\Purchase.png");
		placeorder.confirmOrder();
		quit();

	}
}
