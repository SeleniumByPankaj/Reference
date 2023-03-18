package testScenarios;

import org.testng.annotations.Test;

import baseSuite.BaseSuite;
import pages.Login;

public class LoginTest {

	Login login = new Login();
	
	@Test (dataProvider = "getValue" , dataProviderClass = BaseSuite.class)
	public void Login (String userName, String password)
	{
		login.init();
		login.login(userName, password);
	}
	
}
