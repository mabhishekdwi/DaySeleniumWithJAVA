package dayJavaWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorEx {
//id/class/Name/partialtext/TAG/XPATH/CSS/linkText
	//name="identifier"
	//xpath== //Tag[@attibute="attibuteValue"]
			//div[@id="identifierNext"]//button
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("abhishek");
		Thread.sleep(2000);
//		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
//		driver.findElement(By.xpath("//div[@id=\"identifierNext\"]//button")).click();
//		driver.close();

	}

}
