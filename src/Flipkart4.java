import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart4
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("c# book",Keys.ENTER);
		Thread.sleep(4000);
	
	    WebElement price =driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
	    price.click();
		Actions a =new Actions(driver);
		a.moveToElement(price).build().perform();
		Thread.sleep(4000);
		
	}

}
//assignment