package org.hotel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.baseclass.Baseclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.tlh.ach;

public class HotelTask extends Baseclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("parthasarathyb95@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Bvmcp@1802");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		WebElement welcometxt = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = driverwait.until(ExpectedConditions.visibilityOf(welcometxt));
		String text = until.getText();
		// junit.framework.Assert.assertEquals(text, );
		System.out.println(text);

		WebElement state = driver.findElement(By.id("state"));
		Select select = new Select(state);
		select.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select City *']")).click();
		WebElement city = driver.findElement(By.xpath("//li[text()='Chennai']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(city).click().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@placeholder='Select Room Type']")).click();
		WebElement roomtype = driver.findElement(By.xpath("(//li[@role='option'])[3]"));
		actions.moveToElement(roomtype).click().perform();
		WebElement checkin = driver.findElement(By.name("check_in"));
		checkin.click();
		WebElement date = driver.findElement(By.xpath("//a[text()='25']"));

		Actions action = new Actions(driver);
		action.moveToElement(date).click().perform();
		WebElement checkout = driver.findElement(By.name("check_out"));
		checkout.click();

		WebElement checkoutdate = driver.findElement(By.xpath("//a[text()='27']"));
		action.moveToElement(checkoutdate).click().perform();

		WebElement roomcount = driver.findElement(By.id("no_rooms"));
		Select select2 = new Select(roomcount);
		select2.selectByIndex(3);

		WebElement adultsno = driver.findElement(By.id("no_adults"));
		Select select3 = new Select(adultsno);
		select3.selectByIndex(3);

		WebElement childno = driver.findElement(By.id("no_child"));
		childno.sendKeys("5");

		WebElement outerframe = driver.findElement(By.xpath("//iframe[@class='iframe']"));
		driver.switchTo().frame(outerframe);
		WebElement searchbtn = driver.findElement(By.xpath("//button[text()='Search']"));
		searchbtn.click();
		WebElement selecthoteltxt = driver.findElement(By.xpath("//h5[text()='Select Hotel']"));
		System.out.println(selecthoteltxt.getText());
		WebElement text3 = driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Suite']"));
		System.out.println(text3.getText());
		driver.findElement(By.xpath("(//a[@class='btn filter_btn'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement text4 = driver.findElement(By.xpath("//h2[@class='px-3 py-2']"));
		System.out.println(text4.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("own")).click();
		WebElement guestname = driver.findElement(By.name("title"));
		Select select4 = new Select(guestname);
		select4.selectByIndex(1);
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("partha");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("sarathy");
		WebElement mobileno = driver.findElement(By.name("phone"));
		mobileno.sendKeys("8056051393");
		WebElement emaill = driver.findElement(By.name("email"));
		emaill.sendKeys("parthasarathyb95@gmail.com");
		driver.findElement(By.id("gst")).click();
		Thread.sleep(2000);
		WebElement gstno = driver.findElement(By.name("registration"));
		gstno.sendKeys("9043592058");

		WebElement companyname = driver.findElement(By.name("company_name"));
		companyname.sendKeys("Greens Tech OMR Branch");
		WebElement address = driver.findElement(By.name("company_address"));
		address.sendKeys("Thoraipakkam");
		driver.findElement(By.id("step1next")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Large bed']")).click();
		WebElement requesttext = driver.findElement(By.id("other_request"));
		requesttext.sendKeys("nil");
		driver.findElement(By.xpath("//button[@id='step2next']")).click();

		driver.findElement(By.xpath("//div[@class='credit-card pm']")).click();
		Thread.sleep(1000);
		WebElement paymenttype = driver.findElement(By.id("payment_type"));
		Select select5 = new Select(paymenttype);
		select5.selectByIndex(1);
		WebElement cardtypetype = driver.findElement(By.id("card_type"));
		Select select6 = new Select(cardtypetype);
		select6.selectByIndex(1);

		WebElement cardname = driver.findElement(By.id("card_name"));
		cardname.sendKeys("parthasarathy");

		WebElement cardno = driver.findElement(By.name("card_no"));
		cardno.sendKeys("5555555555552222");
		WebElement month = driver.findElement(By.name("card_month"));
		Select select7 = new Select(month);
		select7.selectByVisibleText("February");

		WebElement cvv = driver.findElement(By.xpath("//input[@id='cvv']"));

		cvv.sendKeys("545");

		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();

		WebElement orderid = driver.findElement(By.xpath("//h2[@name='booking-code']"));
		String text2 = orderid.getText();
		System.out.println("text2" + text2);

		WebElement orderrid = driver.findElement(By.xpath("//div[@class='seccess-box text-center']"));
		String text11 = orderrid.getText();
		System.out.println("text11" + text11);

		driver.findElement(By.xpath("(//button[@class='btn filter_btn'])[2]")).click();
		WebElement bookings = driver.findElement(By.xpath("(//div[@class='col-md-5'])[1]"));
		String text5 = bookings.getText();
		System.out.println("text5" + text5);
		WebElement orderidonly = driver.findElement(By.xpath("//div[@class='room-code']"));
		String onlyid = orderidonly.getText();
		Thread.sleep(2000);
		WebElement searchorderid = driver.findElement(By.xpath("//input[@name='search']"));
		String id = onlyid.replace("#", "");
		searchorderid.sendKeys(id);
		Thread.sleep(3000);
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.keyRelease(KeyEvent.VK_UP);
//		robot.keyPress(KeyEvent.VK_RIGHT);
//		robot.keyRelease(KeyEvent.VK_RIGHT);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyRelease(KeyEvent.VK_BACK_SPACE);

		WebElement checkorderid = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		String orderidd = checkorderid.getText();

		WebElement price = driver.findElement(By.xpath("//strong[@class='total-prize']"));
		String pricee = price.getText();

		System.out.println("orderid and HotelName" + orderidd + "price" + pricee);

		driver.findElement(By.xpath("//button[@class='edit btn filter_btn']")).click();
		driver.findElement(By.xpath("//input[@name='check_in']")).click();
		WebElement modifieddate = driver.findElement(By.xpath("//a[text()='27']"));
		action.moveToElement(modifieddate).click().perform();
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		WebElement bookingsuccess = driver.findElement(By.xpath("//li[@class='alertMsg']"));
		String text6 = bookingsuccess.getText();
		System.out.println(text6);

		WebElement txt = driver.findElement(By.xpath("(//div[@class='col-md-5'])[1]"));
		String text10 = txt.getText();
		System.out.println("text10" + text10);
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='search']"));
	searchbox.sendKeys(id);
//		robot.keyPress(KeyEvent.VK_UP);
//		robot.keyRelease(KeyEvent.VK_UP);
//		robot.keyPress(KeyEvent.VK_RIGHT);
//		robot.keyRelease(KeyEvent.VK_RIGHT);
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		WebElement hotelname = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		String text8 = hotelname.getText();

		WebElement cost = driver.findElement(By.xpath("//strong[@class='total-prize']"));
		String text9 = cost.getText();
		System.out.println("order id and hotelname" + text8 + " price" + text9);

		driver.findElement(By.xpath("//a[@class='cancle btn filter_btn']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		Thread.sleep(1000);
		WebElement cancelmsg = driver.findElement(By.xpath("//li[@class='alertMsg']"));
		String text7 = cancelmsg.getText();
		System.out.println(text7);
		
	}

}
