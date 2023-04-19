package testScenarios;

import org.testng.annotations.Test;

import pages.Login;

public class LoginTest {

	Login l = new Login();

	@Test
	public void userLogin() {

		l.login();

	}

}
