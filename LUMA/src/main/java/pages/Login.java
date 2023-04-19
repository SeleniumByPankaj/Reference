package pages;

import commons.BaseFunctions;
import commons.ConfigReader;
import pageObjects.login_PO;

public class Login extends BaseFunctions {
	
	BaseFunctions base = new BaseFunctions();
	ConfigReader cr = new ConfigReader();
	
	public void init()
	{
		base.getDriver();
		
		base.getURL(cr.readConfigProperty("URL"));
		
	}	
	
	public void login()
	{
		base.click(login_PO.signInBtn);
		
		base.setValue(login_PO.username, cr.readConfigProperty("username"));
		
		base.setValue(login_PO.password, cr.readConfigProperty("password"));
		
		base.click(login_PO.send);
	}	
	
}
