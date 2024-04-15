package org.hotel;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllHotelNameAndCost {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
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
		WebElement date = driver.findElement(By.xpath("//a[text()='27']"));

		Actions action = new Actions(driver);
		action.moveToElement(date).click().perform();
		WebElement checkout = driver.findElement(By.name("check_out"));
		checkout.click();

		WebElement checkoutdate = driver.findElement(By.xpath("//a[text()='28']"));
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
		
//		
//		WebElement hotel1 = driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Suite']"));
//		System.out.println(hotel1.getText());
//		WebElement prize1 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[1]"));
//		System.out.println(prize1.getText());
//		 
//
//		WebElement hotel2 = driver.findElement(By.xpath("//h5[text()='ITC Grand Chola Hotel Suite']"));
//		System.out.println(hotel2.getText());
//		WebElement prize2 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[2]"));
//		System.out.println(prize2.getText());
//		
//
//		WebElement hotel3 = driver.findElement(By.xpath("//h5[text()='Radisson Blu Resort Temple Bay Suite']"));
//		System.out.println(hotel3.getText());
//		WebElement prize3 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[3]"));
//		System.out.println(prize3.getText());
//		
//		
//		WebElement hotel5 = driver.findElement(By.xpath("//h5[text()='Taj Coromandel Suite']"));
//		System.out.println(hotel5.getText());
//		WebElement prize5 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[5]"));
//		System.out.println(prize5.getText());
//		
//
//		WebElement hotel6 = driver.findElement(By.xpath("//h5[text()='Taj Connemara Suite']"));
//		System.out.println(hotel6.getText());
//		WebElement prize6 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[6]"));
//		System.out.println(prize6.getText());
//		
//
//		WebElement hotel4 = driver.findElement(By.xpath("//h5[contains(text(),'Taj Fisherman')]"));
//		System.out.println(hotel4.getText());
//		WebElement prize4 = driver.findElement(By.xpath("(//strong[@class='total-prize'])[4]"));
//		System.out.println(prize4.getText());
//		
		
 List<WebElement> hotels = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']/h5"));
List<WebElement> price = driver.findElements(By.xpath("//div[@class='prize']/strong"));
//		
//		for (WebElement x : hotels) {
//			String text2 = x.getText();
//			System.out.println(text2);
//		}
//		
		for (int i = 0; i <hotels.size(); i++) {
		String text2 = hotels.get(i).getText();
		System.out.println(text2);
		String text3 = price.get(i).getText();
		System.out.println(text3);
			
		}
		
		
		
	}
}