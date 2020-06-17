package com.WSECU.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.WSECU.Pages.LoginElements;
import com.WSECU.Pages.SecondLoginElements;
import com.WSECU.utils.CommonMethods;
import com.WSECU.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NegativeLoginSteps extends CommonMethods{

	@Given("I enter invalid login")
	public void i_enter_invalid_login() {
	    login.signIn.sendKeys("hello");
	}
	
	@Then("I click Sign In button")
	public void i_click_Sign_In_button() {
	login.signInButton.click();
	}

	@When("I enter inalid password")
	public void i_enter_inalid_password() {
	    secondLogin.password.sendKeys("1234567");
	}
	
	@Then("I click SignIn button")
	public void i_click_SignIn_button() {
	    secondLogin.passwordButton.click();
	}

	@Then("I validate message box pops up that says {string}")
	public void i_validate_message_box_pops_up_that_says(String message) throws InterruptedException {
		Assert.assertEquals(message.equals("Sorry, incorrect username."), true);
	}
}
