package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/login");
		
		driver.findElement(By.id("inputEmail")).sendKeys("ganeshrasal4277@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Ganesh4277");
		driver.findElement(By.id("login")).click();
		
		
	}

}
