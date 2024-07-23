package org.step;

import org.helper.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass{
	
	WebDriver driver;
	
	@Given("To open a browser and maximize")
	public void to_open_a_browser_and_maximize() {
	  chromeBrowser();
	  maxwindow();
	}

	@When("To launch the FB application")
	public void to_launch_the_FB_application() {
	 passUrl("https://www.facebook.com");
	   }

	@When("To pass the invalid username in email field")
	public void to_pass_the_invalid_username_in_email_field() {  
	  WebElement txtEmail = driver.findElement(By.id("email"));
	  txtEmail.sendKeys("Sha17@gmail.com");
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
	   WebElement txtpass = driver.findElement(By.name("pass")); 
	   txtpass.sendKeys("0998765");
	}

	@When("To click a  login button")
	public void to_click_a_login_button() {
	    WebElement btnlog = driver.findElement(By.name("login"));       
	    btnlog.click();
	}

	@When("To check whether it should navigate to the error page or home page")
	public void to_check_whether_it_should_navigate_to_the_error_page_or_home_page() {
	  
	}

	@Then("To close a browser")
	public void to_close_a_browser() {
	 //driver.close();
	}



}
