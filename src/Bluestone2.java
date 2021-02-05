
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//a[@title='Jewellery']"));
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement b :ele)
		{
			a.moveToElement(b).build().perform();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
		Thread.sleep(2000);
		Set<String>winshandel = driver.getWindowHandles();
		for(String win: winshandel)
		{
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//h1[contains(.,'The Udith Kada For Him')]"));
		System.out.println(b.getText());	
	}
}
/*
    goto bluestone.com
    mouse over to all jewellary
    click on kadas
    click on first kada
    switch the tabs
    select the size
    click on buy now
    fetch the title "The Udith Kada For Him"
    
*/