package com.admin.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.admin.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// Take screenshot if the scenario fails
			if (driver instanceof TakesScreenshot) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "Screenshot");
				DriverFactory.quitDriver();
			}
		} else {
			DriverFactory.quitDriver();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
}
