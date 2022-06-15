package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bewakoof.com");
		
		driver.findElement(By.name("email")).sendKeys("ganeshrasal4277@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ganesh4277");
		driver.findElement(By.id("mob_login_password_submit")).click();
		
		//Thread.sleep(10000);
		
		//driver.findElement(By.linkText("Forgot Password?"));
	}

}
