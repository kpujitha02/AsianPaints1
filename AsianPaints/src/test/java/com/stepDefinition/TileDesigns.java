package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.elementRepository.TileDesignPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class TileDesigns {
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	WebDriver driver = DriverFactory.getDriver();
	TileDesignPage tiledesign = new TileDesignPage(driver);
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	
	
	@When("the user clicks on beautiful homes")
	public void the_user_clicks_on_beautiful_homes() {
		javascriptUtil.jsClick(tiledesign.getClickOnTileDesign());   
		Reporter.log("User successfully clicked on beautiful home pages...", true);
	}

	@When("The user  clicks on tile design")
	public void the_user_clicks_on_tile_design() {
		javascriptUtil.jsClick(tiledesign.getClickOnTileDesign());
		Reporter.log("User successfully  clicked on tile design");
	}
	
	@When("The user should scroll till traditional white and black")
	public void the_user_should_scroll_till_traditional_white_and_black() throws InterruptedException {
		javascriptUtil.jsScrollBy(0, 400);
		Thread.sleep(3000);
		//tiledesign.getScrollTillTraditionalWhiteAndBlack()
		Reporter.log("User successfully scrolled till traditional white and balck ...." , true );
	}
	
	@When("The user  clicks on get free estimate")
	public void the_user_clicks_on_get_free_estimate() throws InterruptedException {
		//tiledesign.getClickOnFreeEstimate().click();
		WebElement click=tiledesign.getClickOnFreeEstimate();
		   javascriptUtil.jsClick(click);
		   Thread.sleep(3000);
		   Reporter.log("User successfully clicked on free estimate button...",true);
	}

	@When("The user  clicks on stores")
	public void the_user_clicks_on_stores() throws InterruptedException {
		WebElement click1=tiledesign.getClickOnStore();
		   javascriptUtil.jsClick(click1);
		   Thread.sleep(3000);
		   Reporter.log("User successfully clicked on stores..." , true);
		   
		
	}

	@When("The user clicks on find a store")
	public void the_user_clicks_on_find_a_store() throws InterruptedException {
		WebElement click2=tiledesign.getClickOnFindAStore();
		   javascriptUtil.jsClick(click2);
		   Thread.sleep(3000);
		   Reporter.log("User successfully find the store..." , true);
		
	   
	}

}
