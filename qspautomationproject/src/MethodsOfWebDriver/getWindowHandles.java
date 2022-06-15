
package MethodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();

		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		
		System.out.println("---------------------------------------");
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wh:allhandles)
		{
			System.out.println(wh);
		}



	}

}
