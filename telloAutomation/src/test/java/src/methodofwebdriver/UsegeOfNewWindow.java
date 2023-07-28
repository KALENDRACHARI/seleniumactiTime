package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfNewWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		driver.quit();

	}

}
