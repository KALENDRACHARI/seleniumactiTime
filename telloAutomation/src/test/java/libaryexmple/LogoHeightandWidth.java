package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoHeightandWidth {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginbtn = driver.findElement(By.name("login"));
		int height = loginbtn.getSize().getHeight();
		int width = loginbtn.getSize().getWidth();
		System.out.println("height---->"+height);
		System.out.println("width---->"+width);
		driver.close();
	}

}
