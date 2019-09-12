package com.cognizant.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	WebDriver driver;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement googleSearch;

	@FindBy(xpath = "(//input[@value='Google Search'])[2]")
	private WebElement googleSearchButton;

	@FindBy(xpath = "//div[text()='All']")
	private WebElement allLink;

	@FindBy(xpath = "(//div[text()='Cucumber Tutorial - Tutorialspoint'])[1]")
	private WebElement tutorialsPoint;

	public WebElement getTutorialsPoint() {
		return tutorialsPoint;
	}

	public By getAllLink() {
		return By.xpath("//div[text()='All']");
	}

	public WebElement getGoogleSearch() {
		return googleSearch;
	}

	public WebElement getGoogleSearchButton() {
		return googleSearchButton;
	}
}
