import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mytra 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(10000);
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions a =new Actions(driver);
		for(WebElement menuname:menus)
		{
			System.out.println(menuname.getText());
			a.moveToElement(menuname).build().perform();
		}
	}

}
