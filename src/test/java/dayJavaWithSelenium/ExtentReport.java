package dayJavaWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport extends BasePage{
	
	  String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
	  ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
	  ExtentReports extent = new ExtentReports();
	  ExtentTest test1;
	  @Test
	public  void ExtentReportTest1() throws InterruptedException {
	  
	
	  extent.attachReporter(htmlReporter);
	  test1 = extent.createTest("ebay Search Test", "test to validate search box ");
	  
	  
	  test1.log(Status.INFO, "Starting test case");
	  
	  test1.pass("Abhishek-maximize has done");
	  
	  driver.get("https://www.ebay.com");
	  Thread.sleep(1000);
	  test1.pass("Abhishek-Navigate to Ebay.com");
	  
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitleebay);
	  test1.pass("Abhishek-title is correct");
	  
	  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
	  test1.pass("Abhishek-Entered thex in the text box");
	  
	  driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN); 
	  test1.pass("Abhishek-Press keybopard enter key");
	  
	  driver.close();
	  
	  test1.pass("Abhishek-closed the browser");
	  test1.info("Abhishek-test completed");
	   
	  //write results into the file
	  extent.flush();
	 }

}
