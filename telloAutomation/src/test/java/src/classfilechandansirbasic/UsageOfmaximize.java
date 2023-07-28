package  src.classfilechandansirbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmaximize {
	public static void main(String[] args) {
		// Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		// pre-condition
		// maximize the browser
		// We will get the better view of the application.
		// we are utilizing the browser with it's fullest capacity
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		
	}
}