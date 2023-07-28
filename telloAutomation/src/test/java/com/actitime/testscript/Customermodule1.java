package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class Customermodule1 extends Baseclass {
	@Test
	public void createCustomer()
	{
		Reporter.log("create customer",true);
	}
	/*public void editCustomer()
	{
		Reporter.log("create customer",true);
	}*/
	

}
