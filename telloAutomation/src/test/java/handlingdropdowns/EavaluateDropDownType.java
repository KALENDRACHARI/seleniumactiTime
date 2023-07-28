package handlingdropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EavaluateDropDownType {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthselect = new Select(monthDropdown);
		if (monthselect.isMultiple()) {
			System.out.println("boolean True");
			System.out.println("MonthDropdown select is Multi-select dropdown");
		} else {
			System.out.println("boolean False");
			System.out.println("MonthDropdown select is single-select dropdown");

		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
