package org.pages;


import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderIdPage extends Baseclass{
	public  OrderIdPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "(//span[@class='font16 fontNormal color36'])[1]")
private WebElement orderid;
public WebElement getOrderid() {
	return orderid;
}
public String orderIdNum() {
	String insertedText = getInsertedText(getOrderid());

return insertedText;
}



}

