

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserUtility {

	static WebDriver driver;

	
	
	  @BeforeTest
	  
	  @Parameters("browser") public void setup(String browser) throws Exception{
	  
	  
	  
	  if(browser.equalsIgnoreCase("chrome")){
	  
		  WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(options); }
	  if(browser.equalsIgnoreCase("firefox")){
		  
		  WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
	  else if(browser.equalsIgnoreCase("Edge")){
	  
	  WebDriverManager.edgedriver().setup();
	  
	  driver = new EdgeDriver(); } else{
	  
	  throw new Exception("Browser is not correct"); }
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	 
	
	@Test
	public static void main(String[] args) throws InterruptedException{
		
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * 
		 * options.addArguments("--remote-allow-origins=*");
		 * 
		 * driver = new ChromeDriver(options);
		 */
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/V4/");
	
		WebElement userName = driver.findElement(By.name("uid"));
		
		userName.sendKeys("guru99");
		
		WebElement password = driver.findElement(By.name("password"));
	
		password.sendKeys("guru99");
	}
}