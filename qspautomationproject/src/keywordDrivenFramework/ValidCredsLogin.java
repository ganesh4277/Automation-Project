package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidCredsLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		
		Flib flib = new Flib();

		String username = flib.readPropertyFile("./data/config.properties","username");
		String password = flib.readPropertyFile("./data/config.properties","password");
		
		bt.openBrowser();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();


	}

}
