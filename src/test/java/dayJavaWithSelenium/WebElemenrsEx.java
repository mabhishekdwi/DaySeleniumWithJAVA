package dayJavaWithSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemenrsEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lambdatest.github.io/sample-todo-app/");
		
//		List<WebElement>lst =driver.findElements(By.xpath("//ul[@class=\"list-unstyled\"]//li//input"));
		/*
		 * Iterator<WebElement>it=lst.iterator(); while(it.hasNext()) {
		 * it.next().click(); }
		 */
//		for(int i =0;i<lst.size();i++)
//		for (WebElement we : lst) {
//			we.click();
//			Thread.sleep(1000);
//		}
		//Verify that new data is added or not
		WebElement txtBox= driver.findElement(By.id("sampletodotext"));
		String value="abhishek"+"pxg1Uzz9Ju";
		txtBox.sendKeys(value);
		driver.findElement(By.id("addbutton")).click();
		List<WebElement>lst1=driver.findElements(By.xpath("//ul[@class=\"list-unstyled\"]//li//span"));
		for (WebElement we : lst1) {
			String checkBoxName=we.getText();
			if(checkBoxName.equals(value)) {
				System.out.println("Check box name matched......");
			}
			
		}
	}

}
