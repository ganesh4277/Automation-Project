package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/html/login.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("i1")).sendKeys("Aksah");
		driver.findElement(By.id("i2")).sendKeys("Lic@1234");

	}

}
