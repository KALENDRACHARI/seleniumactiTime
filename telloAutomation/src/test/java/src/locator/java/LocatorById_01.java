package src.locator.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoggedInCheckBox.click();
		Thread.sleep(3000);
	}

}
