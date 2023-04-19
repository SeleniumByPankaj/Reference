package pageObjects;

import org.openqa.selenium.By;

public class login_PO 
{
	
	public static By signInBtn = By.xpath("//li [@class = 'authorization-link']/a");
	
	public static By username = By.id("email");
	
	public static By password = (By.id("pass"));
	
	public static By send = (By.id("send2"));
	
}
