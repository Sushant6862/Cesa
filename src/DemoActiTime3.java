import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActiTime3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath(" //div[contains(.,'Login')]/parent::a[@id='loginButton']")).click();
	    WebDriverWait ww = new WebDriverWait(driver,10);
	    ww.until(ExpectedConditions.titleContains("Enter"));
	    driver.findElement(By.id("logoutLink")).click();
	}

}
/*
    load https://demo.actitime.com/login.do
    pass user name admin
    password manager
    click on login button
    after log click on log out

*/