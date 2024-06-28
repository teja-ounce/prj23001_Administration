package com.admin.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Base {
	public String username = "FLCADMIN";
	public String password = "Equinoxys@va123$";
	public String baseURL = "http://knime.equinoxys.com:8081/";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "usernameOrEmail")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/login-app']/div/div/div[2]/div/div[2]/form/button")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/core-app']/div/header/div/div/div/div[3]/div")
	public WebElement profileButton;

	@FindBy(xpath = "//*[@id='simple-menu']/div[3]/ul/li[3]")
	public WebElement logoutButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/core-app']/div/div[1]/div[2]/div/div/div/div[4]/div/div[2]")
	public WebElement fiveYearPlanButton;

	
	public void openURL() {
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(usernameField));
	}

	public void enterUsername() {
		usernameField.sendKeys(username);
	}

	public void enterPassword() {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();

	}

	public void clickProfileButton() throws InterruptedException {
		profileButton.click();
		Thread.sleep(2000);
	}

	public void clickLogout() {
		logoutButton.click();

	}

}
