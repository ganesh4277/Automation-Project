package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/html/login.html");
		
		WebElement UserTextBox = driver.findElement(By.id("i1"));
		UserTextBox.sendKeys("admin");
		System.out.println(UserTextBox);
		
		WebElement PasswordTextBox = driver.findElement(By.name("n2"));
		PasswordTextBox.sendKeys("manger");
		System.out.println(PasswordTextBox);
		
		

	}

}
