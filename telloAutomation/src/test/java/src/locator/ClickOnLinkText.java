package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkText {
	public static void main(String[] args) throws Throwable {
//		instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
//		maximize the browser window
		driver.manage().window().maximize();
//		pass the Main URL of the app
		driver.get("http://www.facebook.com/");
		Thread.sleep(3000);
//		identify the forgotten password?linktext
		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPassword.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}
