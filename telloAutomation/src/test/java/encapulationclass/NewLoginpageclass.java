package encapulationclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLoginpageclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Loginpage l=new Loginpage(driver);
		l.SetUser("admin");
		l.SetUser("manager");
		
	}

}
