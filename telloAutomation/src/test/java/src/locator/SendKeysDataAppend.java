package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDataAppend {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://vtiger-demo.it-solutions4you.com/");
//		identify the usename textfield
		WebElement usernametextField = driver.findElement(By.id("username"));
//		append the data to the same
		usernametextField.clear();
		usernametextField.sendKeys("selenium");
		WebElement passwordtextField = driver.findElement(By.id("password"));
		passwordtextField.clear();
		passwordtextField.sendKeys("achari");
		
		
		
	}

}
