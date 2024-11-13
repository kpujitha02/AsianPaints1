package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalconyDesignsPage {

	public BalconyDesignsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://www.beautifulhomes.asianpaints.com/interior-design-ideas/balcony-design.html' and text()='Balcony Designs']")
	private WebElement clicksOnBalconyDesigns;
	
	public WebElement getClicksOnBalconyDesigns() {
		return clicksOnBalconyDesigns;
	}
	
	
	@FindBy(xpath = "//h2[text()='Large balcony with swing and black coffee table']")
	private WebElement scrolltillfreeEstimate;
	
	public WebElement getScrolltillfreeEstimate() {
		return scrolltillfreeEstimate;
	}

	@FindBy(xpath = "//img[@title='Large balcony with swing and black coffee table']")
	private WebElement clicksOnFreeEstimateButton;
	
	public WebElement getClicksOnFreeEstimateButton() {
		return clicksOnFreeEstimateButton;
	}
	
	@FindBy(xpath = "//b[text()='Read More']")
	private WebElement clickOnReadMore;

	public WebElement getClickOnReadMore() {
		return clickOnReadMore;
	}

	@FindBy(xpath = "//img[contains(@alt,'Large')]")
	private WebElement largeBalconyPage;
	
	public WebElement getLargeBalconyPage() {
		return largeBalconyPage;
	}
	
	@FindBy(xpath = "//a[@class='moreless more']")
	private WebElement readMoreLink;
	
	public WebElement getReadMoreLink() {
		return readMoreLink;
	}

	
	@FindBy(xpath="//h2[text()='Explore']")
	private WebElement scrollTillExplore;
	
	WebElement getScrollTillExplore() {
		return scrollTillExplore;
	}
	
	@FindBy(xpath = "//a[@href='https://www.beautifulhomes.asianpaints.com/store-locator.html']/span[@class='icon-chevron-right']")
	private WebElement clicksOnExploreNow;

	public WebElement getClicksOnExploreNow() {
		return clicksOnExploreNow;
	}

   
}
