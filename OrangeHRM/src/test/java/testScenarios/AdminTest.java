package testScenarios;

import org.testng.annotations.Test;

import pages.Admin;

public class AdminTest {

	Admin admin = new Admin();
	
	@Test 
	public void addUser()
	{
		admin.addUser();
		
	}
	
}
