package com.testObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyHighlightPage {

	WebDriver ldriver;
	WebDriverWait wait;

	public KeyHighlightPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[contains(@class, 'c-tag-picker__display')]")
	WebElement searchBox;

	@FindBy(xpath = "//div[contains(@class, 'c-popup__window')]")
	WebElement popUp;

	@FindBy(xpath = "//li/button[contains(text(),'Digital')]")
	WebElement digitalButton;

	@FindBy(className = "c-tag-picker__close")
	WebElement closeButton;

	@FindBy(xpath = "//input[contains(@class, 'btn-sme')]")
	WebElement applyFilterButton;

	@FindBy(xpath = "//div[contains(@class, 'img-holder')]/img")
	List<WebElement> images;

	public void clickOnSearch() {
		searchBox.click();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickOnDigital() {
		digitalButton.click();
		closeButton.click();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickOnApplyFilter() {
		applyFilterButton.click();

	}

	public boolean isDataDisplay() {
		System.out.println("dataSize > " + images.size());
		if (images.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
