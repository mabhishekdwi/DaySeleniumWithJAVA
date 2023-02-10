package dayJavaWithSelenium;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeEx extends BasePage{
	
//	@Test
//	public void TestIframe() {
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame(0);
//		
//		By txtbox=By.xpath("/html/body/section/div/div/div/input");
//		inputText(txtbox, "abhishek");
//		driver.close();
//		
//	}
	@Test
	public void TestIframeMultiple() {
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		click(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
//		String parentFrame=driver.switchTo().
		driver.switchTo().frame(1);
		By labelNested=By.xpath("//h5[text()='Nested iFrames']");
		
		Assert.assertTrue(isDisplayed(labelNested));
		
		for (int i=0;i<driver.findElements(By.tagName("iframe")).size();i++) {
			driver.switchTo().frame(i);
			By txtboxDemo=By.xpath("/html/body/section/div/div/div/input");
			if(isDisplayed(txtboxDemo)) {
				System.out.println("Inside frame present");
				inputText(txtboxDemo, "abhi123");
				
			}
			
		}
		driver.switchTo().parentFrame();
		Assert.assertTrue(isDisplayed(labelNested));
		
//		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
//		By txtbox=By.xpath("/html/body/section/div/div/div/input");
//		inputText(txtbox, "abhishek1");
//		driver.switchTo().defaultContent();
		
	}

}
