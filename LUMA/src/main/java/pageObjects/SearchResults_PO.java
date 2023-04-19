package pageObjects;

import org.openqa.selenium.By;

public class SearchResults_PO 
{
	
	public static By itemName = By.xpath("//a [contains(text(),'%$')]");
	
	public static By itemList = By.xpath("//ul [@role = 'listbox']/li");
	

	
}
