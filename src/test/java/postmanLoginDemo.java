import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.ObjectMapper;

import Base.baseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class postmanLoginDemo extends baseClass {
	
	public static WebDriverWait wait; 
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		String downloadFilepath = System.getProperty("user.dir") + File.separator + "Downloads";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--no-sandbox", "--remote-allow-origins=*", "--disable-popup-blocking",
				"--enable-infobars");
		driver = new ChromeDriver(options);
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://identity.getpostman.com/login");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#username")).sendKeys("vrajput@synoptek.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='app-root']/div[@class='app-requester']/div[@class='app-requester']/div[@class='requester-header']/div/div[@class='requester-header__section-left']//div[@class='workspace-switcher__name']/span[@type='body-large']")).click();
		driver.findElement(By.xpath("//div[@id='app-root']/div[@class='app-requester']/div[@class='app-requester']/div[@class='requester-header']/div/div[@class='requester-header__section-left']//div[@class='workspace-switcher']/div[2]//a[@href='https://bold-meadow-533273.postman.co/workspace/7beeb32a-c9fa-4cde-8180-c6e713919f72']/div//span")).click();
		Thread.sleep(7000);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'pm-loader-container')]")));
		
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//div[contains(text(),'EDI_load_Tender')]"));
		action.moveToElement(we).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='app-root']/div[@class='app-requester']/div[@class='app-requester']/div[@class='pane-group vertical']/div[1]/div[1]/div[@class='pane-content']/div[@class='drop-files-dropzone-container workspace-drop-zone-container']/div[@class='requester-contents']//div[@class='pane resizableX resizableY sidebar']//div[@class='collection-sidebar-list']//div[@class='collection-sidebar-list__list']/div/div[1]/div[@class='collection-sidebar-list-item__head']/div/div[@role='button']//div[@class='collection-sidebar-dropdown-actions-wrapper']")).click();
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Export')]"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//*[contains(text(),'Export')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'Button__StyledButton-b8af3e-1 cehxYJ')]/span[text()='Export']")).click();
		
		System.out.println("Automation testing");
		
		System.out.println("Learning git/github version control systems");
		
		
	}
	
	
	

}
