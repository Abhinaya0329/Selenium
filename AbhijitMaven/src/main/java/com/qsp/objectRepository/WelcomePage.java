package com.qsp.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void welcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Log in")
	private WebElement loginLink;
	
	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getShoppingCartlink() {
		return shoppingCartlink;
	}
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartlink;
	
	public WebElement getLoginLink() {
		return loginLink;
		
	
	}
	

}
