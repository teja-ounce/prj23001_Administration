package com.admin.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.admin.pageObjects.LoginPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	private WebDriver driver = DriverFactory.getDriver();
	private LoginPage loginPage = new LoginPage(driver);

	@Given("User launch URL")
	public void user_launch_url() throws InterruptedException {
		loginPage.openURL();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		loginPage.enterUsername();
		loginPage.enterPassword();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("Dashboard should display")
	public void dashboard_should_display() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginPage.fiveYearPlanButton));
	}

	@When("User clicks on profile picture")
	public void user_clicks_on_profile_picture() throws InterruptedException {
		loginPage.clickProfileButton();
		Thread.sleep(2000);

	}

	@And("Select logout from options")
	public void select_logout_from_options() throws InterruptedException {
		loginPage.clickLogout();
		Thread.sleep(2000);
	}

	@Then("User will logout")
	public void user_will_logout() {
		System.out.println("User get logout successfully	" + driver.getTitle());
	}

}
