package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(id = "signin2")
	WebElement signupbtn;
	@FindBy(id = "sign-username")
	WebElement userelement;
	@FindBy(id = "sign-password")
	WebElement passwordelement;
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement signup;

	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// To click on signup button
	public void signUpBtn() {
		signupbtn.click();
	}

	// Enter username
	public void setUserName(String username) {
		userelement.sendKeys(username);
	}

	// Enter password
	public void setPassword(String password) {
		passwordelement.sendKeys(password);
	}

	// To click on signup
	public void signUp() {
		signup.click();
	}
}