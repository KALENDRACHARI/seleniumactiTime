package StaleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement untbn = driver.findElement(By.name("username"));
	WebElement pwdtn = driver.findElement(By.name("pwd"));
	WebElement logbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	untbn.sendKeys("admin");
	pwdtn.sendKeys("manager");
	logbtn.click();
		driver.navigate().refresh();
		untbn.sendKeys("admin1");
		pwdtn.sendKeys("manager1");
		logbtn.click();
		driver.close();
	}

}
