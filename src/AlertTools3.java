import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTools3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(2000);
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.sendKeys("Sushant");
	    Thread.sleep(2000);
	    a.accept();   
	}
}
