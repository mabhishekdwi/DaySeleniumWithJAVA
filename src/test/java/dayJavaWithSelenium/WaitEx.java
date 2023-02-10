package dayJavaWithSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx extends BasePage{
//Implicit wait--this is applicable for each line of statement/give No Such Element Exception if 
				//	time is taken by line is more than given-10
//Explicit wait--//particular locator or condition
	public static void main(String[] args) throws InterruptedException {
		implicitWait(10);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.manage().window().maximize();
		By txtStartWith=By.xpath("//input[@id=\"submit\"]/preceding-sibling::input");
		By btnSubmit=By.id("submit");
		driver.get("url");
		//explicit wait for a particular locator which is taking more time.
		//Timeout exception
		waitTillElementpresent(btnSubmit,20);
		
		inputText(txtStartWith, "");
		//fluent wait 5/10/15----30
		usingFluentWait(30, 5);
		click(btnSubmit);
		usingFluentWait(90, 20);
	}

}
