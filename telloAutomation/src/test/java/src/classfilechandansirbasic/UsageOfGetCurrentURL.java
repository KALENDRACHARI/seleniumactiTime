package src.classfilechandansirbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {
public static void main(String[] args) {
	//Instantiate the Browser specific class
	WebDriver driver=new ChromeDriver();
	//Pass the main URL Of the app.
	driver.get("https://demo.actitime.com/");
	//Go and capture the Current URL of the WebPage
	//We can capture triggered URL in the browser.
	String actualLoginPageUrl = driver.getCurrentUrl();
	System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
	//Verify the URL of the login Page
	String expectedLoginPageUrl = "https://demo.actitime.com/login.do";
	System.out.println("expectedLoginPageUrl = " + expectedLoginPageUrl);
	if (actualLoginPageUrl.contains("login.do")) {
		System.out.println("Pass: The Login Page URL is found correct and it is verified.");
	}else {
		System.out.println("Fail: The Login Page URL is found incorrect and it is verified.");
	}
	
}
}