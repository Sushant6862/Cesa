
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google5 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(4000);
		//WebElement button = driver.findElement(By.xpath("//span[text()='Next']"));
		boolean aa =driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed();
		while(aa)
		{
			 driver.findElement(By.xpath("//span[text()='Next']//parent::a")).click();
			 aa=driver.findElement(By.xpath("//span[text()='Next']//parent::a")).isDisplayed();
		}
	}

}
/*
    load https://www.google.com/
    search for java
    click on next button until page count is their
*/