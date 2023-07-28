package com.actiTime.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskTab;
	
	public HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void setlogout() {
		logout.click();
	}
    
	public void setTestTab() {
		taskTab.click();
	}
}
