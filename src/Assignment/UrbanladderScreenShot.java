package Assignment;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladderScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menuname:menus)
		{
			String mname=menuname.getText();
			System.err.println(mname);
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
			DemoscreenShotMethod.ScreenShot(driver,mname);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'"+mname+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement submenuname:submenus)
			{
				System.out.println(submenuname.getText());
			}
			Thread.sleep(2000);
		}	
	}
}
