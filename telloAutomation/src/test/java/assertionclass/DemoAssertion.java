package assertionclass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DemoAssertion {
	@Test
	public void VerifyTittle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTittle = "Google";
		String aTittle = driver.getTitle();
		if (aTittle.equals(eTittle)) {
			Reporter.log("Tittel is matching and pass", true);
		} else {
			Reporter.log("Tittel is not matching and Fail", true);

		}
		driver.quit();
	}

}
