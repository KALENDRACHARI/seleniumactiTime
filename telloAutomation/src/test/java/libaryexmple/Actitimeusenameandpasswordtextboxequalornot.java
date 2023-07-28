package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeusenameandpasswordtextboxequalornot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.name("username"));
		int height1 = username.getSize().getHeight();
		int width1 = username.getSize().getWidth();
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		int height2 = password.getSize().getHeight();
		int width2 = password.getSize().getWidth();
		
		if((height1==height2)&&(width1==width2))
		System.out.println("height and width of username and password is same");
		else
			System.out.println("height and width of username and password is not same");
		
		driver.close();
		
		
		
		
	}

}
