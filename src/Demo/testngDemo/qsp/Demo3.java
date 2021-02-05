package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	
	@Test()
	public void tc1()
	{
		Reporter.log("1Hi..!!", true);
	}
	
	//@Test(enabled=false),(invocationCount=0),==>not delete,execute program
	@Test(invocationCount=0)
	public void tc2()
	{
		Reporter.log("2Hi..!!", true);
	}
	
	@Test(priority=-2)
	public void tc3()
	{
		Reporter.log("3Hi..!!", true);
	}
}
