package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNewWindowTab {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);//WINDOW
		driver.get("https://www.cricbuzz.com/");
	}
}
