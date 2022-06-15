package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_6_Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[.='Hello, Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9579059756");  //Username
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pawar@1211");   //password
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).sendKeys("DELL Laptop");  //search and click
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
