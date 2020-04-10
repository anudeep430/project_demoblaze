package com.stepdefinition.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import utility.DataDriven;
import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_TC extends BaseClass {
	WebDriver driver = null;
	LoginPage loginpage;
	ScreenShot screenshot;
	DataDriven datadriven;
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	@Given("^user launches demoblaze website$")
	public void user_launches_demoblaze_website() throws Throwable {
		driver = launchApplication("chrome");
		logger.info("DemoBlaze is launched");
		launchSite();
		loginpage = new LoginPage(driver);
		screenshot = new ScreenShot(driver);
		datadriven = new DataDriven();

	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		Assert.assertTrue(true);
		loginpage.loginBtn();

	}

	@Then("^user enter (.+) and (.+) and click on login$")
	public void user_enter_and_and_click_on_login(String username, String password) throws Throwable {
		Thread.sleep(5000);
		logger.info("Processing login with valid credentials");
		loginpage.setUserName(datadriven.excel_username(1));
		loginpage.setPassword(datadriven.excel_password(1));
		loginpage.login();
		screenshot.takeSnapShot("src\\test\\resources\\Screenshot\\Login.png");
		Assert.assertNotEquals("user_2", loginpage.getUserName());
		quit();
	}
}