package com.qsp.genricutility;

import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	Actions act;
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		act= new Actions(driver);
		
}
	public void doubleClick(WebElement element) {
		act.doubleClick(element).perform();
	}
	public void clickAndHold(WebElement element) {
		act.clickAndHold(element).perform();
	}
	public void mouseHover(WebElement element) {
		act.moveToElement(element);
		
	}
	public void scrollToElement(WebElement element) {
		act.scrollToElement(element);
	}
	public void switchToWindow(WebDriver driver,String expectedUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			String actUrl = driver.switchTo().window(id).getCurrentUrl();
			if(actUrl.contains(expectedUrl)) {
				break;
			}
		}
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
}
