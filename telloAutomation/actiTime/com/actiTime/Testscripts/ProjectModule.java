package com.actiTime.Testscripts;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.genernic.Baseclass;
import com.actiTime.genernic.FileLib;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.TaskListPage;

@Listeners(com.actiTime.genernic.Listernerimplemention.class)
public class ProjectModule extends Baseclass {

	@Test
	public void testprojectModule() throws Throwable {
		Reporter.log("projectModule", true);
		FileLib f = new FileLib();
		String custName = f.getExcelDate("CreateCustomer", 1, 3);
		String custDescription = f.getExcelDate("CreateCustomer", 1, 4);
		HomePage h = new HomePage(driver);
		h.setTestTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProjectBtn().click();
		t.getEnterCustDespTbx().sendKeys(custName);
		t.getEnterCustDespTbx().sendKeys(custDescription);
		//t.getSelectCustDD().click();
		t.getBigBangCompany().click();
		//t.getCreateCustomerBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {

		}

		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualprojectFld(), custName));

		String actualText = t.getActualprojectFld().getText();
		Assert.assertEquals(actualText, custName);
	}

}
