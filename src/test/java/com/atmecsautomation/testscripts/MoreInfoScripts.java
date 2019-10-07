package com.atmecsautomation.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecsautomation.constants.LoadPropertyFile;
import com.atmecsautomation.dataProvider.TestDataProvider;
import com.atmecsautomation.helpers.CommonUtility;
import com.atmecsautomation.pages.MoreInfoValidation;
import com.atmecsautomation.testbase.TestBase;

public class MoreInfoScripts extends TestBase {
	public int index = 0;
	public static Logger log;

	@Test(priority = 2, dataProvider = "moreinfo", dataProviderClass = TestDataProvider.class)
	public void moreInfo(String webpagetitle, String breadcrumb,String pagetitle) {
		log= Logger.getLogger(MoreInfoScripts.class);
		logger = extent.startTest("More Info Fuctionality validation");
		index++;
		MoreInfoValidation.goToMoreInfo(index);
		MoreInfoValidation.redirectionPageValidation(driver, webpagetitle,log);
		MoreInfoValidation.breadcrubValidation(breadcrumb,log);
		MoreInfoValidation.pageTitleValidation(pagetitle, log);
		CommonUtility.clickElement(LoadPropertyFile.locators.getProperty("loc.atmecs.homepage.btn"));
	}

	
}
