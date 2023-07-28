package src.methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class UsegeOfgetWindowHandles2 {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.facebook.com/");
		Set<String> allwindowsId=driver.getWindowHandles();
		int windowidCount=allwindowsId.size();
		System.out.println("windowidCount:-"+windowidCount);
		for(String wid:allwindowsId)
		{
			System.out.println(wid);
		}
	
		
	}
}
