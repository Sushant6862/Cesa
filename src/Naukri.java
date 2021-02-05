 
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String parent =driver.getWindowHandle();
		System.out.println("parent"+parent);
		
		Set<String>winshandel = driver.getWindowHandles();
		/*ArrayList<String> a1=new ArrayList<>(winshandel);
		for(int i=a1.size()-1;i>=0;i--)
		{
			driver.switchTo().window(a1.get(i));
			driver.close();
			Thread.sleep(2000);
		}
		*/
		winshandel.remove(parent);
		
		for(String win: winshandel)
		{
			System.out.println("Child" + win);
			driver.switchTo().window(win);
			driver.close();
		}
		
		

	}


}
