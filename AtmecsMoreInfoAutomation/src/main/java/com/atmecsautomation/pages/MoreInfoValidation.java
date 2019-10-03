package com.atmecsautomation.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecsautomation.constants.LoadPropertyFile;
import com.atmecsautomation.helpers.CommonUtility;
import com.atmecsautomation.logreports.LogReport;

public class MoreInfoValidation {

	static LogReport logreport = new LogReport();

	/**
	 * It takes parameter as integer for index and click on dynamic more info button
	 * 
	 * @param counter
	 */
	public static void goToMoreInfo(int index) {

		CommonUtility.scrollIntoview(
				LoadPropertyFile.locators.getProperty("loc.atmes.moreinfo.btn").replace("xxxx", "" + index));
		CommonUtility.scrollDownPage(0, -300);
		CommonUtility.clickElement(
				(LoadPropertyFile.locators.getProperty("loc.atmes.moreinfo.btn")).replace("xxxx", "" + index));
	}

	/**
	 * It takes three parameters, this method validate that the page is redirect to
	 * proper web page or not.
	 * 
	 * @param driver
	 * @param validatedata
	 * @param log
	 */
	public static void redirectionPageValidation(WebDriver driver, String webpagetitle, Logger log) {
		String title = driver.getTitle();
		Assert.assertEquals(title, webpagetitle, "Redirection of page is unsuccesful");
		log.info("Page redirect Successfully");
	}

	/**
	 * This method validate that Breadcrumb of the web page is proper or not.
	 * 
	 * @param validatedata
	 * @param log
	 */
	public static void breadcrubValidation(String validatedata, Logger log) {
		String breadcrub = CommonUtility.getElement(LoadPropertyFile.locators.getProperty("loc.atmecs.breadcrumb.txt"))
				.getText();
		Assert.assertEquals(breadcrub, validatedata, "Breadcrumb is not matched");
		log.info("Breadcrumb validate Successfully");
	}

	/**
	 * This method validate that page title is proper or not.
	 * 
	 * @param validatedata
	 * @param log
	 */

	public static void pageTitleValidation(String pagetitle, Logger log) {
		String title = CommonUtility.getElement(LoadPropertyFile.locators.getProperty("loc.atmecs.pagetitle.txt"))
				.getText();
		Assert.assertEquals(title, pagetitle, "Page title validation is unsuccesful");
		log.info("Page title validate Successfully");
	}
}
