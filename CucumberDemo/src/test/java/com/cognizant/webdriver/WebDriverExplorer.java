package com.cognizant.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExplorer {

	private WebDriver driver;

	public WebDriverExplorer() {
		String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver238.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
