package pageobjects;

import org.openqa.selenium.By;

import dayJavaWithSelenium.BasePage;
//Locators
//methods

public class LoginPage extends BasePage{
	By username=By.xpath("");
	By password=By.xpath("");
	By loginbutton=By.xpath("");
	
	//method or functions
	public void Login(String user,String pass) {
		driver.get("xvvfsd");
		inputText(username, user);
		inputText(password, pass);
		click(loginbutton);
	}

}
