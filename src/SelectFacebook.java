
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@role='button']"));
		System.out.println(CreateNewAcc.isEnabled());
		if(CreateNewAcc.isEnabled())
			CreateNewAcc .click();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.id("day"));
		Select sday= new Select(day);
		sday.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth= new Select(month);
		smonth.selectByIndex(11);
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear= new Select(year);
		syear.selectByVisibleText("1995");
	}
}

