package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_6_dependent_independent {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[.='✕']")).click();   //click on cancel arrow 
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 12pro max"); //pass input
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();  //write path for search icon
		
		Thread.sleep(2000);
		
		String TextOfWebElement = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Pro Max (Pacific Blue, 256 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		//1st write path for independent----> write path for parent ----> write for dependent
		
		System.out.println(TextOfWebElement);
	}
}