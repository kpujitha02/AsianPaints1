package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TileDesignPage {

	public TileDesignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Tile Designs']")
	private WebElement ClickOnTileDesign;

	@FindBy(xpath = "//h2[text()='Traditional white and black patterned tiles for balcony']")
	private WebElement ClickOnFreeEstimate;

	@FindBy(xpath = "//h2[@class='emc__headline']")
	private WebElement ScrollTillStore;
	
	@FindBy(xpath = "//div[@class='emc__thumbnail-overlay purple']")
	private  WebElement ClickOnStore;
	
	@FindBy(xpath = "(//a[@class='btn btn--primary' and @tabindex=\"-1\"])[1]")
	private  WebElement ClickOnFindAStore;
	
	@FindBy(xpath = "")
	private  WebElement ScrollTillTraditionalWhiteAndBlack;
	
	
	public WebElement getScrollTillTraditionalWhiteAndBlack() {
		return ScrollTillTraditionalWhiteAndBlack;
	}

	public WebElement getClickOnTileDesign() {
		return ClickOnTileDesign;
	}

	public WebElement getClickOnFreeEstimate() {
		return ClickOnFreeEstimate;
	}

	public WebElement getScrollTillStore() {
		return ScrollTillStore;
	}

	public WebElement getClickOnStore() {
		return ClickOnStore;
	}

	public WebElement getClickOnFindAStore() {
		return ClickOnFindAStore;
	}
	
	
}
