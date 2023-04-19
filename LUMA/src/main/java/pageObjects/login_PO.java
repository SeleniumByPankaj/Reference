package pageObjects;

import org.openqa.selenium.By;

public class login_PO 
{
	
	public static By signInBtn = By.linkText(" Sign In ");
	
	public static By username = By.id("email");
	
	public static By password = (By.id("pass"));
	
	public static By send = (By.id("send"));
	
}
