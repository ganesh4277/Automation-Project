package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LonchChromeBrowser1 {

	static       //block use before main method
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		new ChromeDriver();// open chrome driver useing static block

	}

}
