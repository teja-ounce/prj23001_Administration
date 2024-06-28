package com.admin.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Teja-OUNCE\\eclipse-workspace\\administration\\src\\test\\resources\\features\\AdminHomePage.feature", glue = {
		"com.admin.stepDefinition" }, monochrome = true,

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/report.html" }, tags = "@TableData"

)

public class TestRunnerClass {

}
