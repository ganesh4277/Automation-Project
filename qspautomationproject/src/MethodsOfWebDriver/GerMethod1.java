package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GerMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/"); // Get Method:void >- use to Launch browser
		
		Thread.sleep(10000);

	}

}
