package org.executionpom;

import java.io.IOException;

import org.baseclass.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pages.AddressAndPayment;
import org.pages.LoginPage;

import io.cucumber.java.Before;

public class Execution extends Baseclass {
	
	
	
	@BeforeClass
	public void beforeClass() {
		browserLaunch();
		maximize();implicitWait(20);
		url("https://omrbranch.com/");
	}
	
	
	@Test
	public void login () throws IOException {
		LoginPage login = new LoginPage();
		login.login(getCellData("omr", 1, 0), getCellData("omr", 1, 1));
		
	}

}
