package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_ValidCreds_Login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7k5saqt/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		Flib flib = new Flib();
		
		String Usename = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,0);
		String Password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,1);
		
		
		driver.findElement(By.name("username")).sendKeys(Usename);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.id("loginButton")).click();
	}

}
