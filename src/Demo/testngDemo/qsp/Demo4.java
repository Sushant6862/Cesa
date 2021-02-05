package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 
{
	//Dependency on Methods
	@Test(dependsOnMethods= {"tc2","tc3"})
	public void tc1()
	{
		Reporter.log("1Hi..!!", true);
	}
	
	
	@Test()
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
