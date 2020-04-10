package com.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	@FindBy(id = "login2")
	WebElement loginbtn;
	@FindBy(id = "loginusername")
	WebElement usernameelement;
	@FindBy(id = "loginpassword")
	WebElement passwordelement;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement login;
	@FindBy(xpath = "//a[@id='logout2']")
	WebElement logout;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	// TO click on login button in menu bar
	public void loginBtn() {
		loginbtn.click();
	}

	// To enter username
	public void setUserName(String userName) {

		usernameelement.sendKeys(userName);
	}

	// To enter password
	public void setPassword(String passWord) {

		passwordelement.sendKeys(passWord);
	}

	// Click on login button
	public void login() {
		login.click();
	}

//To get username
	public String getUserName() {

		return usernameelement.getText();
	}

}
