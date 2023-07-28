package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
//		enter the username as admin
		WebElement usernameTextFiled = driver.findElement(By.id("username"));
		usernameTextFiled.clear();
		usernameTextFiled.sendKeys("admin");
		Thread.sleep(2000);
//		enter the password as manager
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
//		click on login button
		WebElement loginbuttontextfield = driver.findElement(By.id("loginButton"));
		loginbuttontextfield.click();
		Thread.sleep(6000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
