package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/html/cheakbox.html");
		
		String SourceCodeWebPage=driver.getPageSource(); //getWebPage():String>- it use to get the source code of web page
		
		System.out.println(SourceCodeWebPage);
		

	}

}
