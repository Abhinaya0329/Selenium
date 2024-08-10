package com.qsp.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public  HomePage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	@FindBy(linkText = "Log Out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement BookLink;

	public WebElement getBookLink() {
		return BookLink;
	}

	
	}
	

	
	

