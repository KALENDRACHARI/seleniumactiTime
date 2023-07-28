package src.methodofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfSetSize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		Dimension targetWindowsize = new Dimension(200, 300);
		driver.manage().window().setSize(targetWindowsize);
	}

}
