import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class praticeAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Virendrasinh Rajput");
		driver.findElement(By.name("email")).sendKeys("viru111@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dp_value = new Select(dropdown);
		dp_value.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("08/06/1994");
		driver.findElement(By.cssSelector("input[type='Submit']")).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,-300)");
		String text = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(text);
	}

}
