import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 //ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		
		
		WebElement search = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		search.sendKeys("sushantdongare");
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("12345678");
		WebElement logIn = driver.findElement(By.name("login"));
		logIn.click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//System.out.println(driver.getTitle());
	}

}
