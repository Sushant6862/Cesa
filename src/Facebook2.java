import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@role='button']"));
		System.out.println(CreateNewAcc.isEnabled());
		if(CreateNewAcc.isEnabled())
			CreateNewAcc .click();
		Thread.sleep(4000);
		WebElement Male = driver.findElement(By.xpath("//label[text()='Male']"));
		if(Male.isDisplayed())
			Male.click();
		Thread.sleep(2000);
		System.out.println(Male.isSelected());
		System.out.println(Male.getCssValue("font-size"));
		System.out.println(Male.getCssValue("background-colour"));
		System.out.println(Male.getRect());
		System.out.println(Male.getRect().getPoint());
		Point location = Male.getLocation();
		System.out.println("x :"+location.getX()+"  y :"+location.getY());
		
	}

}
/* Methods:
   isEnabled()
   isDisplayed()
   isSelected()
   getCssValue()
   getRect()
   getRect().getPoint()
   getLocation()
*/