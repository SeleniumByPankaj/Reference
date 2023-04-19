package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCustomer {
	
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException
		{
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://demo.guru99.com/telecom/index.html");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
			
			driver.get("https://demo.guru99.com/telecom/addcustomer.php");
			driver.findElement(By.id("done")).isSelected();

			driver.findElement(By.id("fname")).sendKeys("siddhi");
			driver.findElement(By.id("lname")).sendKeys("Shinde");
			driver.findElement(By.id("email")).sendKeys("siddhishinde@gmail.com");
			driver.findElement(By.name("addr")).sendKeys("Pune Maharashtra");
			driver.findElement(By.id("telephoneno")).sendKeys("8862090042");
			driver.findElement(By.name("submit")).click();

			String customerid= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();
			//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getAttribute(null)
			//driver.navigate().back();
			System.out.println(customerid);
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();
			driver.get("https://demo.guru99.com/telecom/index.html");
			driver.findElement(By.cssSelector("#one > div > div.flex-item.left > div:nth-child(2) > h3 > a")).click();
			driver.findElement(By.name("customer_id")).sendKeys(customerid);
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(500);
			
			//for scrolling vertically 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");//pixels for x and y axis
			
			//driver.findElement(By.name("tariff_plan")).click();
			
			//driver.findElement(By.xpath("//td//input [@type = 'radio']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			WebElement radioBtn = driver.findElement(By.cssSelector("#sele"));
					
				//	driver.findElement(By.xpath("//label [@for = 'sele']"));
			
			Actions build = new Actions(driver);
			
			build.moveToElement(radioBtn, 5, 5).click().build().perform();
			
		//	build.MoveToElement(FindElement(By.Id("ext-gen33"))).MoveByOffset(124, 0).Click().Build().Perform();
			
		//	radioBtn.click();
			
		}

}
