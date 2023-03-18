package pageObjects;

import org.openqa.selenium.By;

public class Login_PO {

	public static By userName = By.name("username");
	
	public static By password = By.name("password");
	
	public static By loginBtn = By.xpath("//button [@type = 'submit']");
}
