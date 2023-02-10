package dayJavaWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeEx extends BasePage{
	
	
	
	

	public static void main(String[] args) {
		String url="https://www.way2automation.com/way2auto_jquery/registration.php#load_box";
		String filePath="C:\\Users\\abhishek.dwivedi\\Desktop\\PortFolioTest 90-94.png";
//		Locators
		
		By txtFirstName=By.xpath("(//input[@name=\"name\"])[1]");
		By txtLastName=By.xpath("(//input[@type=\"text\"])[2]");
		By rdoMaritalStatus=By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[2]/input");
		
		By chkHobbyDance= By.className("relative");
		By chkHobbyReading= By.xpath("(//input[@type=\"checkbox\"])[2]");
		By chkHobbyCricket= By.xpath("//label[contains(text(),'Cricket')]");
		
		By ddlCOuntry=By.tagName("select");
		By ddlMonth=By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select");
		By ddlDay=By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select");
		By ddlYear=By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select");
		By txtPhone=By.xpath("(//input[@name=\"phone\"])[1]");
		By txtUserName=By.xpath("(//input[@name=\"username\"])[1]");
		By txtEmail=By.xpath("(//input[@name=\"email\"])[1]");
		By txtFilePath= By.xpath("//input[@type=\"file\"]");
		By txtPassword=By.name("password");
		By txtConfirmPassword=By.name("c_password");
		
//Code
		driver.manage().window().maximize();
		driver.get(url);
		inputText(txtFirstName,"Purnima");
		inputText(txtLastName,"Gupta");
		click(rdoMaritalStatus);
		click(chkHobbyDance);
		click(chkHobbyReading);
		click(chkHobbyCricket);
		selectFromDropDown(ddlCOuntry,"India");
		selectFromDropDown(ddlMonth,"1");
		selectFromDropDown(ddlDay,"1");
		selectFromDropDown(ddlYear, "2014");
		inputText(txtPhone, "8076864856");
		inputText(txtUserName, "Purnimagupta");
		inputText(txtEmail, "purnimagupta9555@gmail.com");
		WebElement upload_file= driver.findElement(txtFilePath);
		upload_file.sendKeys(filePath);
		inputText(txtPassword, "");
		inputText(txtConfirmPassword, "");
		
		
		

	}

}
