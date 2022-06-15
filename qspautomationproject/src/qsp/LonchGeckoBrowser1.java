package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LonchGeckoBrowser1 {
	
	static        //block use before the main method
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		new FirefoxDriver();// open firefox useing static block

	}

}
