package com.cognizant.stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.container.TestContainer;
import com.cognizant.pageobjects.GooglePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleNavigation {
	TestContainer testContainer;
	WebDriver driver;
	GooglePage googlePage;

	public GoogleNavigation(TestContainer testContainer) {
		this.testContainer = testContainer;
		driver = testContainer.getWebDriverExplorer().getDriver();
		googlePage = testContainer.getGooglePage();
	}

	@Given("^We have already opened the \"([^\"]*)\" url$")
	public void We_have_already_opened_the(String url) {
		driver.get(url);
	}

	@When("^I search \"([^\"]*)\"$")
	public void I_search(String text) {
		googlePage.getGoogleSearch().sendKeys(text);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
	}

	@When("^I navigate to the search result page$")
	public void I_navigate_to_the_search_result_page() {
		googlePage.getGoogleSearchButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(googlePage.getAllLink()));
	}

	@Then("^I am successfully able to validate the google search results$")
	public void I_am_successfully_able_to_validate_the_google_search_results() {
		Assert.assertTrue(googlePage.getTutorialsPoint().getText().contains("Cucumber Tutorial - Tutorialspoint"));
	}

	@Given("^We have already opened the url$")
	public void We_have_already_opened_the_url(DataTable dataTable) {
		//driver.get(dataTable.asList(String.class).get(0));
		List<String> dataList = dataTable.asList(String.class);
		for (String url : dataList) {
			driver.get(url);
		}
	}

	@When("^I search$")
	public void I_search(DataTable dataTable) {
		googlePage.getGoogleSearch().sendKeys(dataTable.asList(String.class).get(0));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
	}

	@Given("^We have already opened the url and navigated$")
	public void We_have_already_opened_the_url_and_navigated(DataTable dataTable) {
		int index = 0;
		for (Map<String,String> dataMapper : dataTable.asMaps(String.class,String.class)) {
			driver.get(dataMapper.get("Url1"));
			driver.get(dataMapper.get("Url2"));
		}
	}

}
