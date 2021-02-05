import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");    //down
		//js.executeScript("window.scrollBy(0,-500)");    //up
		
		/*js.executeScript("window.scrollBy(600,0)");       //right
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-200,0)");        //left
		*/
		
	
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");     //scroll-Full down
		//Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");    //scroll-Full up
		
		WebElement srf=driver.findElement(By.xpath("//h2[text()='Stand for Handmade']"));  // scroll-Till a web-element
		js.executeScript("arguments[0].scrollIntoView()",srf);
	}

}
