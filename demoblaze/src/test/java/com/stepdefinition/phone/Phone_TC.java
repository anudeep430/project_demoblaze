package com.stepdefinition.phone;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.pages.BasePage;

import com.pages.PhonesPage;

import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Phone_TC extends BaseClass {

	PhonesPage phonepage;
	ScreenShot screenshot;
	BasePage basepage;
	final static Logger logger = LogManager.getLogger(Phone_TC.class.getName());

	@Given("^user click on phone$")
	public void user_click_on_phone() throws Throwable {
		launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();

		phonepage = new PhonesPage(driver);
		basepage = new BasePage(driver);
		screenshot = new ScreenShot(driver);
		logger.info("Click on mobile");
		phonepage.mobile();
	}

	@When("^user click on the desired mobile phone$")
	public void user_click_on_the_desired_mobile_phone() throws Throwable {
		implicitWait();
		System.out.println(phonepage.getMobile());
		Assert.assertEquals("Sony xperia z5", phonepage.getMobile());
		logger.info("Select a mobie");
		phonepage.selectMobile();

	}

	@Then("^click on cart$")
	public void click_on_cart_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertTrue(true);
		basepage.cart();
		Thread.sleep(2000);
		screenshot.takeSnapShot("src\\test\\resources\\Screenshot\\Phone.png");
		quit();
	}

	@And("^user clicks add to cart$")
	public void user_click_o_add_to_cart() throws Throwable {

		logger.info("Add product to cart");
		phonepage.cart();
		Thread.sleep(1000);
		logger.warn("Window alert");
		windowAlert();

	}

}
