package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class customerModule2 extends Baseclass {
	@Test
	public void createCustomer1()
	{
		Reporter.log("create customer",true);
		Assert.fail();
	}
	/*public void editCustomer()
	{
		Reporter.log("create customer",true);
	}*/
	

}