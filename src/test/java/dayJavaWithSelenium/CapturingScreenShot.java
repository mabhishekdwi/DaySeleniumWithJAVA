package dayJavaWithSelenium;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CapturingScreenShot extends BasePage {
	
	@BeforeMethod
	public void start() {
		System.out.println("BeforeMethod");
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
	}
	
	@Test()
	public void getSCreenShotEX() throws IOException {
		captureScreenShot();
		Assert.assertTrue(isDisplayed("Index.html"));
		
	}
	
	@AfterMethod
	public void tearDown() {
	
		driver.close();
	}

}
