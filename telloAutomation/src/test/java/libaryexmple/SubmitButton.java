package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login_btn")).submit();
		
		driver.close();
	}

}