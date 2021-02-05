package Demo.testngDemo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 
{
	// Dependency on Groups
	@Test(groups="smoke",priority=3)
	public void tc1()
	{
		Reporter.log("1Hi..!!", true);
	}
	
	@Test(groups="regression",dependsOnGroups ="functional")
	public void tc2()
	{
		Reporter.log("2Hi..!!", true);
	}
	
	@Test(groups="functional",dependsOnGroups ="smoke",priority=-2)
	public void tc3()
	{
		Reporter.log("3Hi..!!", true);
	}
	
	@Test(groups="smoke",priority=2)
	public void tc4()
	{
		Reporter.log("4Hi..!!", true);
	}
	
	@Test(groups="functional",dependsOnGroups ="smoke",priority=-3)
	public void tc5()
	{
		Reporter.log("5Hi..!!", true);
	}
	
	@Test(groups="smoke",priority=1)
	public void tc6()
	{
		Reporter.log("6Hi..!!", true);
	}
	
	@Test(groups="functional",dependsOnGroups ="smoke")
	public void tc7()
	{
		Reporter.log("7Hi..!!", true);
	}

}
/*
   6Hi..!!
   4Hi..!!
   1Hi..!!
   5Hi..!!
   3Hi..!!
   7Hi..!!
   2Hi..!!
   PASSED: tc6
   PASSED: tc4
   PASSED: tc1
   PASSED: tc5
   PASSED: tc3
   PASSED: tc7
   PASSED: tc2
 */
