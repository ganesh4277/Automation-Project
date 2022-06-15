package MethodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nevigate1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
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
