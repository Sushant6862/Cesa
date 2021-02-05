

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitysam1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		/*
	    //driver.navigate().to("E:\\Selenium\\sam1.html");                                        // sam1.html
		driver.get("file:///E:/Selenium/VisibilityOfTextbox.html");
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);                        // sam1.html
	   // driver.findElement(By.name("textA")).sendKeys("name");                                  // sam1.html
	      WebDriverWait ww = new WebDriverWait(driver,10);
	   // ww.until(ExpectedConditions.textToBePresentInElementValue(By.name("textA"),"name"));     // sam1.html
	   // driver.findElement(By.name("textB")).sendKeys("Sushant");                                // sam1.html
	    ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox"))));
	    driver.findElement(By.id("iamtextbox")).sendKeys("Sushant");
		*/
	    
		// DisabledText.html
	    driver.get("file:///E:/Selenium/DisabledText.html");
	    WebDriverWait ww = new WebDriverWait(driver,10);
	    driver.findElement(By.id("abc")).sendKeys("name");
	   ww.until(new ExpectedCondition<Boolean>()
			   {
				@Override
				public Boolean apply(WebDriver arg0) {
					// TODO Auto-generated method stub
					return !driver.findElement(By.id("xyz")).isEnabled();
				}
			   });
	   driver.findElement(By.id("pqr")).sendKeys("SuShant");
    
	   }
		   
}			   
			   	
	


