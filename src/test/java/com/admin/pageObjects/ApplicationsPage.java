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

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[1]")
	public WebElement addedApplication;

//Menus

	@FindBy(linkText = "Menus")
	public WebElement menusTab;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement menusHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addMenuButton;

	@FindBy(xpath = "//*[@id='application']")
	public WebElement applicationDropdown;

	@FindBy(name = "menuName")
	public WebElement nameTextBox;

	@FindBy(name = "menuCode")
	public WebElement menuCode;

	@FindBy(name = "menuDesc")
	public WebElement menuDescription;

	@FindBy(name = "menuIcon")
	public WebElement menuIcon;

	@FindBy(id = "menuType")
	public WebElement menuTypeDropdown;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[8]/div/div[1]/button")
	public WebElement saveMenuButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement addedMenuName;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[2]/td[10]/div/button[2]")
	public WebElement deleteMenuButton;

//Users

	@FindBy(linkText = "Users")
	public WebElement usersTab;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[1]")
	public WebElement userHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addUserButton;

	@FindBy(name = "firstName")
	public WebElement firstName;

	@FindBy(name = "lastName")
	public WebElement lastName;

	@FindBy(name = "emailAddress")
	public WebElement emailAddress;

	@FindBy(name = "username")
	public WebElement username;

	@FindBy(id = "centers")
	public WebElement centersDropdown;
	
	@FindBy(xpath = "//*[@id='applicationGroupModel']/div[1]/div/div[7]/label/span[1]/input")
	public WebElement activeCheckBox;

	@FindBy(xpath = "//*[@id='applicationGroupModel']/div[2]/button[1]")
	public WebElement saveUserButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[1]")
	public WebElement addedUserName;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[11]/div/button[3]")
	public WebElement deleteUserButton;

// Roles

	@FindBy(linkText = "Roles")
	public WebElement rolesTab;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement roleHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[3]/button")
	public WebElement addRoleButton;

	@FindBy(name = "role")
	public WebElement role;

	@FindBy(name = "roleName")
	public WebElement roleName;

	@FindBy(name = "roleDescription")
	public WebElement roleDescription;

	@FindBy(id = "menuId")
	public WebElement selectMenu;

	@FindBy(xpath = "//*[@id='messageGroupModel']/div[2]/button[1]")
	public WebElement saveRoleButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement addedRoleName;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[8]/button[2]")
	public WebElement deleteRoleButton;

//VerifyAddedData

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[9]/button")
	public WebElement usersButtonInApplications;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[3]/div/div/div[1]/div/div[3]/button")
	public WebElement addUserInApplications;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[10]/button")
	public WebElement rolesButtonInApplications;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement roleNameInApplications;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr/td[11]/div/button[2]")
	public WebElement deleteApplicationButton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement confirmDeleteButton;
	
//logout 
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/header/div/div/div/div[3]/div")
	public WebElement adminLogoButton;
	
	@FindBy(xpath = "//*[@id='simple-menu']/div[3]/ul/li[3]")
	public WebElement logoutButton;

//Add Application

	public void clickApplications() throws InterruptedException {
		applicationsLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(searchBox));
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
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(addedApplication));

	}

	public void checkApplicationAdded() throws InterruptedException {
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
		System.out.println(addedApplication.getText() + "	Application Added Successfully.. ");
		Thread.sleep(3000);

	}

//menus

	public void clickMenusTab() {
		menusTab.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(addedMenuName));
	}

	public void clickAddMenusButton() throws InterruptedException {
		addMenuButton.click();
		Thread.sleep(3000);
	}

	public void fillMenusFileds() throws InterruptedException {
		applicationDropdown.click();
		applicationDropdown.sendKeys("Testing");
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		nameTextBox.sendKeys("Testing Types");
		menuCode.sendKeys("103");
		menuDescription.sendKeys("Different types of testings");
		menuIcon.sendKeys("QA");
		menuTypeDropdown.click();
		Thread.sleep(1000);
		menuTypeDropdown.sendKeys("Unknown Type");
		Thread.sleep(1000);
		menuTypeDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		menuTypeDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void clickMenusSaveButton() throws InterruptedException {
		saveMenuButton.click();
		Thread.sleep(4000);

	}

	public void checkMenuAdded() throws InterruptedException {
		searchBox.sendKeys("Testing Types");
		Thread.sleep(2000);
		System.out.println(addedMenuName.getText() + ":  Menu Added Successfully.. ");
		Thread.sleep(2000);

	}

//Users

	public void clickUsersTab() {
		usersTab.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(userHeader));
	}

	public void clickAddUsersButton() throws InterruptedException {
		addUserButton.click();
		Thread.sleep(3000);
	}

	public void fillUsersFileds() throws InterruptedException {
		firstName.sendKeys("Automation");
		lastName.sendKeys("Tester");
		emailAddress.sendKeys("test789@gmail.com");
		username.sendKeys("AUTOMATION_TESTER");
		centersDropdown.click();
		Thread.sleep(1000);
		centersDropdown.sendKeys("CBER");
		centersDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		centersDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		activeCheckBox.click();
	}

	public void clickUsersSaveButton() throws InterruptedException {
		saveUserButton.click();
		Thread.sleep(4000);

	}

	public void checkUserAdded() throws InterruptedException {
		searchBox.sendKeys("AUTOMATION_TESTER");
		Thread.sleep(2000);
		System.out.println(addedUserName.getText() + ":  User Added Successfully.. ");

	}

