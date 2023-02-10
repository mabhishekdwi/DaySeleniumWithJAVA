package dayJavaWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingLinksEx {

	public static void main(String[] args) {
		String expected="";
		String actual="";
		
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.facebook.com/");
//	driver.navigate().forward();
//	driver.navigate().back();
//	driver.navigate().refresh();
	
	driver.manage().window().maximize();
//	List<WebElement>lst= driver.findElements(By.tagName("a"));
//	for (WebElement we : lst) {
//		we.click();
//		we.getText();
//	}
//	String name="abhishek";
	
	
//	boolean flag = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
//	if (flag) {
//		System.out.println(true);
//	} else {
//		System.out.println(false);
//	}
	
	WebElement text= driver.findElement(By.xpath("//img[@alt=\"Facebook\"]/..//following-sibling::h2"));
	boolean flag1= text.isDisplayed();
	if(flag1) {
		 expected="Facebook help you connect and share with the people in your life.";
		 actual=text.getText();
	}
	if(actual.equals(expected)) {
		System.out.println("Text is matched");
	}
	else {
		System.out.println("Text is not matched");
	}
}

}
