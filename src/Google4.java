import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google4 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(4000);
		WebElement value = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		System.out.println(value.getAttribute("value"));
		value.clear();
		WebElement test = driver.findElement(By.name("q"));
		test.sendKeys("testng",Keys.ENTER);
	}
}
/*
     goto google.com
     search the java
     fetch the valve of values attribute
     clear the search bar
     search for testng



*/