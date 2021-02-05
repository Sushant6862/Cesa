import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 //ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(20000);
		WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println(username.getText());
		
		WebElement pwd = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(pwd.getText());
		
		WebElement ID = driver.findElement(By.xpath("//input[@name='username']"));
		ID.sendKeys(username.getText());
		
		WebElement password = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		password.sendKeys(password.getText());
		
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		//driver.findElement(By.partialLinkText("Inc.")).click();
		/*Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
			
		}
		System.out.println(driver.getTitle());
		*/
		 //WebElement sale = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		// WebElement sale = driver.findElement(By.xpath("//a/div[@id,'inProgressText')]"));
		
		//System.out.println(sale.getText());
	}

}
