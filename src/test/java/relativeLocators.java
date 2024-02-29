

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Thread.sleep(2000);
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		//driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		
		String value =driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		
		System.out.println(value);
		
	}

}
