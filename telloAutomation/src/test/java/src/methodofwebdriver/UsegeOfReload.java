package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfReload {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		Thread.sleep(4000);
		driver.navigate().refresh();
	
				
	}
}
