import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> menus = driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li"));
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menuname:menus)
		{
			String mname=menuname.getText();
			System.err.println(mname);
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//ul[@class='odd-even-bg']/li"));
			//List<WebElement> submenus = driver.findElements(By.xpath("//a[contains(.,'"+mname+"')]/parent::li/descendant::ul[@class='odd-even-bg']/li/div/ul/li"));
			//List<WebElement> submenus = driver.findElements(By.xpath("//a[contains(.,'"+mname+"')]/parent::li/descendant::ul[@class='odd-even-bg']/li/div/ul/li"));
			for(WebElement submenuname:submenus)
			{
				System.out.println(submenuname.getText());
			}
			Thread.sleep(2000);
		}
	}
	//fetching all menus and sub menus on Console
}
