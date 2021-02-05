package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	
	//@Test(invocationCount=5)   
	@Test()
	public void tc()
	{
		Reporter.log("Hi..!!", true);
	}
}
