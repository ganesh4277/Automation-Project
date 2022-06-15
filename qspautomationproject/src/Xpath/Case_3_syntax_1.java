package Xpath;

import org.openqa.selenium.By;      //case:3>> xpath using contains() function
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_3_syntax_1 {         //Syntax:- //tagName[contains(@attribute name,'PartOfTextValue')]

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(@class,'webdriver')]")).click();
	}

}
