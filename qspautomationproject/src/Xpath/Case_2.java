package Xpath;

import org.openqa.selenium.By;           //case:2>> xpath using text() function
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_2 {                             //Syntax:- //tagName[text()='CompletTextValue']

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		
	}

}
