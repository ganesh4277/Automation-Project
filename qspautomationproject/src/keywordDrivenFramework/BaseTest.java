package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	static WebDriver driver;

	//method to close the browsers
	public void openBrowser() throws IOException
	{
		//read the data from property file (browser)
		Flib flib = new Flib(); 

		//read the data from property file (url)
		String BrowserValue = flib.readPropertyFile("./data/config.properties","browser");

		//use the value of browser
		String url = flib.readPropertyFile("./data/config.properties","url");

		if(BrowserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

			driver.get(url);

		}
		else if(BrowserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

			driver.get("url");

		}
		else
		{
			System.out.println("Enter Your Choice");
		}


	}


	//method to close the browsers
	public void closeBrowser()
	{
		driver.quit();
	}

}
