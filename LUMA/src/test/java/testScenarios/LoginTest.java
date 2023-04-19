package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTest {

	Login l = new Login();

	@BeforeTest
	public void init() {

		l.init();

	}
	@Test
	public void userLogin() {

		l.login();

	}

}
