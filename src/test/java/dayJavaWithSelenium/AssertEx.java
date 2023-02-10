package dayJavaWithSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx extends BasePage{
	SoftAssert softAssert=new SoftAssert();
//If we have to verify something on the page, we use assert
	@Test
	public void gottoURL() {
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
	}
	
	@Test(description = "check Assertion",dependsOnMethods = {"gottoURL"})
	public void TestAssert() {
//		Assert.assertTrue(driver.getCurrentUrl().contains("Windows.html"));
		softAssert.assertTrue(driver.getCurrentUrl().contains("Windows.html"));
//		Assert.assertEquals(driver.getCurrentUrl(), "http://demo.automationtesting.in/Windows.html");
		softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.automationtesting.in/Windows.html");
//		softAssert.assertAll();
	}
	
}
