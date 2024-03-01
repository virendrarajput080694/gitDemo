package Base;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class baseClass {
	
	WebDriver driver;
	

	public void executeDriver()
	{
	
//	String downloadFilepath = "D:\\Fastmore\\EDIShipment_LoadTender\\";
//	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//	chromePrefs.put("profile.default_content_settings.popups", 0);
//	chromePrefs.put("download.default_directory", downloadFilepath);
//	ChromeOptions options = new ChromeOptions();
//	options.setExperimentalOption("prefs", chromePrefs);
//	DesiredCapabilities cap = DesiredCapabilities.chrome();
//	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	cap.setCapability(ChromeOptions.CAPABILITY, options);
//	driver = new ChromeDriver(cap);
	
	Map<String, Object> prefs = new HashMap<String, Object>();
	System.out.println("Test: "+prefs.put("download.default_directory",  System.getProperty("user.dir")+"\\Downloads\\"));
	prefs.put("download.default_directory",  System.getProperty("user.dir")+"\\Downloads\\");
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	driver = new ChromeDriver(options);
	
	System.out.println("testing");
	
	}

}
