package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlign {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x1 = driver.findElement(By.name("username")).getLocation().getX();
		
		int x2 = driver.findElement(By.id("pwd")).getLocation().getX();
		if(x1==x2)
			System.out.println("username and password are aligned properly");
		else
			System.out.println("username and password are aligned not properly");
		driver.close();
	}
	

}
