import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkCountonpageDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footerDriver.findElements(By.tagName("a")).size());
	
	WebElement columndriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	{
		String linkToOpenNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(linkToOpenNewTab);
		Thread.sleep(3000);
		
	}
	
	Set<String> childWIndows = driver.getWindowHandles();
	Iterator<String> it = childWIndows.iterator();
	
	while(it.hasNext())
	{
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	}
}
