package org.hotel;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidDetails {
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
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@class='iframe']"));
		driver.switchTo().frame(outerframe);
		WebElement searchbtn = driver.findElement(By.xpath("//button[text()='Search']"));
		searchbtn.click();
		driver.switchTo().parentFrame();
	WebElement state = driver.findElement(By.xpath("//div[@class='invalid-feedback animated fadeInDown']"));
	
	System.out.println(state.getText());
	
	WebElement city = driver.findElement(By.xpath("//div[text()='Please select city']"));
	System.out.println(city.getText());
	WebElement checkin = driver.findElement(By.xpath("//div[@id='invalid-check_in']"));
	System.out.println(checkin.getText());
	WebElement checkout = driver.findElement(By.xpath("//div[@id='invalid-check_out']"));
	System.out.println(checkout.getText());
	WebElement noofrooms = driver.findElement(By.xpath("//div[@id='invalid-no_rooms']"));
	System.out.println(noofrooms.getText());
	WebElement noofadults = driver.findElement(By.xpath("//div[@id='invalid-no_adults']"));
	System.out.println(noofadults.getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
