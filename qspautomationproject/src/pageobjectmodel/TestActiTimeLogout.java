package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest implements IAutoConstant{

	public static void main(String[] args) throws IOException {

		BaseTest bt = new BaseTest();
		bt.setUp();               //open the browser

		Flib flib = new Flib();  //read the data from excel file by using generic reusable methods

		String validusername = flib.readPropertyFile(PROP_PATH,"username");
		String validpassword = flib.readPropertyFile(PROP_PATH,"password");

		LoginPage lp = new LoginPage(driver);                  // login perform
		lp.ActiTimeValidLogin(validusername,validpassword); 

		HomePage hp = new HomePage();     //logout perform
		hp.clickLogout();

	}

}
