package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.ApplicationsPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationsPageStep {

	private WebDriver driver = DriverFactory.getDriver();
	private ApplicationsPage applicationsPage = new ApplicationsPage(driver);

	@Then("User clicks on applications page")
	public void user_clicks_on_applications_page() throws InterruptedException {
		applicationsPage.clickApplications();
	}

	@When("User clicks on add application button")
	public void user_clicks_on_add_application_button() throws InterruptedException {
		applicationsPage.clickAddApplicationButton();
	}

	@When("User fill all application details")
	public void user_fill_all_application_details() {
		applicationsPage.fillApplication();
	}

	@When("User click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		applicationsPage.clickApplicationSaveButton();
	}

	@When("User clicks on users icon")
	public void user_clicks_on_users_icon() throws InterruptedException {
		applicationsPage.clickGotoUsersButton();
	}

	@Then("Applications Users page should display")
	public void applications_users_page_should_display() {
		applicationsPage.readHeader();
	}

	@When("User click on add user button")
	public void user_click_on_add_user_button() throws InterruptedException {
		applicationsPage.clickAddUserButton();
	}

	@When("Fill all user fields")
	public void fill_all_user_fields() throws InterruptedException {
		applicationsPage.fillUserFields();
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		applicationsPage.clickUserSaveButton();
	}

	

	@When("User navigates back")
	public void user_navigates_back() throws InterruptedException {
		applicationsPage.goBack();
	}

	@Then("Applications page should display")
	public void applications_page_should_display() throws InterruptedException {
		applicationsPage.readApplicationHeader();
	}

	@When("User clicks on roles button")
	public void user_clicks_on_roles_button() throws InterruptedException {
		applicationsPage.clickGotoRolesButton();
	}

	@Then("Roles page will dispaly")
	public void roles_page_will_dispaly() {
		applicationsPage.readRoleHeader();
	}

	@When("User clicks on add role button")
	public void user_clicks_on_add_role_button() throws InterruptedException {
		applicationsPage.clickGotoRolesButton();
	}

	@When("User fill required data")
	public void user_fill_required_data() throws InterruptedException {
		applicationsPage.fillRoleData();
	}

	@When("Click on add button")
	public void click_on_add_button() throws InterruptedException {
		applicationsPage.clickAddRoleButton();
	}
	@Then("Delete added application")
	public void Delete_added_application() throws InterruptedException {
		applicationsPage.delete();
	}
}
