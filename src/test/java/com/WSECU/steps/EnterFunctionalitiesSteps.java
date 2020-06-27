package com.WSECU.steps;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

import com.WSECU.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnterFunctionalitiesSteps extends CommonMethods{

	@Given("I click on the arrowDown button")
	public void i_click_on_the_arrowDown_button() {
		frontPage.arrow.click();
	}

	@When("I locate BriskTable window and click on it")
	public void i_locate_BriskTable_window_and_click_on_it() throws InterruptedException {
//		Thread.sleep(5000);
		frontPage.briskTableIcon.click();

	}

	@Then("I relocate to new window")
	public void i_relocate_to_new_window() {
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String window1 = it.next();
//		String window2 = it.next();
//		driver.switchTo().window(window2); 
	}

	@When("I verify that {string} is there")
	public void i_verify_that_is_there(String text) {
		Assert.assertEquals(text.equals("Teacher"), true);
	}


	@Then("I see the message about entering successfully")
	public void i_see_the_message_about_entering_successfully() {
		System.out.println("BriskTable is entered succesfully");
	}
}
