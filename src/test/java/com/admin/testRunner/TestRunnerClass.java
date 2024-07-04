package com.admin.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Proounce Project\\prj23001_Administration\\src\\test\\resources\\features\\Lookups.feature", glue = {
		"com.admin.stepDefinition" }, monochrome = true,

		plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/report.html" })
public class TestRunnerClass {

}
