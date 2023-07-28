package src.classfilechandansirbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		//pass the main URL of the application 
		//main URL = protocol + domainName
		//If we don't follow the syntax of the URL which is mandatory
		//InvalidArgumentException - selenium - run - unchecked - get(String url)
		//Netrwork Errors
		//WebDriverException - Selenium - run - unchecked 
//		driver.get("https://www.facebook.com/");
		//try with sub URL - yes it will work
		//it is not an automation standard to trigger sub-URL with get()
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
	}
}