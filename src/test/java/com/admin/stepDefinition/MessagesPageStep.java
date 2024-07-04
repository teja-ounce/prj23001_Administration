package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.MessagesPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessagesPageStep {
	
	private WebDriver driver = DriverFactory.getDriver();
	private MessagesPage messagepage = new MessagesPage(driver);

	@When("Click on messages tab")
	public void click_on_messages_tab() {
		messagepage.clickMessageTab();
	}

	@Then("Messages tab will display")
	public void messages_tab_will_display() {
		messagepage.readMessagesHeader();
	}

	@When("User clicks on add message button")
	public void user_clicks_on_add_message_button() throws InterruptedException {
		messagepage.clickAddMessageButton();
	}

	@When("Fill all message details")
	public void fill_all_message_details() throws InterruptedException {
		messagepage.messageDetails();
	}

	@When("Click on message save button")
	public void click_on_message_save_button() throws InterruptedException {
		messagepage.clickMessageSaveButton();
	}

	@Then("Message will add successfully")
	public void message_will_add_successfully() throws InterruptedException {
		messagepage.verifyMessage();
	}

}
