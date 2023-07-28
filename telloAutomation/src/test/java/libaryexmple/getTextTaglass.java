package libaryexmple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextTaglass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		WebElement result = driver.findElement(By.xpath("//button[@name='btn_login']"));
		String Tag = result.getTagName();
	     String Tag1 = result.getAttribute("class");
	    String Tag2 = result.getText();
	    System.out.println(Tag);
	    System.out.println(Tag1);
	    System.out.println(Tag2);
		driver.close();
	}

}
