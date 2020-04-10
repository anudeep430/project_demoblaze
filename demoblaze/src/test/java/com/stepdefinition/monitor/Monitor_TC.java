package com.stepdefinition.monitor;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.pages.BasePage;
import com.pages.MonitorsPage;
import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Monitor_TC extends BaseClass {
	MonitorsPage monitorpage;
	BasePage basepage;
	ScreenShot screenshot;
	WebDriver driver = null;
	final static Logger logger = LogManager.getLogger(Monitor_TC.class.getName());

	@Given("^user click on monitor$")
	public void user_click_on_monitor() throws Throwable {

		driver = launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
		screenshot = new ScreenShot(driver);
		basepage = new BasePage(driver);
		monitorpage = new MonitorsPage(driver);
		logger.info("Click on monitor");
		monitorpage.monitor();
	}

	@When("^user click on dersired monitor$")
	public void user_click_on_dersired_monitor() throws Throwable {
		implicitWait();
		Assert.assertEquals("Apple monitor 24", monitorpage.getText());
		logger.info("Slect a monitor");
		monitorpage.selectMonitor();
	}

	@Then("^succeed to cart$")
	public void click_on_cart_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		basepage.cart();
		Thread.sleep(2000);
		Assert.assertTrue(true);
		screenshot.takeSnapShot("src\\test\\resources\\Screenshot\\Monitor.png");
		quit();
	}

	@And("^add desired monitor to cart$")
	public void user_click_on_add_to_cart() throws Throwable {

		logger.info("Add monitor to cart");
		monitorpage.cart();
		Thread.sleep(3000);
		logger.warn("Window Alert");
		windowAlert();
	}

}
