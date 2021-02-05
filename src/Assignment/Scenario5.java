package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//a[@title='Coins']"));
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement b :ele)
		{
			a.moveToElement(b).build().perform();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='10 gram']")).click();
		WebElement b=driver.findElement(By.xpath("//h1[text()='10 gram 24 KT Lakshmi Gold Coin']"));
		if(b.isDisplayed())
		{
			System.out.println(b.getText());
		}
		else
		{
			System.out.println("Not displayed");
		}
		driver.close();
	}

}
