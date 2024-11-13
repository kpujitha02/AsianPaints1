package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.elementRepository.StoreLocatorPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class StoreLocator {
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	WebDriver driver = DriverFactory.getDriver();
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	StoreLocatorPage storeLocator=new StoreLocatorPage(driver);
	
	@When("The user hover on button")
	public void the_user_hover_on_button() {
		driverUtility.mouseHover(driver, storeLocator.getHoverOnButton());
	    Reporter.log("User successfully hoverd on button ...." , true);
	}

	@When("The user selects store locator")
	public void the_user_selects_store_locator() throws InterruptedException {
		javascriptUtil.jsClick(storeLocator.getSelectStoreLocator());
	    Thread.sleep(3000);
	    
	    Reporter.log("User successfully selected locations..." , true);
	}
	
	@When("The user scrolls and selects {int} from dropdown")
	public void the_user_scrolls_and_selects_from_dropdown(int rowNum) throws Exception {
	
		javascriptUtil.jsScrollBy(0, 3500);
		 Thread.sleep(5000);
		 javascriptUtil.jsClick(storeLocator.getUserSelectsLocation());
		 String sortBy=fileUtility.getDataFromExcel("sheet1", rowNum, 0);
		 storeLocator.clickOnSortByValue(driver, sortBy);
		 Thread.sleep(3000);
		 Reporter.log("User Successfully scrolled till dropdown...." , true);
	}
}
