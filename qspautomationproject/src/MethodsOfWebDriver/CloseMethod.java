package MethodsOfWebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://omayo.blogspot.com/"); 
		
		Thread.sleep(10000);

		driver.close(); //close method:void>-close only parent browser

	}

}
