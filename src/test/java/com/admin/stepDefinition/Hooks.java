package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
