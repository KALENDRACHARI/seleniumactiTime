package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void closebrowser()
	{
		Reporter.log("closebrowser",true);
		driver.close();


		
	}
	@BeforeMethod
	public void login() throws Throwable
	{
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(5000);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}

}
