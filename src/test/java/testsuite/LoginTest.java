package testsuite;

import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class LoginTest extends LoginPage {
	
	
	@Test(description = "Login with valid pass")
	public void Test1() {
		Login("abhishek","dwivedi");
	}
	
	@Test(description = "Login with Invalid pass")
	public void Test2() {
		Login("abhishek","fgdhdfgh");
	}

}
