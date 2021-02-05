import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///E:/Selenium/ButtonClick.html");
	    WebDriverWait ww = new WebDriverWait(driver,20);
	  
	    ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("otherBtn"))));
	    driver.findElement(By.id("otherBtn")).click();
	    
	    ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sBtn"))));
	    driver.findElement(By.id("sBtn")).click();
	   
    }

}
