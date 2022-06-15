package MethodsOfWebDriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 Point targetPosition = new Point(50,150);
		 
		driver.manage().window().setPosition(targetPosition); //manage the Position of web page
		

	}

}
