package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		By username = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@class='btn btn-primary']");

		//		driver.findElement(username).sendKeys("akkch.06@gmail.com");
		//		driver.findElement(password).sendKeys("anand111");
		//		driver.findElement(login).click();

		//		getElement(username).sendKeys("akkch.06@gmail.com");
		//		getElement(password).sendKeys("anand111");
		//		getElement(login).click();
		doSendkeys(username, "akkch.06@gmail.com");
		doSendkeys(password, "anand111");
		doClick(login);
		
		
	}
	/*
	 * this is used to create the webelement on the basis of given By locator
	 * @param locator
	 * return WebElement
	 */
	public static WebElement getElement(By locator){
		WebElement element =driver.findElement(locator);
		return element;
	}

	public static void doSendkeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator){
		getElement(locator).click();

	}
	
	public static String doGetText(By locator){
		return getElement(locator).getText();
	}
	
	public static boolean doIsDisplayed(By locator){
		return getElement(locator).isDisplayed();
	}

}
