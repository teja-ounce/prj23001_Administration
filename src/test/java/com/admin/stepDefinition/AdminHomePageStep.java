package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.AdminHomePage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminHomePageStep {
	private WebDriver driver = DriverFactory.getDriver();
	private AdminHomePage adminHomePage = new AdminHomePage(driver);

	@When("User clicks on adminstration app")
	public void user_clicks_on_adminstration_app() throws InterruptedException {
		adminHomePage.clickAdminapp();
	}

	@Then("home page should display with active users")
	public void home_page_should_display_with_active_users() throws InterruptedException {
		adminHomePage.activeUsers();
	}

	@When("User clicks on applications navigation linkbutton")
	public void user_clicks_on_applications_navigation_linkbutton() throws InterruptedException {
		adminHomePage.clickApplicationsLink();

	}

	@When("User navigate to applications page and validate application count")
	public void user_navigate_to_applications_page_and_validate_application_count() throws InterruptedException {

		adminHomePage.validateApplications();

	}

	@Then("user navigate back to home page")
	public void user_navigate_back_to_home_page() throws InterruptedException {
		adminHomePage.clickOnHomeLink();
	}

	@When("User clicks on roles navigation linkbutton")
	public void user_clicks_on_roles_navigation_linkbutton() throws InterruptedException {
		adminHomePage.clickOnRolesLink();

	}

	@When("User navigate to roles page and validate roles count")
	public void user_navigate_to_roles_page_and_validate_roles_count() throws InterruptedException {
		adminHomePage.validateRoles();
	}

	@When("User clicks on users navigation linkbutton")
	public void user_clicks_on_users_navigation_linkbutton() throws InterruptedException {
		adminHomePage.clickOnUsersLink();
	}

	@When("User navigate to users page and validate users count")
	public void user_navigate_to_users_page_and_validate_users_count() throws InterruptedException {
		adminHomePage.validateUsers();
	}

	@When("User read the table data and validate user count")
	public void user_read_the_table_data_and_validate_user_count() throws InterruptedException {

		adminHomePage.readTables();
	}

	@When("Select logout from admin options")
	public void Select_logout_from_admin_options() throws InterruptedException {
		adminHomePage.clickProfileButton();
	}

	@Then("User should logout")
	public void User_should_logout() {
		adminHomePage.clickLogout();
	}

}
