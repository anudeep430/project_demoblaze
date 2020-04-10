package com.stepdefinition.signup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.SignUpPage;
import com.stepdefinition.login.Login_TC;
import utility.ScreenShot;
import wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUp_TC extends BaseClass {
	WebDriver driver = null;
	SignUpPage signup;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	@Given("^user clicks on signup button$")
	public void user_clicks_on_signup_button() throws Throwable {
		driver = launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
		signup = new SignUpPage(driver);
		screenshot = new ScreenShot(driver);
		signup.signUpBtn();
	}

	@Then("^user enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {
		Thread.sleep(3000);
		Assert.assertFalse(false);
		logger.trace("Fill with valid credentials");
		signup.setUserName(username);
		signup.setPassword(password);

	}

	@Then("^click on signup$")
	public void click_on_signup() throws Throwable {
		logger.info("Signup");
		signup.signUp();
		Thread.sleep(5000);
		logger.warn("Window Alert");
		String text = driver.switchTo().alert().getText();
		Assert.assertNotEquals("added", text);
		windowAlert();
		quit();

	}

}
