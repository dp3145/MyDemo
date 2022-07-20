package com.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.testObjects.KeyHighlightPage;

public class TC_1_Demo extends BaseClass {

	@Test
	public void firstTestCase() throws InterruptedException {

		KeyHighlightPage keyHighlightPage = new KeyHighlightPage(driver);
		
		keyHighlightPage.clickOnSearch();
		keyHighlightPage.clickOnDigital();
		keyHighlightPage.clickOnApplyFilter();
		boolean data = keyHighlightPage.isDataDisplay();
		assertEquals(data, true);
	}

}
