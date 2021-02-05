package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		search.sendKeys("Rings",Keys.ENTER);
		Thread.sleep(4000);
		WebElement delivery = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/descendant::span[text()='Delivery Time']"));
		Actions a =new Actions(driver);
		a.moveToElement(delivery).build().perform();	
		Thread.sleep(4000);
		WebElement count = driver.findElement(By.xpath("//span[@data-displayname='next day delivery']/span[@class='items-count']"));
		System.out.println("Count of Next Day Delivery:"+count.getText());
		Thread.sleep(4000);
		driver.quit();
	}

}
