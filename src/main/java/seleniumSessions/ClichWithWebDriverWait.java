package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClichWithWebDriverWait {
static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By myAccount = By.xpath("//i[@class='fa fa-user']");
		By accountRegister = By.linkText("Register");
		
//		waitForElementToBeClickable(myAccount, 8).click();
//		waitForElementToBeClickable(accountRegister, 5).click();
		clickWhenReady(myAccount, 8);
		clickWhenReady(accountRegister, 4);
		
		
	}
public static WebElement waitForElementToBeClickable(By locator,int timeout){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
public static void clickWhenReady(By locator,int timeout){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	element.click();
	}
}
