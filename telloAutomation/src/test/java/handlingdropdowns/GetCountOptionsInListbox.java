package handlingdropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCountOptionsInListbox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://karnatakajudiciary.kar.nic.in/hckweb/casemenu.php");
		//driver.get("");
		 List<WebElement> allDropDowns = driver.findElements(By.tagName("select"));
		 System.out.println(allDropDowns.size());
		 for (WebElement dropdown : allDropDowns) {
			 if(dropdown.isDisplayed()) {
				 Select dropdownSelect = new Select(dropdown);
				List<WebElement> allOptions = dropdownSelect.getOptions();
				System.out.println(allOptions.size());
				for (WebElement option : allDropDowns) {
					System.out.println(option.getText());
					
				}

			 }
			
		}
		 driver.manage().window().minimize();
		 driver.quit();
	}

}
