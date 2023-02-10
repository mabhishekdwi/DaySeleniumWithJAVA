package dayJavaWithSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {
//Maven Project
	// Selenium-Web automation
	// Selenium webdriver->interface-(click,clear,sendkeys)implements
	// Browser classes-ChromeBrowser/Firefox/Edge/Opera
	// Selenium with TestNG or Junit

	public static void main(String[] args) throws InterruptedException {
//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		//switch pop up /window
		//return type of window handles is Set of string
		Set<String>st=driver.getWindowHandles();
		Iterator<String>it=st.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Testing");
//		Thread.sleep(3000);
//		driver.close();
		
	}

}
