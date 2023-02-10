package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumGridEx {
	WebDriver driver;
	@BeforeMethod
	public void start() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		
//		chromeOptions.setCapability("platformName", "Windows");
		chromeOptions.setCapability("se:name", "My simple test");
		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");

		String remoteGridURL = "http://localhost:4444/wd/hub";

		driver = new RemoteWebDriver(new URL(remoteGridURL), chromeOptions);
		driver.manage().window().maximize();

	}

	@Test
	public void gridTest() {
		driver.get("https://demo.automationtesting.in/Index.html");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
