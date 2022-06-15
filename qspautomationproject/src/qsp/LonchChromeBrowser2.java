package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LonchChromeBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //Avoid the IllegalStateException 
		ChromeDriver driver = new ChromeDriver(); //to open the browser
		driver.manage().window().maximize();   // to maximize the browser
		driver.get("https://www.instagram.com");  //launch the web application
		Thread.sleep(10000);  //provide the delay 
		driver.close(); //close the browser

	}

}
