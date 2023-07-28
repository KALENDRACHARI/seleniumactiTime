package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectBtn;

	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectnameTbx;

	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement enterCustDespTbx;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement despDD;

	@FindBy(xpath = "(//div[text()='Big Bang Company'])[1]")
	private WebElement bigBangCompany;

	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createprojectBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualprojectFld;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getEnterProjectnameTbx() {
		return enterProjectnameTbx;
	}

	
	public WebElement getEnterCustDespTbx() {
		return enterCustDespTbx;
	}

	
	public WebElement getDespDD() {
		return despDD;
	}

	
	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	
	public WebElement getCreateprojectBtn() {
		return createprojectBtn;
	}

	
	public WebElement getActualprojectFld() {
		return actualprojectFld;
	}

}