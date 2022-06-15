package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest implements IAutoConstant {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		
		Flib flib = new Flib();

		String username = flib.readPropertyFile(PROP_PATH,"username");
		String password = flib.readPropertyFile(PROP_PATH,"password");
		
		bt.openBrowser();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();


	}

}
