import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class parallelExecutionDemo extends CrossBrowserUtility {
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("http://demo.guru99.com/V4/");
	
		WebElement userName = driver.findElement(By.name("uid"));
		
		userName.sendKeys("guru99");
		
		WebElement password = driver.findElement(By.name("password"));
	
		password.sendKeys("guru99");
	}

}
