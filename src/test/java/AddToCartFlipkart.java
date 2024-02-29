import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartFlipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/all/~cs-78273c7d64ba065d38be20c1c85e204f/pr?sid=qoc,acb,0xb&marketplace=FLIPKART&restrictLocale=true&fm=personalisedRecommendation%2FfAssured&iid=R%3Afa%3Bpt%3Ahp%3Buid%3Abb767b66-cb36-11ed-9281-11feaf73cc05%3B.cid%3AS_F_N_qoc_acb_0xb__fa___NONE_ALL%3Bnid%3Aqoc_acb_0xb_%3Bet%3AS%3Beid%3Aqoc_acb_0xb_%3Bmp%3AF%3Bct%3Afa%3B&ppt=browse&ppn=browse&ssid=ncbcqsy6o00000001679767142719&otracker=hp_reco_Best%2BQuality_2_13.dealCard.OMU_cid%3AS_F_N_qoc_acb_0xb__fa___NONE_ALL%3Bnid%3Aqoc_acb_0xb_%3Bet%3AS%3Beid%3Aqoc_acb_0xb_%3Bmp%3AF%3Bct%3Afa%3B_6&otracker1=hp_reco_WHITELISTED_personalisedRecommendation%2FfAssured_Best%2BQuality_DESKTOP_HORIZONTAL_dealCard_cc_2_NA_view-all_6&cid=cid%3AS_F_N_qoc_acb_0xb__fa___NONE_ALL%3Bnid%3Aqoc_acb_0xb_%3Bet%3AS%3Beid%3Aqoc_acb_0xb_%3Bmp%3AF%3Bct%3Afa%3B");
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='Skipping Ropes']"));
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@alt='Skipping Ropes']")).click();

		String itemsNeeded = "S R Fitness Cotton Skipping Rope With Wood Handle Freestyle Skipping Rope";
		

		List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class=\"CXW8mj\"]"));

		System.out.println(listOfProducts.size());

		for (int i = 0; i < listOfProducts.size(); i++) {

			String item =  listOfProducts.get(i).getText();
			
			if(item.contains(itemsNeeded))
			{
				
				driver.findElements(By.xpath("//div[@class=\"CXW8mj\"]")).get(i).click();
				break;
				
			}
			
		}

	}

}
