package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautifulHomesPage {

	public BeautifulHomesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href, 'beautifulhomes')]")
	private WebElement ClickOnBeautifulHomes;
	
	@FindBy(xpath = "//span[normalize-space()='Design Ideas']")
	private WebElement hoverOnDesignIdeas;
	
	@FindBy(xpath = "//a[text()='Home Design Ideas']")
	private WebElement ClickOnHomeDesignIdeas;
	
	@FindBy(xpath = "//img[@alt=\"kitchen.jpg\"]")
	private WebElement ClickOnImage;
	
	@FindBy(xpath = "(//h2[@class='gl-filter-image-content'])[1]")
	private WebElement ScrollTillGetEstimate;
	
	@FindBy(xpath =  "(//span[text()=' Get Estimate'])[1]")
	private WebElement ClickOnEstimate;
	
	@FindBy(xpath ="//h1[@class='bh-calc_heading']")
	private WebElement PageWillBeDisplayed;
	
	
	public WebElement getClickOnBeautifulHomes() {
		return ClickOnBeautifulHomes;
	}
	
	public WebElement getHoverOnDesignIdeas() {
		return hoverOnDesignIdeas;
	}
	
	public WebElement getClickOnHomeDesignIdeas() {
		return ClickOnHomeDesignIdeas;
	}
	
	public WebElement getClickOnImage() {
		return ClickOnImage;
	}
	
	public WebElement getPageWillBeDisplayed() {
		return PageWillBeDisplayed;
	}
	
	public WebElement getScrollTillGetEstimate() {
		return ScrollTillGetEstimate;
	}
	
	public WebElement getClickOnEstimate() {
		return ClickOnEstimate;
	}
        
}
