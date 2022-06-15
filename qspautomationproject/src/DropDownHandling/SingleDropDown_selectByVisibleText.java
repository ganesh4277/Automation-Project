package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown_selectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("file:///C:/Users/DELL/Desktop/html/singledropdown.html");
		WebElement DropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(DropDownElement);
		sel.selectByVisibleText("Paratha");
	}

}
