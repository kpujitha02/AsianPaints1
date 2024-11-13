package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WardrobeDesignPage {

	public WardrobeDesignPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//a[text()='Wardrobe Designs']")
	private WebElement ClickOnWardrobeDesign ;
	
	@FindBy(xpath = "//a[@class='filter_analytics--event '][1]")
	private WebElement ClickOnModern;
	
	@FindBy(xpath = "//h2[text()='Wardrobe with a combination of PU gloss finish and fluted glass shutters']")
	private WebElement ClickOnScrollWardrobeWithCombination;
	
	@FindBy(xpath = "//img[@title='Wardrobe with a combination of PU gloss finish and fluted glass shutters']")
	private WebElement ClickOnFinalFinish ;

	public WebElement getClickOnWardrobeDesign() {
		return ClickOnWardrobeDesign;
	}

	public WebElement getClickOnModern() {
		return ClickOnModern;
	}

	public WebElement getClickOnScrollWardrobeWithCombination() {
		return ClickOnScrollWardrobeWithCombination;
	}

	public WebElement getClickOnFinalFinish() {
		return ClickOnFinalFinish;
	}
	
	
	
}
