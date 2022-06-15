package TestAnnotation;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class dataProvider { 
  WebDriver driver;
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-7k5saqt/login.do");	  
  }

  @Test(dataProvider="testActiTimeData")
  public void loginActiTime()
  {
	  
  }
  
  
  
  
  @AfterMethod
  public void tearDown()
	{
		driver.quit();
	}

}
