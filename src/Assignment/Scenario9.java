package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario9 
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
		WebElement filters = driver.findElement(By.xpath("//span[@class='style-fill title']"));
		filters.click();
		WebElement goldpurity = driver.findElement(By.xpath("//span[@class='style-fill title']"));
		Actions a =new Actions(driver);
		a.moveToElement(goldpurity).build().perform();	
		Thread.sleep(4000);
		WebElement count = driver.findElement(By.xpath("//span[@data-tagcategory='Gold Purity']/span[text()='(165)']"));
		System.out.println("Count of 22K:"+count.getText());
		Thread.sleep(4000);
		driver.close();
		
	}

}
