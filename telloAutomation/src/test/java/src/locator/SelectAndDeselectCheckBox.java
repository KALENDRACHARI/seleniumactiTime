package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndDeselectCheckBox {
	public static void main(String[] args) {
//			instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
//		maximize the browser window
		driver.manage().window().maximize();
//		pass the Main URL of the application
		driver.get("https://demo.actitime.com/");
//		identify the keeploggedinCheckbox
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoggedInCheckBox.click();
		//WebElement loginButtonContainer=driver.findElement(By.id("loginButtonContainer"));
		//loginButtonContainer.click();
		
		
	}

}
