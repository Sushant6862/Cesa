import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menuname:menus)
		{
			String mname=menuname.getText();
			System.err.println(mname);
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'"+mname+"')]/parent::div[@class='_1kidPb']"));
			for(WebElement submenuname:submenus)
			{
				System.out.println(submenuname.getText());
			}
			Thread.sleep(2000);
			
		}
	}

}
//fetching all menus and sub menus on web-page 
