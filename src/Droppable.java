import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("draggable"));
		WebElement ele1 = driver.findElement(By.id("droppable"));
		Actions a =new Actions(driver);
		a.dragAndDrop(ele,ele1).build().perform();
		WebElement text = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(text.getText());
	}

}
