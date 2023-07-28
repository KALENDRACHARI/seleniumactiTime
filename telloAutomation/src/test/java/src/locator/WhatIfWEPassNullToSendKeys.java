package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWEPassNullToSendKeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
//		we cannot pass the null value with sendKeys
//		IllegalArgumentException-jaa -run -unchecked Exceptions
		driver.findElement(By.id("username")).sendKeys(null);
		
	}

}
