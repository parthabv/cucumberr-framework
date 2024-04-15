package org.pages;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Baseclass {
	public  HomePage() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//a[contains(text(),'Welcome Partha')]")
private WebElement welcometext;
@FindBy(name = "search")
private WebElement searchtxtbox;
@FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
private WebElement seacrchbutton;
public WebElement getWelcometext() {
	return welcometext;
}
public WebElement getSearchtxtbox() {
	return searchtxtbox;
}
public WebElement getSeacrchbutton() {
	return seacrchbutton;
}
public String homePage(String keyword) {
	String welcometxt = getInsertedText(getWelcometext());
	sendKeys(getSearchtxtbox(), keyword);
	click(getSeacrchbutton());
	return welcometxt;
	
}

}
