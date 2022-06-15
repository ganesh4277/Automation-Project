package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/feed/");
		
		driver.findElement(By.name("email-or-phone")).sendKeys("ganeshrasal@gmail.com"); 
		driver.findElement(By.id("password")).sendKeys("Ganesh@4277");
		driver.findElement(By.id("join-form-submit")).click();

		Thread.sleep(10000);
		
		driver.findElement(By.name("first-name")).sendKeys("Ganesh");
		driver.findElement(By.id("last-name")).sendKeys("Rasal");
		driver.findElement(By.id("join-form-submit")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("countryCode")).sendKeys("india");
		driver.findElement(By.id("register-verification-phone-number")).sendKeys("7767054048");
		driver.findElement(By.id("register-phone-submit-button")).click();
	}

}
