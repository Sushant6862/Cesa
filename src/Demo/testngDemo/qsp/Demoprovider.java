package Demo.testngDemo.qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demoprovider
{
	@Test(dataProvider="demo",dataProviderClass = DemoReadDataProvider.class)
	public void tc(String user,String pass)
	{
		Reporter.log(user +"  "+ pass, true);
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	    driver.findElement(By.xpath(" //div[contains(.,'Login')]/parent::a[@id='loginButton']")).click();
	    WebDriverWait ww = new WebDriverWait(driver,10);
	    ww.until(ExpectedConditions.titleContains("Enter"));
		
	}

}
