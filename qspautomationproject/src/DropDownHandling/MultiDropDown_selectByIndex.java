package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown_selectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("file:///C:/Users/DELL/Desktop/html/multipluedropdown.html");
		WebElement MultiPlueDropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(MultiPlueDropDown);
		
		for(int i=1;i<=8;i++)
		{
			sel.selectByIndex(i);        //for multiple dropdown use only selectByIndex()
		}
	}

	
}
