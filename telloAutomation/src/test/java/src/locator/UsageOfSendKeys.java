package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("admin");
	Thread.sleep(3000);
	WebElement passwordTextField = driver.findElement(By.name("pwd"));
	passwordTextField.sendKeys("manager");
	//driver.manage().window().minimize();
	//driver.quit();
	
	
}
}
