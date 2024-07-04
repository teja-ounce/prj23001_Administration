package com.admin.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionsPage extends Base {

	public FunctionsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Functions")
	public WebElement functionsTabLink;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement functionsTabHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addFunctionButton;

	@FindBy(name = "functionName")
	public WebElement functionName;

	@FindBy(name = "functionCode")
	public WebElement functionCode;

	@FindBy(id = "functionDescription")
	public WebElement functionDescription;

	@FindBy(id = "url")
	public WebElement functionUrl;

	@FindBy(id = "functionType")
	public WebElement functionTypeDropdown;

	@FindBy(id = "application")
	public WebElement applicationDropdown;

	@FindBy(id = "language")
	public WebElement languageDropdown;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[9]/div/div[1]/button")
	public WebElement saveFunctionButton;

	@FindBy(id = "outlined-basic")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[1]")
	public WebElement addedFunction;
	
	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[9]/div/button[2]")
	public WebElement functionDeleteButton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement functionDeleteConfirmButton;
	

	public void clickFunctionsTab() {
		functionsTabLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(functionsTabHeader));
	}

	public void readFunctionsHeader() {
		System.out.println("We are in : " + functionsTabHeader.getText());
	}

	public void clickAddFunctionButton() throws InterruptedException {
		addFunctionButton.click();
		Thread.sleep(2000);
	}

	public void functionsDetails() throws InterruptedException {
		functionName.sendKeys("Testing");
		functionCode.sendKeys("108");
		functionDescription.sendKeys("Testing purpose");
		functionUrl.sendKeys("knime.equinoxys.com:8081/administration/functions/new");
		functionTypeDropdown.click();
		Thread.sleep(1000);
		functionTypeDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		functionTypeDropdown.sendKeys(Keys.ENTER);
		applicationDropdown.sendKeys("admin");
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ENTER);
		languageDropdown.click();
		Thread.sleep(1000);
		languageDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		languageDropdown.sendKeys(Keys.ENTER);
	}

	public void clickFunctionSaveButton() throws InterruptedException {
		saveFunctionButton.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addedFunction));
	}

	public void verifyFucntion() throws InterruptedException {
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
		if (addedFunction.getText().contains("Testing")) {
			System.out.println(addedFunction.getText() + ":  Function added successfully...");
			functionDeleteButton.click();
			Thread.sleep(1000);
			functionDeleteConfirmButton.click();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(3000);

		} else {
			System.out.println("Function not found....");
		}
	}

}
