package com.admin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.admin.pageObjects.ApplicationsPage;
import com.admin.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationsPageStep {

	private WebDriver driver = DriverFactory.getDriver();
	private ApplicationsPage applicationsPage = new ApplicationsPage(driver);

//Add application

	@Then("User clicks on applications page")
	public void user_clicks_on_applications_page() throws InterruptedException {
		applicationsPage.clickApplications();
	}

	@And("User clicks on add application button")
	public void user_clicks_on_add_application_button() throws InterruptedException {
		applicationsPage.clickAddApplicationButton();
	}

	@When("User fill all application details")
	public void user_fill_all_application_details() {
		applicationsPage.fillApplication();
	}

	@When("User click on application save button")
	public void user_click_on_application_save_button() throws InterruptedException {
		applicationsPage.clickApplicationSaveButton();
	}

	@Then("Application will add successfully")
	public void application_will_add_successfully() throws InterruptedException {
		applicationsPage.checkApplicationAdded();
	}

//Add menu

	@When("User clicks on menus")
	public void user_clicks_on_menus() {
		applicationsPage.clickMenusTab();
	}

	@When("User clicks on add menu button")
	public void user_clicks_on_add_menu_button() throws InterruptedException {
		applicationsPage.clickAddMenusButton();
	}

	@When("User fill menu fields")
	public void user_fill_menu_fields() throws InterruptedException {
		applicationsPage.fillMenusFileds();
	}

	@When("Click on add menu button")
	public void click_on_add_menu_button() throws InterruptedException {
		applicationsPage.clickMenusSaveButton();
	}

	@Then("Menu will add successfully")
	public void menu_will_add_successfully() throws InterruptedException {
		applicationsPage.checkMenuAdded();
	}

//Add Users

	@When("User click on users menu")
	public void user_click_on_users_menu() {
		applicationsPage.clickUsersTab();
	}

	@When("User click on add User button")
	public void user_click_on_add_user_button() throws InterruptedException {
		applicationsPage.clickAddUsersButton();
	}

	@When("Fill all user fields")
	public void fill_all_user_fields() throws InterruptedException {
		applicationsPage.fillUsersFileds();
	}

	@When("Clicks on user save button")
	public void Clicks_on_user_save_button() throws InterruptedException {
		applicationsPage.clickUsersSaveButton();
	}

	@Then("User will add successfully")
	public void user_will_add_successfully() throws InterruptedException {
		applicationsPage.checkUserAdded();
	}

//Add Roles

	@When("User clicks on roles")
	public void user_clicks_on_roles() {
		applicationsPage.clickRolesTab();
	}

	@When("User click on add role button")
	public void user_click_on_add_role_button() throws InterruptedException {
		applicationsPage.clickAddRolesButton();
	}

	@When("User fill role data")
	public void user_fill_role_data() throws InterruptedException {
		applicationsPage.fillRolesFileds();
	}

	@When("Click on role save button")
	public void click_on_role_save_button() throws InterruptedException {
		applicationsPage.clickRoleSaveButton();
	}

	@Then("Role will add successfully")
	public void role_will_add_successfully() throws InterruptedException {
		applicationsPage.checkRoleAdded();
	}

//Verify added data

	@When("Search for added application")
	public void search_for_added_application() throws InterruptedException {
		applicationsPage.searchForApplication();
	}

	@When("Click on go to users icon")
	public void click_on_go_to_users_icon() {
		applicationsPage.clickGotoUsersInApplicationsPage();
	}

	@Then("Verify added users to this application")
	public void verify_added_users_to_this_application() {
		applicationsPage.verifyaddedUser();
	}

	@When("User navigate back")
	public void user_navigate_back() throws InterruptedException {
		applicationsPage.getBack();
	}

	@When("Click on go to roles icon")
	public void click_on_go_to_roles_icon() {
		applicationsPage.clickGotoRolesInApplicationsPage();
	}

	@Then("Verify added roles to this application")
	public void verify_added_roles_to_this_application() {
		applicationsPage.verifyAddedRole();
	}

	@Then("Delete the added application")
	public void delete_the_added_application() throws InterruptedException {
		applicationsPage.deleteApplication();
	}

	@When("User navigate to Users page")
	public void user_navigate_to_users_page() {
		applicationsPage.navigateToUsersTab();
	}

	@When("Search for added user")
	public void search_for_added_user() throws InterruptedException {
		applicationsPage.searchForUser();
	}

	@Then("Delete the user")
	public void delete_the_user() throws InterruptedException {
		applicationsPage.deleteAddedUser();
	}

	@When("User navigate to menus page")
	public void user_navigate_to_menus_page() {
		applicationsPage.navigateToMenus();
	}

	@When("Search for added menu")
	public void search_for_added_menu() throws InterruptedException {
		applicationsPage.searchForMenu();
	}

	@When("Delete the menu")
	public void delete_the_menu() throws InterruptedException {
		applicationsPage.deleteAddedMenu();
	}

	@Then("User get logout")
	public void Then_User_get_logout() throws InterruptedException {
		applicationsPage.logoutAdminApp();
	}

}