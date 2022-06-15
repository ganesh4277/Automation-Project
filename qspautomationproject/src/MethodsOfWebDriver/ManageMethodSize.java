package MethodsOfWebDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Dimension targetSize = new Dimension(500,250);
		
		driver.manage().window().setSize(targetSize); //manage the size of the method
		

	}

}
