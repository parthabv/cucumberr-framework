package org.pages;


import org.baseclass.Baseclass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
private	WebElement txtusername;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Loginbtn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	
	public  void login(String username, String password) {
		sendKeys(getTxtusername(), username);
		sendKeys(getPassword(), password);
		click(getLoginbtn());
	}
	

}
