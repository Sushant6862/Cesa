package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoscreenShotMethod 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		ScreenShot(driver,"facebook");
	}
    public static void ScreenShot(WebDriver driver,String name) throws IOException
    {
    	TakesScreenshot ts =(TakesScreenshot)driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File screenshotsave=new File("./ScreenShot/"+ name + ".png");
		Files.copy(screenShot, screenshotsave);
    }
}
