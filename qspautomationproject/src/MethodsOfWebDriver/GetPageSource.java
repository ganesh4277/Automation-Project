package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/Desktop/html/cheakbox.html");
		
		String SourceCodeWebPage=driver.getPageSource(); //getWebPage():String>- it use to get the source code of web page
		
		System.out.println(SourceCodeWebPage);
		

	}

}
