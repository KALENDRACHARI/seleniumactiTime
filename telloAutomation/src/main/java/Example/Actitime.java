package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
	}

}
