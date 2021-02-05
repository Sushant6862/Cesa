import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphones");
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));
		for(WebElement menuname:element)
		{
			System.out.println(menuname.getText());
		}
		element.get(2).click();
	}

}
//fetching all element in search(iphones) and click on 3rd iphone