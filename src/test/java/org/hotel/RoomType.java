package org.hotel;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoomType extends Baseclass{
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
		// junit.framework.Assert.assertEquals(text, );
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@class='fliter_box_inner text-center'])[2]")).click();
		WebElement state = driver.findElement(By.id("state"));
		Select select = new Select(state);
		select.selectByIndex(5);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select City *']")).click();
		WebElement city = driver.findElement(By.xpath("//li[text()='Chennai']"));
		city.click();
		//WebElement roomType = driver.findElement(By.xpath("//textarea[@placeholder='Select Room Type']"));
//		String s = "Standard/Deluxe/Studio";
//		String[] split = s.split("/");
//		for(String x: split ) {
//			sendKeys(roomType, x);
//
//			enterKey();
//
//		}

			
//		
//		Actions actions = new Actions(driver);
//		driver.findElement(By.xpath("//textarea[@placeholder='Select Room Type']")).click();
//		List<WebElement> roomtypes = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
		
		//	System.out.println(roomtypes.size());
		//	for (WebElement webElement : roomtypes) {	
//			WebDriverWait driverWait = new  WebDriverWait(driver, Duration.ofSeconds(10));
//			driverwait.until(ExpectedConditions.visibilityOf((WebElement) webElement));
			//driver.findElement(By.xpath("//textarea[@placeholder='Select Room Type']")).click();
				
//				actions.moveToElement(webElement).click().perform();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//textarea[@placeholder='Select Room Type']")).click();
//				
//			}
		driver.findElement(By.xpath("//input[@name='check_in']")).click();
		WebElement datepicker = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		
	WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		
		String month  = "March";
		String day = "28";
		String year = "2024";
		if (Integer.parseInt(day) >= 29) {
			System.out.println("wrong date" + day);
			
		
		}
		
		String monthyear = getText(datepicker);
		String[] split = monthyear.split(" ");
     for (String string2 : split) {
    	 System.out.println(string2);
	}
       
		while (!(split[0].equals(month)&& split[1].equals(year))) {
			click(next);
		
		try {
			WebElement datepickerr= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		} catch (Exception e) {
			// TODO: handle exceptionmonthyear = getText(datepickerr);
			split = monthyear.split(" ");
		}	
				
			
		}
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		





	}

}