package Demo.testngDemo.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Child extends Parent 
{
	@Test
	public void tc_1() throws InterruptedException
	{
	
		WebElement search = driver.findElement(By.xpath("//input[@spellcheck='false']"));
		search.sendKeys("java",Keys.ENTER);
	
	}
	
	@Test
	public void tc_2() throws InterruptedException
	{
	
		WebElement search = driver.findElement(By.xpath("//input[@spellcheck='false']"));
		search.sendKeys("testng",Keys.ENTER);
	
	}

}
