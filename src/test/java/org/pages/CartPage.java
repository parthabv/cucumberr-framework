package org.pages;


import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Baseclass {
	public  CartPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//h5[text()='Search Result - nuts']")
	private WebElement nutsinsearch;
	@FindBy(xpath = "(//a[text()='Add'])[1]")
	private WebElement addbtn;
	@FindBy(xpath = "//button[@id='cart-21']")
	private WebElement variantbtn;
	@FindBy(xpath = "//a[text()=' Go To Cart ']")
	private WebElement gotocartbtn;
	public WebElement getNutsinsearch() {
		return nutsinsearch;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getVariantbtn() {
		return variantbtn;
	}
	public WebElement getGotocartbtn() {
		return gotocartbtn;
	} 
	public void cartPage() {
		click(getGotocartbtn());
		click(getAddbtn());
		click(getVariantbtn());
	}
	

}
