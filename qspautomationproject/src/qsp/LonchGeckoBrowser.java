package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LonchGeckoBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();  // open Firefox browser

	}

}
