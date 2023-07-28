package libaryexmple;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalityTestinginfacebook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> alldropdown = driver.findElements(By.tagName("select"));
		for (WebElement dropdown : alldropdown) {
			if(dropdown.isDisplayed()) {
				Select dropdownselect = new Select(dropdown);
				List<WebElement> allOptions = dropdownselect.getOptions();
				for (WebElement options : allOptions) {
					if(dropdown.getAttribute("title").equals("Day")) {
						dropdownselect.selectByVisibleText(options.getText());
						if(options.isSelected()) {
							System.out.println(options.getText()+" is selected.");
						} else {
							System.out.println(options.getText()+" is notselected.");
						}	
					
					} else if (dropdown.getAttribute("title").equals("Month")) {
						dropdownselect.selectByVisibleText(options.getText());
						if(options.isSelected()) {
							System.out.println(options.getText()+" is selected.");
						}
						else {
							System.out.println(options.getText()+" is notselected.");
						}
					}
						else if(dropdown.getAttribute("title").equals("Year")) {
							dropdownselect.selectByVisibleText(options.getText());
							if(options.isSelected()) {
								System.out.println(options.getText()+" is selectd.");
							}
							else {
								System.out.println(options.getText()+" is notselectd.");
						}
					}
					
					
				}
			}
			
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
