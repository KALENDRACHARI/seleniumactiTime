package src.classfilechandansirbasic;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class UsageOfGetTitle {
public static void main(String[] args) throws Throwable{
	 //Insantiate the browser specific class
	WebDriver driver = new ChromeDriver();
	//pass the main URL Of the application.
	driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	//Capture and print the title of the WebPage
	//we can verify the title of any web page. 
	String webpageTitle = driver.getTitle();
	System.out.println("webpageTitle = " + webpageTitle);
	Thread.sleep(5000);
	driver.get("https://www.facebook.com/ ");
	String loginPageTitle = driver.getTitle();
	System.out.println("loginPageTitle = " + loginPageTitle);
}
}
