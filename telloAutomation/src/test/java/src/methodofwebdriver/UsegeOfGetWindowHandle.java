package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String webpageTitle=driver.getTitle();
		System.out.println("webpageTitle "+webpageTitle);
	}

}
