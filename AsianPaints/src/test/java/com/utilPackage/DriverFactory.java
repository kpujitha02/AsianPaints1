package com.utilPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilityClasses.FileUtility;

public class DriverFactory {
	public static WebDriver driver;

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility=new FileUtility();
		String browserName=fileUtility.getDataFromPropertiesFiles("browser");
//		String browserName=System.getProperty("browser","chrome");
		String url=fileUtility.getDataFromPropertiesFiles("url");
		if (browserName.equals("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.setBinary("C:\\Users\\Pujitha kotra\\OneDrive\\Documents\\selenium\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(opt);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void quitBrowser()
	{
		if(driver!=null)
		driver.quit();
	}
}
