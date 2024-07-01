package com.admin.pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminHomePage extends Base {

	private Long applications;

	private Long roles;

	public Long users;

	private int i;

	public String secondCellData;
	public WebElement cell;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/core-app']/div/div[1]/div[2]/div/div/div/div[16]/div/div[2]")
	private WebElement administrationAppButton;

	@FindBy(linkText = "Home")
	private WebElement homeButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div/div[2]/button[1]/h3")
	private WebElement applicationsCount;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/button[1]/h3")
	private WebElement rolesCount;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[2]/button[1]/h3")
	private WebElement usersCount;

	@FindBy(xpath = "//*[@id='customTableTitle']/tfoot/tr/td/div/p[2]")
	private WebElement numberOfUsers;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div/div[2]/button[2]")
	private WebElement applicationsButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[2]/button[2]")
	private WebElement rolesButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[2]/button[2]")
	private WebElement usersButton;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/header/div/div/div/div[3]/div")
	private WebElement adminProfileButton;

	@FindBy(xpath = "//*[@id='simple-menu']/div[3]/ul/li[3]")
	public WebElement logoutButton;

	@FindBy(xpath = "//*[@id='customTableTitle']/tfoot/tr/td/div/p[2]")
	public WebElement targetPage;
	
	

	public String verifyCount = "//*[@id='customTableTitle']/tfoot/tr/td/div/p[2]";

	@FindBy(xpath = "//*[@id='customTableTitle']/tfoot/tr/td/div/p[2]")
	public WebElement targetPageCount;
	
	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/span/span")
	public WebElement targetPageHeader;

	@FindBy(linkText = "Home")
	public WebElement homeLink;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div")
	List<WebElement> tablesCount;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/h1")
	List<WebElement> tablesHeaders;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/table/tbody")
	List<WebElement> tablesData;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/h1")
	List<WebElement> noOfTables;

	List<String> stringData;
	List<Integer> numberData;

	public AdminHomePage(WebDriver driver) {
		super(driver);
	}

	public void clickProfileButton() throws InterruptedException {
		adminProfileButton.click();
		Thread.sleep(1000);

	}

	public void clickLogout() {
		logoutButton.click();
	}

	public Long getRecordsCount() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		String numberText = numberOfUsers.getText().replaceAll(".* of (\\d+).*", "$1");
		return Long.parseLong(numberText);
	}

	public void clickAdminapp() throws InterruptedException {

		administrationAppButton.click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(usersCount));
	}

	public void activeUsers() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Total number of active users are :	" + usersCount.getText());

	}

	@SuppressWarnings("deprecation")
	public void clickApplicationsLink() throws InterruptedException {
		Thread.sleep(3000);
		applications = Long.parseLong(applicationsCount.getText());
		System.out.println("applicationscount		" + applications);
		applicationsButton.click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void readActiveUsers() {
		String text = numberOfUsers.getText();
		String number = text.replaceAll(".* of (\\d+).*", "$1");
		Long activeUsers = Long.parseLong(number);
		System.out.println("home page displayed with active users " + activeUsers);
	}

	public void clickOnHomeLink() throws InterruptedException {
		homeButton.click();
		Thread.sleep(3000);
	}

	public void validateApplications() throws InterruptedException {
		Long applicationCount = getRecordsCount();
		if (applicationCount.equals(applications)) {
			System.out.println("Validation success count matched :	" + applications);
			homeButton.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Validation failed due to count mis match:	" + applications);
			Thread.sleep(2000);

		}
	}

	public void validateRoles() throws InterruptedException {
		Long roleCount = getRecordsCount();

		if (roleCount.equals(roles)) {
			System.out.println("Validation success count matched :	" + roles);
			homeButton.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Validation failed due to count mis match:	" + roles);
			Thread.sleep(3000);
		}
	}

	public void validateUsers() throws InterruptedException {
		Long userCount = getRecordsCount();
		if (userCount.equals(users)) {
			System.out.println("Validation success count matched :	" + users);
			homeButton.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Validation failed due to count mis match" + users);
			Thread.sleep(3000);
			driver.quit();
		}
	}

	@SuppressWarnings("deprecation")
	public void clickOnRolesLink() throws InterruptedException {
		Thread.sleep(3000);
		roles = Long.parseLong(rolesCount.getText());
		rolesButton.click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	public void clickOnUsersLink() throws InterruptedException {
		Thread.sleep(3000);
		users = Long.parseLong(usersCount.getText());
		usersButton.click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void readTables() throws InterruptedException {
		int tables = noOfTables.size();
		System.out.println("Number of tables: " + tables);
		for (int i = 1; i <= tables; i++) {
			String tableHeaderXPath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div/div/div["
					+ i + "]/div/div/div[1]/h1";
			String tableDataXPath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div[2]/div/div/div/div["
					+ i + "]/div/div/div[2]/table/tbody/tr";

			// Get the table header
			WebElement tableHeader = driver.findElement(By.xpath(tableHeaderXPath));
			System.out.println("Table name :- 	" + tableHeader.getText());

			// Get the rows of the current table
			List<WebElement> rows = driver.findElements(By.xpath(tableDataXPath));
			System.out.println("Total number of roles in " + tableHeader.getText() + ": " + rows.size());

			// Iterate through each row to extract cell data
			for (int j = 0; j < rows.size(); j++) {
				System.out.println("J loop");
				
				// Re-fetch the rows to avoid StaleElementReferenceException
				rows = driver.findElements(By.xpath(tableDataXPath));
				WebElement row = rows.get(j);

				List<WebElement> cells = row.findElements(By.tagName("td"));
				StringBuilder rowData = new StringBuilder();
				for (WebElement cell : cells) {
					rowData.append(cell.getText()).append(" ");
				}
				String firstCell = cells.get(0).getText();
				String secondCellData = cells.get(1).getText();
				System.out.println(firstCell + " : " + secondCellData);
				row.click();
				Thread.sleep(1000);
				if (isTargetPageDisplayed()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait.until(ExpectedConditions.elementToBeClickable(targetPageCount));

					WebElement count = driver.findElement(By.xpath(verifyCount)); // Update with the correct XPath
					String[] number = count.getText().split(" of ");
					String totalCount = number[1];
					System.out.println("Total count after navigating: " + totalCount);
					
					if (totalCount.equals(secondCellData)) {
						driver.navigate().back();
						WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
						wait1.until(ExpectedConditions.elementToBeClickable(homeLink));
						System.out.println("2st if");
					} else {
						System.out.println("Count mismatch ");
						driver.navigate().back();
						WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
						wait2.until(ExpectedConditions.elementToBeClickable(homeLink));
					}
				} else {
					System.out.println("Deatils not found");
					driver.navigate().back();
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait2.until(ExpectedConditions.elementToBeClickable(homeLink));
				}
			}
		}
	}
		private boolean isTargetPageDisplayed() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement targetPageElement = wait.until(ExpectedConditions.visibilityOf(targetPageHeader));
	            return targetPageElement.isDisplayed();
	        } catch (Exception e) {
	            System.out.println("Target page not displayed: " + e.getMessage());
	            return false;
	        }
		}
}



