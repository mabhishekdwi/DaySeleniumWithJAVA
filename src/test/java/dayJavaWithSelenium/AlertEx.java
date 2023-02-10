package dayJavaWithSelenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertEx extends BasePage{
	By btnAlert=By.xpath("//button[@class='btn btn-danger']");
	By TABOKandCancel=By.xpath("//a[normalize-space()='Alert with OK & Cancel']");
	By btnDisplayCOnfirm=By.xpath("//button[@class='btn btn-primary']");
	//*[@id="CancelTab"]/button
	
	@BeforeMethod
	public void start() {
		System.out.println("BeforeMethod");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("@AfterMethod");
		driver.close();
	}
	
	@Test
	public void testAlert1() throws InterruptedException {
		System.out.println("testAlert1");
		click(btnAlert);
		Alert at=driver.switchTo().alert();
		Thread.sleep(2000);
		at.accept();
		
		
	}
	@Test
	public void testAlert2() {
		System.out.println("testAlert2");
		click(TABOKandCancel);
		click(btnDisplayCOnfirm);
		Alert at=driver.switchTo().alert();
		at.accept();
		By lblOk=By.xpath("//*[@id=\"demo\"]");
		String st=getTextElement(lblOk);
		Assert.assertTrue(st.equals("You pressed Ok"));
		at.dismiss();
	}
	
}
