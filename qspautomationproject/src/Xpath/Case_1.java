package Xpath;

import org.openqa.selenium.By;             //case:1>> xpath using unique attribute
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_1 {

	public static void main(String[] args) {           //Syntax:- //tagName[attribute name='attribute Value']
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin"); 
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click(); 
	}

}
