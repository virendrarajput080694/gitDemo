import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeloginPage {

	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,5);
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		String[] itemsNeeded = { "iphone", "Samsung", "Nokia", "Blackberry" };
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[@class='checkmark']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		WebElement element = driver.findElement(By.xpath("//*[@class='form-control'][@data-style='btn-info']"));
		Select s = new Select(element);
		s.selectByValue("consult");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#terms")));
		driver.findElement(By.cssSelector("input#terms")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#signInBtn")));
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='container']")));
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[text()='iphone X']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", ele1);
		
		addTocart(driver, itemsNeeded);
		
		WebElement checkOut = driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']"));
		js.executeScript("arguments[0].scrollIntoView(true);", checkOut);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

	public static void addTocart(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class='card-title']"));

		System.out.println(listOfProducts.size());

		for (int i = 0; i < listOfProducts.size(); i++) {

			String[] productName = listOfProducts.get(i).getText().split(" ");

			String formattedName = productName[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			int j = 0;

			if (itemsNeededList.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='card-footer']/button[@class='btn btn-info']")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}

	}

}
