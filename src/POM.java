 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Java",Keys.ENTER);
		driver.navigate().back();
		search.sendKeys("testng",Keys.ENTER);
	}

}
/*
    launch the browser
    load seleniumhq.org
    find search bar and store it in to variable
    Search java//search.sendKeys()
    navigate back
    search testng//serach.sendKeys()

 */