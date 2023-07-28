package src.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseRadioButton {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com/signup");
	Thread.sleep(2000);
	WebElement maleRadioButton=driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
	WebElement FemaleRadioButton=driver.findElement(By.xpath("//label[text()='Female']/../input[@type='radio']"));
	WebElement CustomRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/../input[@type='radio']"));
	
//WebElement maleRadioButton=driver.findElement(By.xpath("//label[text()='Male']/following-silling::input[@type='radio']"));
	//WebElement FemaleRadioButton=driver.findElement(By.xpath("//label[text()='Female']/following-silling::input[@type='radio']"));
//	WebElement CustomRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/following-silling::input[@type='radio']"));
//	choose male radio button
    maleRadioButton.click();
	Thread.sleep(2000);
//	choose female radio button
	FemaleRadioButton.click();
	Thread.sleep(2000);
//	choose Custom radio button
	CustomRadioButton.click();
	Thread.sleep(2000);
//	minimize the web pages
	driver.manage().window().minimize();
//	quit the window pages 
	driver.quit();
	
}
}
