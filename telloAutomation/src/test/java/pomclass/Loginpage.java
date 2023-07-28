package pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="username")
	private WebElement untbx;
    @FindBy(name="pwd")
    private WebElement pwdtb;
    
    @FindBy(xpath="//div[text()=\"Login \"]")
    private WebElement lgbtn;

public void loginpage (WebElement driver) {
	PageFactory.initElements(driver, this);
}

	public void Setlogin(String un,String pw)
	{
		untbx.sendKeys("admin");
		pwdtb.sendKeys("manager");
		lgbtn.click();
	
}
	}



