package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_All {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/html/multipluedropdown.html");
		
		WebElement DropDown = driver.findElement(By.id("menu"));  
		Select sel = new Select(DropDown);                           //select Method

		for(int i=2;i<=10;i++)
		{
			sel.selectByIndex(i);
		}
		sel.deselectAll();
	}
}
