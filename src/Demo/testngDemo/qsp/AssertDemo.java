package Demo.testngDemo.qsp;



import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo
{
	@Test
	public void tc()
	{
		String st1="ABC"; // actual
		String st2="ABC"; // expected
		Assert.assertEquals(st1, st2);
		Reporter.log("Matched",true);
		List<Object> list1 =new ArrayList<>();
		list1.add(true);
		list1.add(99);
		list1.add(55.6);
		List<Object> list2 =new ArrayList<>();
		list2.add(true);
		list2.add(99);
		list2.add(55.6);
		Assert.assertEquals(list1, list2);
		Reporter.log("Matched2",true);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ABC","ABC");
		Reporter.log("Matchedsa",true);
		sa.assertAll();
		Assert.fail();
		
	}

}
