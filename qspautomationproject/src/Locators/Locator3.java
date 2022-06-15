package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://id.heroku.com/login");
		
		driver.findElement(By.id("email")).sendKeys("ganeshrasal4277@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ganesh4277");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
		
	
	}

}
