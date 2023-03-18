package pages;

import baseFunctions.Base;
import pageObjects.Login_PO;

public class Login extends Base {

	Base base = new Base();

	public void init() {
		base.getLocalDriver();
		base.getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void login(String userName, String password) {
		base.setValue(Login_PO.userName, userName);
		base.setValue(Login_PO.password, password);
		base.click(Login_PO.loginBtn);
		
	}
}
