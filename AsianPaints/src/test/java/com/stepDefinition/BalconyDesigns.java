package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BalconyDesignsPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BalconyDesigns {
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	WebDriver driver = DriverFactory.getDriver();
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	BalconyDesignsPage balconydesigns=new BalconyDesignsPage(driver);
	
	@When("The user clicks on balcony designs")
	public void the_user_clicks_on_balcony_designs() {
		javascriptUtil.jsClick(balconydesigns.getClicksOnBalconyDesigns());
	   Reporter.log("User successfully clicked on balcony designs ..." , true);
	   
	}

	@When("The user clicks on get free estimate button")
	public void the_user_clicks_on_get_free_estimate_button() throws InterruptedException {
	    //driverUtility.scrollToElement(driver, balconydesigns.getScrolltillfreeEstimate());
		javascriptUtil.jsScrollBy(0, 500);
	   // balconydesigns.getLargeBalconyPage().click(); 
		WebElement click=balconydesigns.getScrolltillfreeEstimate();
		   javascriptUtil.jsClick(click);
	    Thread.sleep(3000);
	    Reporter.log("User successfully clicked on free estimate button..." , true);
	}

	@Given("The user is on large balcony page")
	public void the_user_is_on_large_balcony_page() {
		Reporter.log("landed on large balcony......", true);
	}

	@Then("The user clicks on Read more link")
	public void the_user_clicks_on_read_more_link() {	
		javascriptUtil.jsClick(balconydesigns.getClickOnReadMore());  
	   Reporter.log("User successfully clicked on read more link...." , true);
	}

	@Then("The user scrolls down till explore")
	public void the_user_scrolls_down_till_explore() throws InterruptedException {
		Thread.sleep(3000);
		javascriptUtil.jsScrollBy(0, 1200);
		Reporter.log("User sucessfully scrolled till explore..." , true);
	
	}
	@Then("The user clicks on explore now on services")
	public void the_user_clicks_on_explore_now_on_services() throws InterruptedException  {
	    Thread.sleep(3000);
	    javascriptUtil.jsClick(balconydesigns.getClicksOnExploreNow());
	    Reporter.log("User Sucessfully explored all the services.." , true);
	}
}
