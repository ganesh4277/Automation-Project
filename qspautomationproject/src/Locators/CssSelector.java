package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.cssSelector("input[class*='VJZDxU']")).sendKeys("ganeshrasal4277@gmail.com");
		driver.findElement(By.cssSelector("input[class*='_3mctLh ']")).sendKeys("Ganesh4277");
		driver.findElement(By.cssSelector("input[class*='_2HKlqd ']")).click();
		
	}

}
