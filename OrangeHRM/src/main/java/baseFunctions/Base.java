package baseFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public void getLocalDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void setValue(By locator, String input) {
		driver.findElement(locator).sendKeys(input);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public String getTitleOfPage() {
		return driver.getTitle();
	}

	public void closeDriver() {
		driver.close();
	}

	public void pressKeyDown (By Locator, Keys key) {
		driver.findElement(Locator).sendKeys(key);
	}
	
	public void wait (int wait)
	{
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectValueFromAutosuggestionDropdown (By dropdownLoc, By suggestionLoc, String value)
	{
		driver.findElement(dropdownLoc).sendKeys(value);
		wait(Constants.high);
		List<WebElement> suggestions = driver.findElements(suggestionLoc);
		
		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().contains(value))
			{
				suggestion.click();
			}
		}
	}
	
	
	
	// method to navigate to respective module from dashboard

	public void navigateToModule(String ModuleName) {

		String moduleToBeNavigated = Base_PO.navigateToModule.toString();

		String modulename = String.format(moduleToBeNavigated, ModuleName);
		String[] split = modulename.split("//");
		String one = "//"+split[1];
		WebElement module = driver.findElement(By.xpath(one));
		module.click();
	}
}