//Roles

	public void clickRolesTab() {
		rolesTab.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(roleHeader));
	}

	public void clickAddRolesButton() throws InterruptedException {
		addRoleButton.click();
		Thread.sleep(3000);
	}

	public void fillRolesFileds() throws InterruptedException {
		applicationDropdown.click();
		applicationDropdown.sendKeys("testing");
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		role.sendKeys("Tester");
		roleName.sendKeys("Manual");
		roleDescription.sendKeys("manual testing role");
		selectMenu.click();
		selectMenu.sendKeys("Testing Types");
		Thread.sleep(1000);
		selectMenu.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		selectMenu.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void clickRoleSaveButton() throws InterruptedException {
		saveRoleButton.click();
		Thread.sleep(4000);

	}

	public void checkRoleAdded() throws InterruptedException {
		searchBox.sendKeys("Manual");
		Thread.sleep(2000);
		System.out.println(addedRoleName.getText() + ":  Role Added Successfully.. ");

	}

//VerifyData

	public void searchForApplication() throws InterruptedException {
		searchBox.click();
		searchBox.clear();
		Thread.sleep(1000);
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
	}

	public void clickGotoUsersInApplicationsPage() {
		usersButtonInApplications.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(addUserInApplications));
	}

	public void verifyaddedUser() {
		if (addUserInApplications.getText().contains("Testing")) {
			System.out.println("User added successfully...");
		} else {
			System.out.println("User not found...");
		}
	}

	public void getBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void clickGotoRolesInApplicationsPage() {
		rolesButtonInApplications.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(roleNameInApplications));
	}

	public void verifyAddedRole() {
		if (roleNameInApplications.getText().contains("Tester")) {
			System.out.println("Role added successfully...");
		} else {
			System.out.println("Role not found...");
		}
	}

	public void deleteApplication() throws InterruptedException {
		searchBox.click();
		searchBox.clear();
		Thread.sleep(1000);
		searchBox.sendKeys("Testing");
		Thread.sleep(2000);
		deleteApplicationButton.click();
		Thread.sleep(1000);
		confirmDeleteButton.click();
		Thread.sleep(2000);
	}

	public void navigateToUsersTab() {
		usersTab.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(userHeader));
	}

	public void searchForUser() throws InterruptedException {
		searchBox.sendKeys("automation");
		Thread.sleep(2000);
	}

	public void deleteAddedUser() throws InterruptedException {
		deleteUserButton.click();
		Thread.sleep(1000);
		confirmDeleteButton.click();
		Thread.sleep(2000);
	}

	public void navigateToRoles() {
		rolesTab.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(roleHeader));
	}

	public void searchForRole() throws InterruptedException {
		searchBox.sendKeys("Tester");
		Thread.sleep(2000);
	}

	public void deleteAddedRole() throws InterruptedException {
		deleteRoleButton.click();
		Thread.sleep(1000);
		confirmDeleteButton.click();
		Thread.sleep(2000);
	}

	public void navigateToMenus() {
		menusTab.click();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(menusHeader));
	}

	public void searchForMenu() throws InterruptedException {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys("Testing Types");
		Thread.sleep(2000);
	}

	public void deleteAddedMenu() throws InterruptedException {
		deleteMenuButton.click();
		Thread.sleep(1000);
		confirmDeleteButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
public void logoutAdminApp() throws InterruptedException {
	
	adminLogoButton.click();
	Thread.sleep(1000);
	logoutButton.click();
	Thread.sleep(1000);
	
}
}










