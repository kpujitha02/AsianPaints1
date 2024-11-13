package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.model.Report;
import com.elementRepository.BeautifulHomesPage;
import com.elementRepository.DesignGuidePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class DesignGuide {
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	WebDriver driver = DriverFactory.getDriver();
	DesignGuidePage designguide=new DesignGuidePage(driver);
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	
	@When("The user clicks on Design guide")
	public void the_user_clicks_on_design_guide() throws InterruptedException {
		javascriptUtil.jsClick(designguide.getClickOnDesign());
		Thread.sleep(3000);
		Reporter.log("User successfully clicked on design guide.." , true);
	    
	}

	@When("Scroll up to Read more")
	public void scroll_up_to_read_more() throws InterruptedException {
		javascriptUtil.jsScrollBy(0, 280);
		Thread.sleep(3000);
		Reporter.log("Successfuly scrolled upto read more..." , true);
		
	    
	}
	
	@When("click on read more")
	public void click_on_read_more() throws InterruptedException {
		javascriptUtil.jsClick(designguide.getClickOnReadMore());
	   Thread.sleep(3000);
	   Reporter.log("User successfully clicked on read more.... " , true);
	}

}
