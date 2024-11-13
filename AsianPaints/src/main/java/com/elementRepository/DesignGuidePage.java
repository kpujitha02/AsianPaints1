package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import io.cucumber.java.en.When;

public class DesignGuidePage {
	public DesignGuidePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath = "//a[text()='Design Guides']")
	private WebElement ClickOnDesign;
	
	@FindBy(xpath = "//div[text()='Living Room Guide']")
	private WebElement ScrolltillLivingRoom;

	@FindBy(xpath = "(//a[@class='cmp-teaser__action-link' and //div[@class='cmp-teaser__action-container']])[1]")
	private WebElement ClickOnReadMore ;

	public WebElement getClickOnDesign() {
		return ClickOnDesign;
	}

	public WebElement getScrolltillLivingRoom() {
		return ScrolltillLivingRoom;
	}

	public WebElement getClickOnReadMore() {
		return ClickOnReadMore;
	}
	
}
