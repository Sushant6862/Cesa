package org.qsp.testPom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Urbanladder;
;

public class TestUrbanladdar
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Urbanladder ul=new Urbanladder(driver);
		ul.closeClick();
		ul.livingMouseover(driver);
		ul.sofaClick();
		ul.viewproduct();
		
		
	}

}
