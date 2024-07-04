package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.FunctionsPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FunctionsPageStep {

	private WebDriver driver = DriverFactory.getDriver();
	private FunctionsPage functionspage = new FunctionsPage(driver);

	@When("User clicks on functions tab")
	public void user_clicks_on_functions_tab() {
		functionspage.clickFunctionsTab();
	}

	@Then("Functions tab will display")
	public void functions_tab_will_display() {
		functionspage.readFunctionsHeader();
	}

	@When("User clicks on add function button")
	public void user_clicks_on_add_function_button() throws InterruptedException {
		functionspage.clickAddFunctionButton();
	}

	@When("Fill all function details")
	public void fill_all_function_details() throws InterruptedException {
		functionspage.functionsDetails();
	}

	@When("Click on function save button")
	public void click_on_function_save_button() throws InterruptedException {
		functionspage.clickFunctionSaveButton();
	}

	@Then("Function will add successfully")
	public void function_will_add_successfully() throws InterruptedException {
		functionspage.verifyFucntion();
	}

}
