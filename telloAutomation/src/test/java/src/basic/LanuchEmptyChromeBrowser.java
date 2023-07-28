package src.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchEmptyChromeBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.get("https://www.facebook.com/pages/create/?ref_type=registration_form");

		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com/");

	}

}
