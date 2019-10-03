package com.atmecsautomation.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecsautomation.constants.LoadPropertyFile;
import com.atmecsautomation.dataProvider.TestDataProvider;
import com.atmecsautomation.helpers.CommonUtility;
import com.atmecsautomation.pages.MoreInfoValidation;
import com.atmecsautomation.testbase.TestBase;

public class ExploreNowScripts extends TestBase {
	public static Logger log;
	
	@Test(priority =0, dataProvider = "homepagetitle", dataProviderClass = TestDataProvider.class)
	public void homePageRedirection(String title) {
		log= Logger.getLogger(ExploreNowScripts.class);
		logger = extent.startTest("Explore Now Fuctionality validation");
		MoreInfoValidation.redirectionPageValidation(driver, title, log);
	}
	
	@Test(priority = 1, dataProvider = "explorenow", dataProviderClass = TestDataProvider.class)
	public void exploreNow(String webpagetitle, String breadcrumb,String pagetitle) {
		
		CommonUtility.clickElement(LoadPropertyFile.locators.getProperty("loc.atmecs.explorenow.btn"));
		MoreInfoValidation.redirectionPageValidation(driver, webpagetitle,log);
		MoreInfoValidation.breadcrubValidation(breadcrumb,log);
		MoreInfoValidation.pageTitleValidation(pagetitle, log);
		CommonUtility.clickElement(LoadPropertyFile.locators.getProperty("loc.atmecs.homepage.btn"));
	}
}
