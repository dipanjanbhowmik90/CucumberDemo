package com.cognizant.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cognizant.container.TestContainer;
import com.cognizant.pageobjects.GooglePage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CukeHooks {
	WebDriver driver;
	GooglePage googlePage;
	TestContainer testContainer;

	public CukeHooks(TestContainer testContainer) {
		this.testContainer = testContainer;
		driver = testContainer.getWebDriverExplorer().getDriver();
		googlePage = testContainer.getGooglePage();
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println(scenario.getName());
	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println(scenario.getStatus());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
