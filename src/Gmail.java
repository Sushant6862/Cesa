

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("sushantdongare11@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		//WebElement password = driver.findElement(By.name("password"));
		//password.sendKeys("123456789");
		//driver.findElement(By.id("identifierNext")).click();
		
	}
}