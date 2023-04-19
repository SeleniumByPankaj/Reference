package testScenarios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSuite.BaseSuite;
import pages.CreateAccount;

public class SignUpTest extends BaseSuite {

	CreateAccount ca = new CreateAccount();

	@BeforeTest
	public void init() {

		ca.init();

	}

	@Test(dataProvider = "getValue", dataProviderClass = BaseSuite.class)
	public void signUp(String firstName, String lastName, String email, String password, String confirmPassword) {

		ca.signUp(firstName, lastName, password, confirmPassword, email);

	}
	
	
}
