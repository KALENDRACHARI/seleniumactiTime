package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfget {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
	}

}
