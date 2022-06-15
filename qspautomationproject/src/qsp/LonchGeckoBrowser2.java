package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LonchGeckoBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();//Open the browser 
		driver.manage().window().maximize(); //to maximize the browser
		driver.get("https://www.instgram.com"); //launch the web application
		Thread.sleep(10000); //provide the delay in mil.sec
		driver.close(); //close the application

	}

}
