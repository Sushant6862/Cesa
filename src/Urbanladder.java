import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Urbanladder 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(20000);
		 driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		 WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		 System.out.println(sale.getText());
		// driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("sofa",Keys.ENTER);
		 //driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("sofa");
		// driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		 
	
	}


}
