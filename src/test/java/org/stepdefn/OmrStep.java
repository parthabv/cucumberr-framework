package org.stepdefn;

import org.baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OmrStep extends Baseclass {
	
	WebDriver driver;
	@Given("user is on the omr page")
	public void user_is_on_the_omr_page() {
	browserLaunch();
	maximize();
	implicitWait(20);
	url("https://omrbranch.com/");
	
	
	
	}
	@When("user entered {string} and {string}")
	public void user_entered_and(String name, String pass) {
		WebElement username = locatorById("email");
		sendKeys(username,name );
		 WebElement password = locatorById("pass");
		 sendKeys(password,pass);
	}
	


	@And("user click login button")
	public void user_click_login_button() {
		WebElement loginclick = locatorbyXpath("//button[text()='Login']");
	click(loginclick);
	}
	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
	Assert.assertTrue("verify after successful login",true);
	}



}
