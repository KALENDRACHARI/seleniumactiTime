package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		boolean result = driver.findElement(By.id("loginbutton")).isEnabled();
		System.out.println(result);//true
		driver.close();
	}

}
