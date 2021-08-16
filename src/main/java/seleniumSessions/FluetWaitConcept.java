package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluetWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		By username = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@class='btn btn-primary']");
		
		waitForElementWithFluetWait(username, 10, 2).sendKeys("akkch.06@gmail.com");
		driver.findElement(password).sendKeys("Anand111$");
		driver.findElement(login).click();

	}
public static WebElement waitForElementWithFluetWait(By locator, int timeout, int interval){
	Wait<WebDriver> wait = new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(timeout))
			.pollingEvery(Duration.ofSeconds(interval))
			.ignoring(NoSuchElementException.class);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
	}
} 
