package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {
public static void main(String[] args) throws Throwable {
//	instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
//	maximize the browser window
	driver.manage().window().maximize();
//	pass the main URL of the app
	driver.get(  "https://www.facebook.com/");
	Thread.sleep(3000);
//	find the login button 
	WebElement loginButton=driver.findElement(By.name("login"));
	loginButton.click();
	Thread.sleep(4000);
	
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
