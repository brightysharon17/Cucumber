package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveNegativeTestcases {
	
	WebDriver driver;
	
	@Given("To launch the browser and max window")
	public void to_launch_the_browser_and_max_window() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@When("To launch url of the application")
	public void to_launch_url_of_the_application() {
		driver.get("https://www.facebook.com/");
	}

	@When("To pass positive and negative {string} data to email field")
	public void to_pass_positive_and_negative_data_to_email_field(String em) {
		WebElement txtEmail = driver.findElement(By.name("pass"));
		txtEmail.sendKeys(em);
	}

	@When("To pass positive and {string} negative data to password field")
	public void to_pass_positive_and_negative_data_to_password_field(String p) {
	   WebElement txtpass = driver.findElement(By.name("pass"));
	   txtpass.sendKeys(p);
	}

	@When("To click login button")
	public void to_click_login_button() {
	    WebElement btnlog = driver.findElement(By.name("login"));
	    btnlog.click();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	   //driver.close();
	}



}
