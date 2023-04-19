package pages;

import commons.BaseFunctions;
import commons.ConfigReader;
import pageObjects.createAccount_PO;

public class CreateAccount extends BaseFunctions {
	
	BaseFunctions base = new BaseFunctions();
	ConfigReader cr = new ConfigReader();
	
	public void init()
	{
		base.getDriver();
		
		cr.readConfigProperty("URL");
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}	
	
	public void signUp (String firstName, String lastName, String password, String confirmPassword, String email)
	{
		base.setValue(createAccount_PO.firstName,firstName);
		
		base.setValue(createAccount_PO.lastName, lastName);
		
		base.setValue(createAccount_PO.eMail, email);
		
		base.setValue(createAccount_PO.passWord, password);
		
		base.setValue(createAccount_PO.confirmPassword, confirmPassword);
		
		base.click(createAccount_PO.createAccBtn);
				
		if (base.checkPageTitle("My Account"))
		{
			System.out.println("SignUp successful with a message "+base.getText(createAccount_PO.succesMsg));
		}
		else if (base.checkPageTitle("Create New Customer Account"))
		{
			System.out.println("SignUp failed with a message "+base.getText(createAccount_PO.errorMsg));
		}
	}

}
