package pageObjects;

import org.openqa.selenium.By;

public class createAccount_PO 
{
	
	public static By createAnAccountBtn = By.linkText("Create an Account");
	
	public static By firstName = By.id("firstname");
	
	public static By lastName = By.id("lastname");
	
	public static By eMail = By.id("email_address");
	
	public static By passWord = (By.id("password"));
	
	public static By confirmPassword = (By.id("password-confirmation"));
	
	public static By createAccBtn = (By.cssSelector("button.action.submit.primary"));
	
	public static By succesMsg = (By.xpath("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"));
	
	public static By errorMsg = (By.xpath("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"));

}
