package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean result = driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
		System.out.println(result);//true
		driver.close();
	}

}
