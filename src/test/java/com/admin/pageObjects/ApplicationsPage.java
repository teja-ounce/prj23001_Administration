package com.admin.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationsPage extends Base {

	public ApplicationsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Applications")
	public WebElement applicationsLink;

//Add application

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement AddApplicationButton;

	@FindBy(name = "applicationName")
	public WebElement applicationName;

	@FindBy(name = "description")
	public WebElement description;

	@FindBy(name = "applicationUrl")
	public WebElement applicationUrl;

	@FindBy(name = "applicationInfo")
	public WebElement applicationInfo;

	@FindBy(name = "applicationIcon")
	public WebElement applicationIconPath;

	@FindBy(name = "applicationVersion")
	public WebElement applicationVersion;

	@FindBy(name = "applicationOrder")
	public WebElement applicationOrder;

	@FindBy(xpath = "//*[@id='applicationGroupModel']/div[2]/button[1]")
	public WebElement applicationSaveButton;

	@FindBy(id = "outlined-basic")
	public WebElement searchBox;

//Users

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[9]/button")
	public WebElement goToUsersButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/span/span")
	public WebElement Header;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[1]/div/div[3]/button")
	public WebElement addUserButton;

	@FindBy(xpath = "//*[@id='applicationRoleModel']/div[1]/div/div[1]/div/div/div/div")
	public WebElement userDropdown;

	@FindBy(xpath = "//*[@id='applicationRoleModel']/div[1]/div/div[2]/div/div/div/div")
	public WebElement roleDropdown;

	@FindBy(xpath = "//*[@id='applicationRoleModel']/div[2]/button[1]")
	public WebElement saveUserButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement applicationsPageHeader;

//Roles

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[10]/button")
	public WebElement goToRoles;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/span/span")
	public WebElement rolesHeader;

	@FindBy(name = "role")
	public WebElement role;

	@FindBy(name = "roleName")
	public WebElement roleName;

	@FindBy(name = "roleDescription")
	public WebElement roleDescription;

	@FindBy(xpath = "//*[@id='messageGroupModel/]/div[1]/div/div[4]/div/div/div/div")
	public WebElement selectMenu;

	@FindBy(xpath = "//*[@id='messageGroupModel']/div[2]/button[1]")
	public WebElement addNewRoleButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[11]/div/button[2]")
	public WebElement deleteButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[11]/div/button[2]")
	public WebElement deleteConfirmButton;

	public void clickApplications() throws InterruptedException {

		applicationsLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(AddApplicationButton));
	}

	public void clickAddApplicationButton() throws InterruptedException {
		AddApplicationButton.click();
		Thread.sleep(2000);

	}

	public void fillApplication() {
		applicationName.sendKeys("Testing");
		description.sendKeys("Testing purpose");
		applicationUrl.sendKeys("http://knime.equinoxys.com:8081/administration/applications");
		applicationInfo.sendKeys("Administration");
		applicationIconPath.sendKeys("/assets/imgs/appIcons/administration.png");
		applicationVersion.sendKeys("V.1.0");
		applicationOrder.sendKeys("9");
		

	}

	public void clickApplicationSaveButton() throws InterruptedException {
		applicationSaveButton.click();
		Thread.sleep(2000);
	}

	public void clickGotoUsersButton() throws InterruptedException {
		goToUsersButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Header));
	}

	public void readHeader() {
		System.out.println("We are in : " + Header.getText());
	}

	public void clickAddUserButton() throws InterruptedException {
		addUserButton.click();
		Thread.sleep(2000);
	}

	public void fillUserFields() throws InterruptedException {
		userDropdown.click();
		Thread.sleep(1000);
		userDropdown.sendKeys(Keys.ARROW_DOWN);
		userDropdown.sendKeys(Keys.ENTER);
		roleDropdown.click();
		Thread.sleep(1000);
		roleDropdown.sendKeys(Keys.ARROW_DOWN);
		roleDropdown.sendKeys(Keys.ENTER);
	}

	public void clickUserSaveButton() throws InterruptedException {
		saveUserButton.click();
		Thread.sleep(3000);
	}

	public void goBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void readApplicationHeader() throws InterruptedException {

		System.out.println("We are in :  " + applicationsPageHeader.getText());
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
	}

	public void clickGotoRolesButton() throws InterruptedException {
		goToRoles.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(rolesHeader));
	}

	public void readRoleHeader() {
		System.out.println("We are in : " + rolesHeader.getText());
	}

	public void fillRoleData() throws InterruptedException {
		role.sendKeys("Quality Analyst");
		roleName.sendKeys("Automation Tester");
		roleDescription.sendKeys("Do both manual and automation");
		selectMenu.click();
		Thread.sleep(1000);
		selectMenu.sendKeys(Keys.ARROW_DOWN);
		selectMenu.sendKeys(Keys.ENTER);
	}

	public void clickAddRoleButton() throws InterruptedException {
		selectMenu.click();
		Thread.sleep(3000);
	}

	public void delete() throws InterruptedException {
		applicationsLink.click();
		Thread.sleep(3000);
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
		deleteButton.click();
		deleteConfirmButton.click();
		Thread.sleep(7000);
	}

}