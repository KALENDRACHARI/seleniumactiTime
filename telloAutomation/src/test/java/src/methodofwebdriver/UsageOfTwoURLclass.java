package src.methodofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTwoURLclass {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// precondition
		driver.get("https://www.dassault-aviation.com/en/");

		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		URL groupsPageUrl = new URL(mainUrl, "group/");
		Thread.sleep(3000);
		URL defensePageUrl = new URL(mainUrl, "defense/");
		Thread.sleep(3000);
		URL civilPageUrl = new URL(mainUrl, "civil/");
		Thread.sleep(3000);
		URL spacePageUrl = new URL(mainUrl, "space/");
		Thread.sleep(3000);
		URL passionPageUrl = new URL(mainUrl, "passion/");

		Thread.sleep(3000);
		driver.navigate().to(defensePageUrl);
		Thread.sleep(3000);
		driver.navigate().to(passionPageUrl);
		Thread.sleep(3000);
		driver.navigate().to(spacePageUrl);
		Thread.sleep(3000);
		driver.navigate().to(civilPageUrl);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();

	}

}