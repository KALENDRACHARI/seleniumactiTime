package com.actiTime.genernic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actiTime.pom.LoginPage;

public class Baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		Reporter.log("CloseBrowser",true);
		Thread.sleep(3000);
		
		//driver.quit();
	}
	@BeforeMethod
	public void Login() throws Throwable {
		Reporter.log("Login",true);
		FileLib f=new FileLib();
		String url = f.getpropertiesdata("url");
		String un = f.getpropertiesdata("username");
		String pwd = f.getpropertiesdata("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
	l.setLogin(un,pwd);
		
	}
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
	}

}
