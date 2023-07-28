package encapulationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	private WebElement Untbx;
	private WebElement pwtbx;
	private WebElement lgntn;
	
	public Loginpage(WebDriver driver) {
		Untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgntn=driver.findElement(By.xpath("//div[text()='Login ']"));
		
		
	}
	public void SetUser(String un) {
		Untbx.sendKeys(un);
		
	}
	public void Setpassword(String pw) {
		pwtbx.sendKeys(pw);
	}
	public void Setloginbutton() {
		lgntn.click();
	}
	
	
	
}
