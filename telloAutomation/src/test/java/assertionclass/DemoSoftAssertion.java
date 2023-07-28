package assertionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {
	@Test
	public void verifyTittle() {
		// create Chromebrowser constructor
		WebDriver driver = new ChromeDriver();
		// enter the URL
		driver.get("https://www.google.com/");
		// expected title in the web browser
		String eTittle = "Google";
		// Actual title in the web browser
		String aTittle = driver.getTitle();
		// create SoftAssert class constructor
		SoftAssert s = new SoftAssert();
		s.assertEquals(eTittle, aTittle);
		driver.close();
		s.assertAll();

	}

}
