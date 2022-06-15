package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgFirstClass {

	@Test
	public void method1() 
	{ 
		Reporter.log("method1 executed"); 			
	}

	@Test
	public void method2() 
	{ 
		Reporter.log("method2 executed"); 			
	}

	@Test
	public void method3() 
	{ 
		int i=0;
		int result=9/i;
		System.out.println(result);
		Reporter.log("method3 executed"); 			
	}

	@Test
	public void method4() 
	{ 
		Reporter.log("method4 executed"); 			
	}

	@Test
	public void method5() 
	{ 
		Reporter.log("method5 executed"); 			
	}
}
