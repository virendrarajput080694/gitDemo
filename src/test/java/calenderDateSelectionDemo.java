import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderDateSelectionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(2000);
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='dayContainer']/span"));
		int count = driver.findElements(By.xpath("//div[@class='dayContainer']/span")).size();
		for(int i=0;i<count;i++)
		{
			
			String text = driver.findElements(By.xpath("//div[@class='dayContainer']/span")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
			{
				
				driver.findElements(By.xpath("//div[@class='dayContainer']/span")).get(i).click();
				break;
			}
			
		}

	}

}
