package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethode1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(10000);
		
		driver.quit();  //quit Method:void >- use to close all the browser

	}

}
