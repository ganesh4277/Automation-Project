package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_20 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web1 = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web1).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Coins by Design']")).click();
		driver.findElement(By.xpath("//div[.='10']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
