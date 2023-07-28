package src.actitime.textscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Customermodule {
	
	@Test
public void createCustomer() {
		Reporter.log("createCustomer",true);
		org.testng.Assert.fail();
	}
	@Test(priority = 2)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority = 3)
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
