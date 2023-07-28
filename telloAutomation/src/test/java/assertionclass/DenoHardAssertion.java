package assertionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DenoHardAssertion {
	@Test
	public void verifyTittle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTittle = "Google";
		String aTittle = driver.getTitle();
		Assert.assertEquals(eTittle, aTittle);
		driver.close();
	}

}
