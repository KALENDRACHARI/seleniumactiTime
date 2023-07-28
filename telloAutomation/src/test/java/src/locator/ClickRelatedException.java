package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRelatedException {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		WebElement menTshirts = driver.findElement(By.xpath("//a[text()='TopWear']/../..//a[text()='T-Shirts']"));
		menTshirts.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
