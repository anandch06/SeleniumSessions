package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitElements {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");
		By myAccount = By.xpath("//i[@class='fa fa-user']");
		By accountRegister = By.linkText("Register");
		
		waitForElementPresent(username,5).sendKeys("akkch.06@gmail.com");
		driver.findElement(password).sendKeys("anand111$");
		driver.findElement(login).click();
		waitForElementPresent(myAccount, 10).click();
		driver.findElement(accountRegister).click();
		System.out.println("landed on register page");
		String title = waitForTitlePresent("Register Account",5);
		System.out.println(title);
		if(waitForUrl("account/register", 10)){
			System.out.println("register page is correct");
		}
		
		}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	public static WebElement waitForElementPresent(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForElementToBeVisible(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	public static String waitForTitlePresent(String titleValue, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
		}
	public static Boolean waitForUrl(String url, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 return wait.until(ExpectedConditions.urlContains(url));
		}
	

}
