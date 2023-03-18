package pageObjects;

import org.openqa.selenium.By;

public class Admin_PO {

	public static By addBtn = By.xpath("//button [@class = 'oxd-button oxd-button--medium oxd-button--secondary']");
	
	public static By userRole = By.xpath("(//div [@class = 'oxd-select-text-input'])[1]");
	
	public static By userRoleDrpDwn = By.xpath("//div [@class = 'oxd-select-option']/span [text() = 'Admin']");
	
	public static By employeeName = By.xpath("//input [@placeholder = 'Type for hints...']");
	
	public static By empDrowDown = By.xpath("//div [@role = 'option']");
	
	public static By empStatus = By.xpath("(//div [@class = 'oxd-select-text-input'])[2]");
	
	public static By empStatusDrpDwn = By.xpath("//div [@class = 'oxd-select-option']/span [text() = 'Enabled']");
	
	public static By userName = By.xpath("(//input [@class = 'oxd-input oxd-input--active'])[2]");
	
	public static By password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	
	public static By confirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	
	public static By saveBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	
	
	
	
	
	
}

