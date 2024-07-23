package org.sign;

import org.helper.Baseclass;
import org.pojoClasses.SignupPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signupaccount extends Baseclass{
	
	SignupPojo s;

	@Given("To launch Browser")
	public void to_launch_Browser() {
		chromeBrowser();
		
	   
	}

	@When("To launch url")
	public void to_launch_url() {
		passUrl("https://www.facebook.com");
	    
	}

	@When("To click create New Account button")
	public void to_click_create_New_Account_button() {
		s = new SignupPojo();
		//WebElement newAccbtn = s.getCreNewAcc();
		//btnClick(newAccbtn);
		btnclick(s.getCreNewAcc());
	   
	}

	@When("To pass first name in First name field")
	public void to_pass_first_name_in_First_name_field() throws InterruptedException {
		
	   Thread.sleep(3000);
	   //WebElement fName= s.getfName();
	   //fillText(fNmae,"Smart123");
	   filtextpass(s.getfName(),"Smart");
	   
	}

	@When("To pass last name in Surname field")
	public void to_pass_last_name_in_Surname_field() {
		filtextpass(s.getlName(),"Ann");
		
	    
	}

	@When("To pass email in email or phoneno")
	public void to_pass_email_in_email_or_phoneno() {
		filtextpass(s.getEmailOrmobile(),"sam@gmail.com");
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {  
		
		
	}


}
