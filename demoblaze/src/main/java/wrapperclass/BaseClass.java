package wrapperclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected WebDriver driver;

	// To launch Web Browser
	public WebDriver launchApplication(String browser) {
		{
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}
	}

	// To launch demoblaze site
	public void launchSite() {
		driver.get("https://www.demoblaze.com");
	}

	// To handle window alert
	public void windowAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// Implicit Wait
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// To close the driver
	public void quit() {
		driver.close();
	}
}
