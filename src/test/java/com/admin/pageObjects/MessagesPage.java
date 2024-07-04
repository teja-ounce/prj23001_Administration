package com.admin.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagesPage extends Base {

	public MessagesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Messages")
	public WebElement messagesTabLink;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/p")
	public WebElement messagesTabHeader;

	@FindBy(xpath = "//*[@id='single-spa-application:@flc/admin-app']/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div[2]/button")
	public WebElement addMessageButton;

	@FindBy(name = "messageName")
	public WebElement messageName;

	@FindBy(name = "description")
	public WebElement messageDescription;

	@FindBy(id = "messageText")
	public WebElement messageText;

	@FindBy(id = "application")
	public WebElement applicationDropdown;

	@FindBy(xpath = "//*[@id='messageGroupModel']/div[2]/button[1]")
	public WebElement saveMessageButton;

	@FindBy(id = "outlined-basic")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[1]")
	public WebElement addedMessage;

	@FindBy(xpath = "//*[@id='customTableTitle']/tbody/tr[1]/td[5]/button[2]")
	public WebElement messageDeleteButton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	public WebElement messageDeleteConfirmButton;

	public void clickMessageTab() {
		messagesTabLink.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(messagesTabHeader));
	}

	public void readMessagesHeader() {
		System.out.println("We are in : " + messagesTabHeader.getText());
	}

	public void clickAddMessageButton() throws InterruptedException {
		addMessageButton.click();
		Thread.sleep(2000);
	}

	public void messageDetails() throws InterruptedException {
		messageName.sendKeys("APPLICATION_TESTED_SUCCESSFULLY");
		messageDescription.sendKeys("Testing purpose");
		messageText.sendKeys("APPLICATION_TESTED_SUCCESSFULLY");
		applicationDropdown.click();
		applicationDropdown.sendKeys("admin");
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		applicationDropdown.sendKeys(Keys.ENTER);
	}

	public void clickMessageSaveButton() throws InterruptedException {
		saveMessageButton.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addedMessage));
	}

	public void verifyMessage() throws InterruptedException {
		searchBox.sendKeys("Testing purpose	");
		Thread.sleep(2000);
		if (addedMessage.getText().contains("APPLICATION_TESTED_SUCCESSFULLY")) {
			System.out.println(addedMessage.getText() + ":  Message added successfully...");
			messageDeleteButton.click();
			Thread.sleep(1000);
			messageDeleteConfirmButton.click();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(3000);

		} else {
			System.out.println("Message not found....");
		}
	}

}
