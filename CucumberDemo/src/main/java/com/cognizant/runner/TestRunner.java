package com.cognizant.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.cognizant.stepdefs" },features = {
		"src/test/resources/Features" }, plugin = { "html:target/Report",
				"json:target/cucumber.json", }, tags = {"@HardCodedUserInput,@ExamplesUserInput,@DataTableWithOutHeaderUserInput,@DataTableWithHeaderUserInput"})

public class TestRunner {

}
