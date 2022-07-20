package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public String BaseUrl = "https://sme.quake.com.my/key-highlights";

	@BeforeClass
	public void setUp() {
		// System.setProperty("Wwebdriver.chrome.driver", "G:\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(BaseUrl);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
