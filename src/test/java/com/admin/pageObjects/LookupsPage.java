package com.admin.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LookupsPage extends Base {

	public LookupsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Lookups")
	public WebElement lookupsTabLink;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement lookupsTabHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addLookupButton;

	@FindBy(name = "lookupType")
	public WebElement lookupType;

	@FindBy(name = "groupType")
	public WebElement lookupName;

	@FindBy(name = "roleName")
	public WebElement description;

	@FindBy(id = "application")
	public WebElement applicationDropdown;

	@FindBy(xpath = "//*[@id='lookupGroupModel']/div[2]/button[1]")
	public WebElement saveLookupButton;

	@FindBy(id = "outlined-basic")
	public WebElement searchBox;

//Lookup List

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[5]/button")
	public WebElement lookupsListButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement lookupValuesHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[1]/div/div/div[2]/button")
	public WebElement addLookupValueButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement addedLookup;

	@FindBy(name = "id1")
	public WebElement lookupValue;

	@FindBy(xpath = "//*[@id='groupType']")
	public WebElement lookupValueCode;

	@FindBy(name = "groupTy")
	public WebElement displayOrder;

	@FindBy(xpath = "//*[@id='groupTyp']")
	public WebElement lookupValueDescription;

	@FindBy(xpath = "//*[@id='userGroupModel']/div[2]/button[1]")
	public WebElement lookupValueSaveButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[6]/div/button[3]")
	public WebElement lookupDeleteButton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement lookupDeleteConfirmButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement addedLookupValue;

	@FindBy(xpath = "//*[@id='an id']")
	public WebElement toastMessage;

	public void clickLookupsTab() {
		lookupsTabLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(lookupsTabHeader));
	}

	public void readLookupsHeader() {
		System.out.println("We are in : " + lookupsTabHeader.getText());
	}

	public void clickAddLookupButton() throws InterruptedException {
		addLookupButton.click();
		Thread.sleep(2000);
	}

	public void lookupDetails() throws InterruptedException {
		lookupType.sendKeys("Testing");
		lookupName.sendKeys("Test");
		description.sendKeys("Testing purpose");
		applicationDropdown.click();
		Thread.sleep(1000);
		applicationDropdown.sendKeys("admin");
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ENTER);
	}

	public void clickLookupSaveButton() throws InterruptedException {
		saveLookupButton.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lookupsTabHeader));
	}

	public void verifyLookup() throws InterruptedException {
		searchBox.sendKeys("Testing purpose");
		Thread.sleep(2000);
		if (addedLookup.getText().contains("Testing")) {
			System.out.println(addedLookup.getText() + ":  Lookup added successfully...");

		} else {
			System.out.println("Lookup not found....");
		}
	}

	public void clickLookupListButton() throws InterruptedException {
		lookupsListButton.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lookupValuesHeader));
	}

	public void clickAddLookupValuesButton() throws InterruptedException {
		addLookupValueButton.click();
		Thread.sleep(2000);
	}

	public void lookupValueDetails() throws InterruptedException {

		lookupValue.sendKeys("2024");
		lookupValueCode.sendKeys("102");
		displayOrder.sendKeys("1");
		lookupValueDescription.sendKeys("Testing purpose");

	}

	public void clickLookupValueSaveButton() throws InterruptedException {
		lookupValueSaveButton.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lookupValuesHeader));
	}

	public void verifyLoookupValue() throws InterruptedException {
		searchBox.sendKeys("2024");
		Thread.sleep(2000);
		if (addedLookupValue.getText().contains("2024")) {
			System.out.println(addedLookup.getText() + ":  Lookup added successfully...");
			driver.navigate().back();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(addedLookup));
			searchBox.sendKeys("Testing");
			Thread.sleep(2000);
			lookupDeleteButton.click();
			Thread.sleep(1000);
			lookupDeleteConfirmButton.click();
			Thread.sleep(7000);

		} else {
			System.out.println("Lookup not found....");
			driver.navigate().back();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(addedLookup));
			searchBox.sendKeys("Testing");
			Thread.sleep(2000);
			lookupDeleteButton.click();
			Thread.sleep(1000);
			lookupDeleteConfirmButton.click();
			Thread.sleep(7000);
		}
	}

}
