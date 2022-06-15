package MethodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");  //nevigate:navigation interface>- it use to launch the browser
		                                                 //And it perform operation back,forward & refresh
		driver.switchTo().activeElement().sendKeys("javaTpoint",Keys.ENTER);
		
		driver.navigate().back();   // back()
		Thread.sleep(5000);
		
		driver.navigate().forward();  // forward()
		Thread.sleep(5000);
		
		driver.navigate().refresh();   // refresh()
		

	}

}
