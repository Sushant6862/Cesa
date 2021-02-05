import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoacti2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
	   //driver.findElement(By.xpath("//div[1]/table[1]/tbody[1]/tr[2]/td[1]/b[1]")); 
		WebElement ele = driver.findElement(By.xpath("//td[text()='Please identify yourself']"));
		System.out.println(ele.getText());
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='atProductName']"));
		System.out.println(ele1.getText());
		WebElement ele2 = driver.findElement(By.xpath("//td[text()='Administrator:']"));
		System.out.println(ele2.getText());
		WebElement ele3 = driver.findElement(By.xpath("//b[text()='admin']"));
		System.out.println(ele3.getText());
		WebElement ele4 = driver.findElement(By.xpath("//b[text()='manager']"));
		System.out.println(ele4.getText());
		WebElement ele5 = driver.findElement(By.xpath("//b[text()='trainee']"));
		System.out.println(ele5.getText());
		WebElement ele6 = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		System.out.println(ele6.getText());
		WebElement ele7 = driver.findElement(By.xpath("//div[text()='Login ']"));
		System.out.println(ele7.getText());
		WebElement ele8 = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		System.out.println(ele8.getText());
		WebElement ele9 = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		System.out.println(ele9.getText());
		WebElement ele10 = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		System.out.println(ele10.getText());
	}

}
//index 
