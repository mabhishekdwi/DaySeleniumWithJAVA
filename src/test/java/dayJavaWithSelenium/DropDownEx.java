package dayJavaWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownEx {
//Ab-sol-ute--->Root
//Relative	--->Any node
	

	public static void main(String[] args) throws InterruptedException {
//		https://www.globalsqa.com/demo-site/select-dropdown-menu/
		//div[@class="information closable"]//following-sibling::p/select
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement ddlCountry= driver.findElement(By.tagName("select"));
		
		//
		Select s=new Select(ddlCountry);
		
		
		s.selectByIndex(10);
		
		Thread.sleep(2000);
		
		s.selectByValue("IND");

		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Australia");
		
		Thread.sleep(2000);
		
		
	}

}
