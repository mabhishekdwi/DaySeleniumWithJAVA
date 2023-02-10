package dayJavaWithSelenium;

import org.openqa.selenium.By;

public class SubmitButtonCLickEx extends BasePage{

	public static void main(String[] args) {
		By txtStartWith=By.xpath("//input[@id=\"submit\"]/preceding-sibling::input");
		By btnSubmit=By.id("submit");
		driver.get("url");
		inputText(txtStartWith, "");
		click(btnSubmit);

	}

}
