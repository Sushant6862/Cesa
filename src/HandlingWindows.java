import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("The title of the main windows :"+driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']"));
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='    click   ']"));
		clickButton .click();
		Thread.sleep(2000);
		
		
		Set<String>winshandel = driver.getWindowHandles();
		//winshandel.remove(parent);
		
		System.out.println("The title of the child windows :"+driver.getTitle());
		
		//String parent =driver.getWindowHandle();
		//System.out.println("parent"+parent);
		//Set<String>winshandel = driver.getWindowHandles();
		//winshandel.remove(parent);
		
	}

}
