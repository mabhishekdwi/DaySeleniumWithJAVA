package dayJavaWithSelenium;

import org.apache.commons.logging.Log;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider extends BasePage {

	By txtusername=By.id("");
	By txtpas=By.id("");
	@Test(dataProvider = "Login", dataProviderClass = BasePage.class)
//	@Parameters({"username","password"})
	
	public void withDATAProvider( String username, String password) {
//		inputText(txtusername, "abhsihek");
//		inputText(txtpas, "dwivedi");
//		inputText(txtusername, "abhsihek1");
//		inputText(txtpas, "dwivedi1");
//		inputText(txtusername, "abhsihek2");
//		inputText(txtpas, "dwivedi2");
//		inputText(txtusername, "abhsihek3");
//		inputText(txtpas, "dwivedi3");
//		System.out.println("this is testng .xml execution" );
//		System.out.println(username);
//		System.out.println(password);
//		Logger.getLogger(username);
//		Logger.getLogger(password);
	}
	
	
	public void readExcelFile() {
		
	}

	
	
	
	

	
}
