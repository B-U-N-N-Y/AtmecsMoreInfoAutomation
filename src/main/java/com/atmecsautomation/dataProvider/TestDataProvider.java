package com.atmecsautomation.dataProvider;

import org.testng.annotations.DataProvider;

import com.atmecsautomation.constants.FilePath;
import com.atmecsautomation.utils.ProvideData;


/**
 * In this class, data is given from the dataprovider
 */
public class TestDataProvider {
	/**
	 * In this method, getting the More info button data object array and returning
	 * to the calling method
	 */

	@DataProvider(name = "moreinfo")
	public Object[][] getMoreinfoData() {
		ProvideData provideData = new ProvideData(FilePath.VALIDATION_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}

	/**
	 * In this method, getting the Explore now button data into object array
	 * and returning to the calling method
	 */

	@DataProvider(name = "explorenow")
	public Object[][] getExploreNowData() {
		ProvideData provideData = new ProvideData(FilePath.VALIDATION_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}
	
	/**
	 * In this method, getting the Home page title data into object array
	 * and returning to the calling method
	 */
	@DataProvider(name = "homepagetitle")
	public Object[][] getHomePageTitleData() {
		ProvideData provideData = new ProvideData(FilePath.VALIDATION_FILE, 2);
		Object[][] getData = provideData.provideData();
		return getData;
	}


//	public static void main(String[] args) {
//
//		Object[][] data = new TestDataProvider().getCityData();
//		for (Object[] objects : data) {
//			String userName = (String) objects[0];
//			String password = (String) objects[1];
//			System.out.println(" " + userName + "   " + password);
//		}
//	}
}