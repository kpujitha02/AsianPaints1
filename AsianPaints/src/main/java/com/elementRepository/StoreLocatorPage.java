package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLocatorPage {

	public StoreLocatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='menu-list']")
	private WebElement hoverOnButton;

	@FindBy(xpath = "//a[@class='submennu-list-item'][normalize-space()='Store Locator']")
	private WebElement selectStoreLocator;

	@FindBy(xpath = "//h2[@class='store-exp__headline']")
	private WebElement scrollsTillBeautifulExperiences;

	public WebElement getScrollsTillBeautifulExperiences() {
		return scrollsTillBeautifulExperiences;
	}

	@FindBy(xpath = "//span[@title='-------Select Location--------']")
	private WebElement userSelectsLocation;

	public WebElement getHoverOnButton() {
		return hoverOnButton;
	}

	public WebElement getSelectStoreLocator() {
		return selectStoreLocator;
	}

	public WebElement getUserSelectsLocation() {
		return userSelectsLocation;
	}
	
	public void clickOnSortByValue(WebDriver driver,String sortBy) {
		driver.findElement(By.xpath("//li[text()='" +sortBy+ "']")).click();
	}
  
}
