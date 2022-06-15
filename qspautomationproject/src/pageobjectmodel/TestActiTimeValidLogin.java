package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest(); // open browser
		bt.setUp();                   // or openBrowser
		
		Flib flib = new Flib();    //read the data from excel file by using generic reusable methods
		
		String validusername = flib.readPropertyFile(PROP_PATH,"username");
		String validpassword = flib.readPropertyFile(PROP_PATH,"password");
		
		LoginPage lp = new LoginPage(driver);                //login operation perform
		lp.ActiTimeInValidLogin(validusername, validpassword);
		
		bt.tearDown();

	}

}
