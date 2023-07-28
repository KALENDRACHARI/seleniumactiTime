import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customermodule {
	
	@BeforeClass
	public void openbrowse () {
		Reporter.log("openbrowse",true);
	}
	@AfterClass
	public void closebrowse () {
		Reporter.log("closebrowse",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority =1,invocationCount=2)
	public void editcustomer () {
		Reporter.log("editcustomer",true);
	}
	@Test
	public void resigercustomer() {
		Reporter.log("resigercustomer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
		
	}

}
