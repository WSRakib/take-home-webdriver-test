package com.dotDash.DotDash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FIleDownloadPage {

	public FIleDownloadPage(WebDriver driver) {
		driver = MainDriver.getDriver();
		PageFactory.initElements(driver,this); 
	}
	
	@FindBy(xpath = "//div[@id='content']//a[1]" )
	public static WebElement fileDownload;
	
	
	
	
	public WebElement fileDownload() {
		return fileDownload;
	}
	
	
}


