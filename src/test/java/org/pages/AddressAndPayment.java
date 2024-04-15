package org.pages;


import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAndPayment extends Baseclass{
	public AddressAndPayment() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h5[text()='My Cart']")
	private WebElement mycart;
	@FindBy(xpath = "//b[text()='Delivery Slot : ']")
	private WebElement scrolldowntoDelivery;
	@FindBy(xpath = "//div[contains(@data-toggle,'modal')]")
	private WebElement addressplusbtn;
	@FindBy(name = "first_name")
	private WebElement firstname;
	@FindBy(name = "address_type")
	private WebElement addresstype;
	@FindBy(name = "last_name")
	private WebElement lastname;
	@FindBy(name = "mobile")
	private WebElement mobileno;
	@FindBy(name = "apartment")
	private WebElement apartmentno;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy (name = "state")
	private WebElement state;
	@FindBy (name = "city")
	private WebElement city;
	@FindBy (name = "zipcode")
	private WebElement zipcode;
	@FindBy (xpath = "(//button[text()='Save'])[3]")
	private WebElement save;
	@FindBy(id = "payment_type")
	private WebElement paymenttype;
	@FindBy(id = "visa_card")
	private WebElement visacard;
	@FindBy(name = "card_no")
	private WebElement cardnumber;
	@FindBy(id = "month")
	private WebElement month;
	@FindBy(id = "year")
	private WebElement year;
	@FindBy(name = "cvv")
	private  WebElement cvv;
	@FindBy (id = "placeOrder")
	private WebElement placeorder;
	public WebElement getMycart() {
		return mycart;
	}
	public WebElement getScrolldowntoDelivery() {
		return scrolldowntoDelivery;
	}
	public WebElement getAddressplusbtn() {
		return addressplusbtn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getAddresstype() {
		return addresstype;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement getApartmentno() {
		return apartmentno;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getPaymenttype() {
		return paymenttype;
	}
	public WebElement getVisacard() {
		return visacard;
	}
	public WebElement getCardnumber() {
		return cardnumber;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
	public void addressAndPaymentDetails(String firstname, String lastname,String addresstype,String mobilenum, String apartmentno,String address,String state,String zipcode,
			String city,int paymenttype,String visa,String cardnum,String month,String year,String cvv	 ) {
		sendKeys(getFirstname(), firstname );
		sendKeys(getLastname(), lastname);
		selectOptionByText(getAddresstype(), addresstype);
		sendKeys(getMobileno(), mobilenum);
		sendKeys(getApartmentno(), apartmentno);
		sendKeys(getAddress(), address);
		selectOptionByText(getState(), state);
		selectOptionByValue(getCity(), city);
        selectOptionByIndex(getPaymenttype(), paymenttype);
        selectOptionByText(getVisacard(), visa);
        sendKeys(getCardnumber(), cardnum);
        selectOptionByText(getMonth(), month);
        selectOptionByText(getYear(), year);
        sendKeys(getCvv(), cvv);
        click(getPlaceorder());
	
	}
	

}
