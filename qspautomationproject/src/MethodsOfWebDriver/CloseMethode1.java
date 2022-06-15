package MethodsOfWebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMethode1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("http://omayo.blogspot.com/"); 
		
		Thread.sleep(10000);

		driver.close(); //close method:void>-close only parent browser

	}

}
