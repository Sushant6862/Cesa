import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class flipkart1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		/*List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
		for(WebElement menuname:menus)
		{
			System.out.println(menuname.getText());
		}
		*/
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		Actions a =new Actions(driver);
		for(WebElement menuname:menus)
		{
			System.out.println(menuname.getText());
			a.moveToElement(menuname).build().perform();
		}
		
	}

}
