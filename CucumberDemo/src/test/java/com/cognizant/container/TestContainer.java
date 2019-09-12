package com.cognizant.container;

import com.cognizant.pageobjects.GooglePage;
import com.cognizant.webdriver.WebDriverExplorer;

public class TestContainer {
	private WebDriverExplorer webDriverExplorer;
	private GooglePage googlePage;
	public TestContainer( ) {
		webDriverExplorer = new WebDriverExplorer();
		googlePage = new GooglePage(webDriverExplorer.getDriver());
	}

	public WebDriverExplorer getWebDriverExplorer() {
		return webDriverExplorer;
	}

	public GooglePage getGooglePage() {
		return googlePage;
	}
}
