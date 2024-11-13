package com.stepDefinition;
import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.LoginPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.JavaUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login {
		WebDriver driver = DriverFactory.getDriver();
		LoginPage loginPage = new LoginPage(driver);
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
		FileUtility fileUtility = new FileUtility();
		JavaUtility javaUtility = new JavaUtility();
		
//		@Given("Handle the popUp")
//		public void handle_the_pop_up() throws InterruptedException {
//		    webDriverUtility.handlePopups(driver);
//		}

		@Given("Click on Login icon")
		public void click_on_login_icon() throws Exception {
			webDriverUtility.waitForElementClickable(driver, loginPage.getLoginLogo());
			javaScriptUtil.jsClick(loginPage.getLoginLogo());
			String expectedUrlSubstring = fileUtility.getDataFromPropertiesFiles("loginurl");
			//webDriverUtility.waitForUrlToContain(driver, expectedUrlSubstring);
//			Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring));
//			Reporter.log("LoginPage is successfully displayed");
		}

		@When("Enter Phonenumber of ten Digits")
		public void enter_phonenumber_of_ten_digits() throws Exception {
			webDriverUtility.waitForElementPresent(driver, loginPage.getPhoneNumberFeild());
			loginPage.getPhoneNumberFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("phonenumber"));
			Assert.assertTrue(loginPage.getProceedButton().isEnabled());
			Reporter.log("Successfully Entered the number", true);

		}

		@When("Click on proceed")
		public void click_on_proceed() throws InterruptedException {

			webDriverUtility.waitForElementClickable(driver, loginPage.getProceedButton());
			javaScriptUtil.jsClick(loginPage.getProceedButton());
			Thread.sleep(15000);
			Reporter.log("Successfully logged in", true);
		}

		@Then("Validate the login")
		public void validate_the_login() {
			webDriverUtility.waitForElementClickable(driver, loginPage.getLoginLogo());
			javaScriptUtil.jsClick(loginPage.getLoginLogo());
			webDriverUtility.waitForElementPresent(driver, loginPage.getLogout());
			Assert.assertTrue(loginPage.getLogout().isDisplayed());
			Reporter.log("Successfully logged in", true);
		}

	}
