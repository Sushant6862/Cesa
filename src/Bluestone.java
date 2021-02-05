import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("diamond rings",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Florian Rose Ring']")).click();
	}

}
/*
    goto bluestone.com
    search diamond ring
    click() it
    select the first img and click it

*/