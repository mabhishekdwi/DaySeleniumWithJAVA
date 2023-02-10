package dayJavaWithSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseActionEx extends BasePage{
//Actions -for mouse intraction
	
	public static void main(String[] args) {
//		https://www.way2automation.com/way2auto_jquery/automation-practice-site.html
//		String url="https://www.way2automation.com/way2auto_jquery/registration.php#load_box";
//		driver.get(url);
//		driver.manage().window().maximize();
//		Actions act=new Actions(driver);
//		By eleWidget=By.xpath("//*[@id=\"toggleNav\"]/li[3]/a");
//		mouseHover(eleWidget);
//		
//		By eledatepicker=By.xpath("//*[@id=\"toggleNav\"]/li[3]/ul/li[3]/a");
//		click(eledatepicker);
//		
//		By lblDatepicker=By.xpath("//*[@id=\"wrapper\"]/div[1]/h1");
//		usingFluentWait(30, 5);
//		String text=getTextElement(lblDatepicker);
//		if(text.equals("Datepicker")) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		By ele5000Source=By.xpath("//*[@id=\"fourth\"]/a");
		By eleDestination=By.xpath("//*[@id=\"amt7\"]");
		act.dragAndDrop(driver.findElement(ele5000Source), 
				driver.findElement(eleDestination)).build().perform();
		
		//right click=>context click
//		act.contextClick().build().perform();
//		act.contextClick(driver.findElement(ele5000Source)).build().perform();
//		act.doubleClick(driver.findElement(ele5000Source)).build().perform();
//		act.scroll
//		send Keyboard
		
		
		
		
	}

}
