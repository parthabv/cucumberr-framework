package org.stepdefinitionn;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.baseclass.Baseclass;
import org.openqa.selenium.Keys;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class tableStep extends Baseclass {
	


	@Given("user is in amazon home page")
	public void user_is_in_amazon_home_page() {
		
		browserLaunch();
		maximize();
		implicitWait(10);
		url("https://www.amazon.in/");
		
	
		
	}
	   
	
	@When("user is entering the value")
 public void user_is_entering_the_value(io.cucumber.datatable.DataTable dataTable) {
		
	List<String> result = dataTable.asList();
	String results = result.get(1);
	 System.out.println(results);
	
   locatorById("twotabsearchtextbox").sendKeys(results ,Keys.ENTER);
   
   
   
	}
	@Then("verify the value is present in searchbox")
	public void verify_the_value_is_present_in_searchbox( ) {
		
		
		

	}
}
