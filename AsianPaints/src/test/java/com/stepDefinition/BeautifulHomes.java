package com.stepDefinition;

//import javax.xml.xpath.XPath;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BeautifulHomesPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeautifulHomes {
	WebDriverUtility utility=new WebDriverUtility();
	
	WebDriver driver = DriverFactory.getDriver();
	BeautifulHomesPage beautifulHome=new BeautifulHomesPage(driver);
	JavaScriptUtil javascriptUtil=new JavaScriptUtil(driver);
	
	
	@Given("Browser is open and url is navigated")
	public void browser_is_open_and_url_is_navigated() throws Exception {
		utility.handlePopups(driver);
		Actions act = new Actions(driver);
		act.moveByOffset(0, 0).click();
		FileUtility fileUtility=new FileUtility();
		String actualURL=driver.getCurrentUrl();
	    String expectedURL=fileUtility.getDataFromPropertiesFiles("url");
	    Assert.assertEquals(actualURL, expectedURL,"URL is not navigated");
	    Reporter.log("Browser is open and url is navigated", true);
	    
	}
	
	

	@When("The user clicks on beautiful homes")
	public void the_user_clicks_on_beautiful_homes() throws InterruptedException {
	   WebElement clickOn=beautifulHome.getClickOnBeautifulHomes();
	   javascriptUtil.jsClick(clickOn);
	   //Assert.assertTrue(beautifulHome.getClickOnBeautifulHomes().isDisplayed());
	   Reporter.log("User sucessfully clicked on beautiful homes..." , true);
	   
	   
	}
	
	
	@When("The user is able to hover on Design Ideas")
	public void the_user_is_able_to_hover_on_design_ideas() {
	    utility.mouseHover(driver, beautifulHome.getHoverOnDesignIdeas());
	    Assert.assertTrue(beautifulHome.getHoverOnDesignIdeas().isDisplayed());
	    Reporter.log("User hovered on design ideas..." , true);
	}

	@When("The user is able to click on home desgin  ideas")
	public void the_user_is_able_to_click_on_home_desgin_ideas() {
	    beautifulHome.getClickOnHomeDesignIdeas().click();
	    javascriptUtil.jsClick(beautifulHome.getHoverOnDesignIdeas());
	    Reporter.log("User  sucessfully clicked on home desgin ideas..." , true);
	}
	
	

    @When("The user is able to click on image")
    public void the_user_is_able_to_click_on_image() throws InterruptedException {
    	WebElement click=beautifulHome.getClickOnImage();
    	javascriptUtil.jsClick(click);
		   Thread.sleep(3000);
		 Reporter.log("User successfully clicked on image..",true);
    }
	
	  @When("Scroll till get estimate")
	  public void scroll_till_get_estimate() throws InterruptedException {
		  javascriptUtil.jsScrollBy(0, 520);
			 Reporter.log("User successfully scrolled till estimate..." , true);
			 Thread.sleep(5000);
			 
	  }

	@When("click on get estimate")
	public void click_on_get_estimate() throws InterruptedException {
		WebElement click=beautifulHome.getClickOnEstimate();
    	javascriptUtil.jsClick(click);
		   Thread.sleep(3000);
		  Reporter.log("User got final output which is get estimate...." , true);
	}
	

    @Then("Select the nearest dimension of your kitchen will be displayed")
    public void select_the_nearest_dimension_of_your_kitchen_will_be_displayed() {
    	//beautifulHome.getPageWillBeDisplayed().click();
    	javascriptUtil.jsClick(beautifulHome.getPageWillBeDisplayed());
    }
		  	  
		  
	//driverUtility.scrollToElement(driver, beautifulHome.getScrollTillEstimate());
//	 WebElement clickOnEstimate=beautifulHome.getClickOnEstimate();
//    javascriptUtil.jsClick(clickOnEstimate);
	}


