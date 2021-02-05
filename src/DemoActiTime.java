import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActiTime
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		
	    WebDriverWait ww = new WebDriverWait(driver,10);
	    ww.until(new ExpectedCondition<Boolean>()
			   {
				@Override
				public Boolean apply(WebDriver driver) 
				{
					JavascriptExecutor js=(JavascriptExecutor)driver;
					System.out.println(js.executeScript("return document.readyState").toString());
					boolean pgl=js.executeScript("return document.readyState").toString().equals("complete");
					return pgl;
				}
			   });
		
		
	
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.xpath(" //div[contains(.,'Login')]/parent::a[@id='loginButton']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(.,'New')]")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='selectedItem']/div[contains(.,'- Select Customer -')]")).click(); 
	    driver.findElement(By.xpath("//div[@class='searchItemList']/div[contains(.,'- New Customer -')]")).click(); 
	    driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("xyz");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(.,'Create Tasks')]/div[@class='components_button withPlusIcon']")).click();
	    WebElement error = driver.findElement(By.xpath("//span[text()='Please correct all errors in the fields highlighted in red.']"));
	   // System.out.println(error.getText());
	    System.out.println(error.getAttribute("innerText"));
	}
}
//assignment fetch the error message