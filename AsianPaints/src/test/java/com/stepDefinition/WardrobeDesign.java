package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.elementRepository.DesignGuidePage;
import com.elementRepository.WardrobeDesignPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WardrobeDesign {
	
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	WebDriver driver = DriverFactory.getDriver();
	WardrobeDesignPage wardrobedesign=new WardrobeDesignPage(driver);
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	
	
	@When("The user is able to click on Wardrobe design")
	public void the_user_is_able_to_click_on_wardrobe_design() {
		javascriptUtil.jsClick(wardrobedesign.getClickOnWardrobeDesign());
		Reporter.log("User successfully clicked on wardrobe design..." , true);
	   
	}

	@When("The user is able to click on modern")
	public void the_user_is_able_to_click_on_modern() {
		javascriptUtil.jsClick(wardrobedesign.getClickOnModern());
		Reporter.log("User successfully clicked on modern button ...." , true);
	    
	}

	@When("The user is able to scroll wardrobe with combination")
	public void the_user_is_able_to_scroll_wardrobe_with_combination() throws InterruptedException {
		javascriptUtil.jsScrollBy(0, 420);
		Thread.sleep(3000);
		Reporter.log("User successfully scrolled till wardrobe with combination...." , true);
	}

	@Then("Wardrobe with a combination of PU gloss finish and fluted glass shutters page will be dispalyed")
	public void wardrobe_with_a_combination_of_pu_gloss_finish_and_fluted_glass_shutters_page_will_be_dispalyed() throws InterruptedException {
		javascriptUtil.jsClick(wardrobedesign.getClickOnFinalFinish());
	   Thread.sleep(3000);
	   Reporter.log("User successfully seen the combination of PU gloss finish and fluted glass shutters page will be dispalyed ...", true);
	}




}
