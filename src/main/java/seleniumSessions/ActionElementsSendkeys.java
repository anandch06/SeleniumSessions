package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionElementsSendkeys {
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");
		
		
		doActionSendKeys(username, "akkch.06@gmail.com");
		doActionSendKeys(password, "Anand111$");
		doActionClick(login);

	}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
		}
	public static void doActionSendKeys(By locator, String value){
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
	}
	public static void doActionClick(By locator){
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
}
