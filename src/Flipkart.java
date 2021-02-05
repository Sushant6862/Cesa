import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(30000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphones",Keys.ENTER);
		 driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphones");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@class='_396cs4  _3exPp9']")).click();
	}


}
