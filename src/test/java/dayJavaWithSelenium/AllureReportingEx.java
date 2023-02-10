package dayJavaWithSelenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

//If you wan tot run your test and integrate Allure report
//1-Add dependency in pom.xml
//2-Add Maven sure fire and aspectj in Build tag inside project in pom.xml
//3-If you want to get the test case in allure report 
//your have to add @Description next to @Test 
//4-Execute your test cases after successful run
//5- Then you will have to refresh the project folder
//6-You will find the Allure-results folder with some .json file
//7-Now execute "allure serve allure-results" you will get the report in the browser

public class AllureReportingEx {

	public static Logger log = LogManager.getLogger();

	@Description("This is first test to check the reporting.")
	@Test(description = " first test")
	@Severity(SeverityLevel.CRITICAL)
	@Story("The Login story test cases.......")
	public void sampleTest1() {
		log.info("User move to the Url");
		enterUserName();
		enterPass();
		clickLogin();
	}

	@Description("This is 2nd test to check the reporting.")
	@Test(description = "2nd test")
	public void sampleTest2() {
		log.info("sampleTest2()");
	}

	@Step("user enter user name")
	public void enterUserName() {
		log.info("user enter username");
	}

	@Step("user enter password")
	public void enterPass() {
		log.info("user enter Pass");
	}

	@Step("user click on Login button")
	public void clickLogin() {
		log.info("user clickLogin");
	}

}
