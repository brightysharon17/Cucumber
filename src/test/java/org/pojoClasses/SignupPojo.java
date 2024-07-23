package org.pojoClasses;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignupPojo extends Baseclass{

	//Non parameterized constructor
	public SignupPojo() {
		 
	
		PageFactory.initElements(driver, this);
	}
	//WebElement txtEmail=driver.findElement(By.xpath("//a[text()='Create new account']"));
	//private WebElement
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement creNewAcc;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath ="(//input[@type='text'])[3]")
	private WebElement emailOrmobile;

	public WebElement getCreNewAcc() {
		return creNewAcc;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmailOrmobile() {
		return emailOrmobile;
	}
	
	
	//Getters  to access those private WebElements outside the class
}
