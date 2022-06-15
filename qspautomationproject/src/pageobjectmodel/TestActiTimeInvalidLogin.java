package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends BaseTest implements IAutoConstant {

	public static void main(String[] args) throws IOException {


		BaseTest bt = new BaseTest(); //login operation
		bt.setUp();                   // or openBrowser
		   
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");
		
		
		for(int i=1;i<rc;i++)   ////read the data from excel file
		{
			String validUsername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 0);
			String validpassword = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 1);
			lp.ActiTimeValidLogin(validUsername, validpassword);
			
		}
	}

}
