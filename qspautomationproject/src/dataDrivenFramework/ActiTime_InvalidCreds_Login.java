package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_InvalidCreds_Login {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7k5saqt/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(2000);

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/ActiTimeTestData.xlsx","invalidcreds");


		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", i, 1);



			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();




			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();


		}

	}

}
