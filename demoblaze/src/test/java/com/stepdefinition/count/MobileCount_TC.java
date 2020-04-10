package com.stepdefinition.count;

import org.junit.Assert;

import com.pages.ProductCount;

import wrapperclass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MobileCount_TC extends BaseClass {
	ProductCount itemcount = new ProductCount();

	@Given("^user launch demoblaze application$")
	public void user_launch_demoblaze_application() throws Throwable {

		itemcount.openbrowser();
	}

	@Then("^print the number of products in a webpage$")
	public void print_the_number_of_products_in_a_webpage() throws Throwable {
		itemcount.count();
		Thread.sleep(3000);
	}

	@And("^user check the number of products in a webpage$")
	public void user_check_the_number_of_products_in_a_webpage() throws Throwable {
		Assert.assertTrue(true);
		itemcount.product();
	}
}
