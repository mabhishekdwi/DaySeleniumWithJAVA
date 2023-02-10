package dayJavaWithSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		
//		act.sendKeys(Keys.CONTROL).sendKeys("dd");
		act.sendKeys(Keys.SHIFT);
		act.sendKeys("N");
		act.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
      
//		driver.switchTo()
		driver.get("https://www.facebook.com/");

	}

}
