import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Inc.")).click();
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
			
		}
		System.out.println(driver.getTitle());
		hii...!! i am sushant on github
	}

}
