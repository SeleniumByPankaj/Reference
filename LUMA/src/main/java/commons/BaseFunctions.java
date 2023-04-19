package commons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFunctions {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void getURL (String url)
	{
		driver.get(url);
	}
	
	public void setValue (By locator, String input)
	{
		driver.findElement(locator).sendKeys(input);
	}
	
	public void click (By locator)
	{
		driver.findElement(locator).click();	
	}
	
	public String getText (By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public WebElement getwebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getList (By locator)
	{
		List<WebElement> items = driver.findElements(locator);
		return items;
	}
	
	public enum WaitType {
		visibilityOfElementLocated, ElementToBeClickable, ElementToBeSelected, InvisibilityOfElementLocated,
		presenceOfElementLocated, FrameToBeAvailableAndSwitchToIt, StalenessOf, AlertIsPresent
	}
	
	public boolean waitForElement (By locator, int WaitTime, WaitType waitType)
	{
		wait = new WebDriverWait(driver, WaitTime);
		switch (waitType) {
		case visibilityOfElementLocated:
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		case ElementToBeClickable:
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		case ElementToBeSelected:
			wait.until(ExpectedConditions.elementToBeSelected(locator));
			return true;
		case presenceOfElementLocated:
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		case InvisibilityOfElementLocated:
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return true;
		case FrameToBeAvailableAndSwitchToIt:
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
			return true;
		case AlertIsPresent:
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		case StalenessOf:
			wait.until(ExpectedConditions.stalenessOf(getwebElement(locator)));
			return true;
		default:
			System.out.println("Invalid wait type selected");
		}
		return false;
	}
	
	public String getPageTitle () 
	{
		return driver.getTitle();
	}
	
	public boolean checkPageTitle (String expTitle)
	{
		String actualPageTitle = getPageTitle();
		
		if (expTitle.equalsIgnoreCase(actualPageTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	public void findElement(By Locator) 
//	{ 
//		driver.findElement(By.xpath(String.format(Locator, text))); 
//	}
}
