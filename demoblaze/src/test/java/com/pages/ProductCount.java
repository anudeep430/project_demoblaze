package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductCount {

	WebDriver driver;
	int count;

	// To launch site
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// To click on product
	public void product() {
		List<WebElement> itemlist = driver.findElements(By.xpath("//a[@class='hrefch']"));
		count = itemlist.size();
	}

	// To print total products of phone
	public void count() throws InterruptedException {
		System.out.println("The number of products in a page :" + count);
		Thread.sleep(2000);
		driver.close();

	}
}