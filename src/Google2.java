import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(10000);
	
		WebElement search = driver.findElement(By.xpath("//input[@spellcheck='false']"));
		search.sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement menuname:element)
		{
			System.out.println(menuname.getText());
		}
		element.get(2).click();
	}

}
// fetching all element in search and click on 3 element