import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addToCartScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot" };

		List<WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));

		System.out.println(listOfProducts.size());

		for (int i = 0; i < listOfProducts.size(); i++) {

			String[] productName = listOfProducts.get(i).getText().split("-");
			
			String formattedName = productName[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			int j=0;

			if (itemsNeededList.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}

		}

	}

}
