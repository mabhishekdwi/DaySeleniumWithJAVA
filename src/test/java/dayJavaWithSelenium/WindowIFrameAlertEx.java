package dayJavaWithSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WindowIFrameAlertEx extends BasePage{
//TestNG- @Test/BeforeTest/@AfterTest
	By btnClick=By.xpath("//a//button[@class='btn btn-info'][normalize-space()='click']");
	By btnSeparateWindow=By.xpath("//a[normalize-space()='Open New Seperate Windows']");
	
	@Test
	public void myFirstTestNgWindowSwitch() {

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		String parentWindow=driver.getWindowHandle();
		
		click(btnClick);
		switchToWindow();
		
		boolean flag=driver.getCurrentUrl().contains("www.selenium.dev");
		System.out.println("switched...................."+flag);
		
		driver.switchTo().window(parentWindow);
		
		click(btnSeparateWindow);
	}

	

	/*
	 * public static void main(String[] args) { WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://www.facebook.com/"); }
	 */

}
