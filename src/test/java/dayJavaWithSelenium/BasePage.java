package dayJavaWithSelenium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver = new ChromeDriver();
	public static Logger log = LogManager.getLogger();
	 
//	static WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:5566/wd/hub"),cap); 
	
	
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	static Actions act=new Actions(driver);
	
	/*
	 * public static void getDriver() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver(); }
	 */
	public static void inputText(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void selectFromDropDown(By locator, String value) {
		WebElement we = driver.findElement(locator);
		System.out.println(we.getText());
		Select s = new Select(we);
		s.selectByValue(value);
	}

	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time,null);
	}

	public static void waitTillElementpresent(By locator, int time) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void waitTillAlertPresent(int time) {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void usingFluentWait(int max, int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(max))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class);
	}
	public static String getTextElement(By locator) {
		return driver.findElement(locator).getText();
	}
	public static void mouseHover(By locator) {
		act.moveToElement(driver.findElement(locator)).build().perform();
	
	}
	public static void dragAndDrop(By locator) {
		act.moveToElement(driver.findElement(locator)).build().perform();
	
	}
	public static boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	public static boolean isDisplayed(String urlpart) {
		return driver.getCurrentUrl().contains(urlpart);
	}
	public static void print(String text) {
		System.out.println(text);
	}
	public static void switchToWindow() {
		
		Set<String>st=driver.getWindowHandles();
		for (String str : st) {
			driver.switchTo().window(str);
		}
	}
	public void captureScreenShot() throws IOException {
		String fileName = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
		String screenName="screenshot"+fileName;
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\abhishek.dwivedi\\eclipse-workspace\\dayJavaWithSelenium\\Screenshot\\"+screenName);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void clickJS(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", locator);
	}
	@org.testng.annotations.DataProvider(name = "Login")
	public Object[][] myDP() {
		return new Object[][] { 
			{"abhihek",	"dwivedi"},
			{"tom"	,"latham"},
			{"virat",	"kohli"},
			{"abhihek",	"dwivedi"},
			{"tom",	"latham"},
			{"virat",	"kohli"},
			{"abhihek",	"dwivedi"},
			{"tom"	,"latham"},
			{"virat","	kohli"}

			
			};

	}
	
}
