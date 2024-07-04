package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.LookupsPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LookupsPageStep {

	private WebDriver driver = DriverFactory.getDriver();
	private LookupsPage lookupsPage = new LookupsPage(driver);

	@When("Clicks on lookups tab")
	public void clicks_on_lookups_tab() {
		lookupsPage.clickLookupsTab();
	}

	@Then("Lookups tab will display")
	public void lookups_tab_will_display() {
		lookupsPage.readLookupsHeader();
	}

	@When("User clicks on add lookup button")
	public void user_clicks_on_add_lookup_button() throws InterruptedException {
		lookupsPage.clickAddLookupButton();
	}

	@When("Fill all lookup details")
	public void fill_all_lookup_details() throws InterruptedException {
		lookupsPage.lookupDetails();
	}

	@When("Click on lookup save button")
	public void click_on_lookup_save_button() throws InterruptedException {
		lookupsPage.clickLookupSaveButton();
	}

	@Then("Lookup will add successfully")
	public void lookup_will_add_successfully() throws InterruptedException {
		lookupsPage.verifyLookup();
	}

	@When("User clicks on lookupList button")
	public void user_clicks_on_lookup_list_button() throws InterruptedException {
		lookupsPage.clickLookupListButton();
	}

	@When("Click on add lookup value button")
	public void click_on_add_lookup_value_button() throws InterruptedException {
		lookupsPage.clickAddLookupValuesButton();
	}

	@When("Fill lookup value details")
	public void fill_lookup_value_details() throws InterruptedException {
		lookupsPage.lookupValueDetails();
	}

	@When("Click on lookup value save button")
	public void click_on_lookup_value_save_button() throws InterruptedException {
		lookupsPage.clickLookupValueSaveButton();
	}

	@Then("Lookup values will add successfully")
	public void lookup_values_will_add_successfully() throws InterruptedException {
		lookupsPage.verifyLoookupValue();
	}

}
