package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_ByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/html/multipluedropdown.html");
		WebElement DropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(DropDown);
		
		sel.selectByVisibleText("Khichdi");         //Select
		
		Thread.sleep(4000);
		
		sel.deselectByValue("Khichdi");              //Deselect

	}

}
