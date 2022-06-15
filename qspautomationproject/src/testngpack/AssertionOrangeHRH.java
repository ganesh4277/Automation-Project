package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionOrangeHRH {
	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdrivwe.chrome.driver","./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void launchTheBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.oranggehrmlive.com/");
	}

	@Test
	public void testCAse() 
	{
		SoftAssert softAssert = new SoftAssert();
		
		String actualLoginPageTitle = driver.getTitle();
		
		softAssert.assertEquals(actualLoginPageTitle,"OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualHomePageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomePageTitle, "OrangeHRMHomePage");
		Reporter.log("create user",true);
		Reporter.log("create contact",true);
		softAssert.assertAll();

	}
}
