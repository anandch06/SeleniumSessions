package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElements {
static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		By footerLinks = By.xpath("//ul[@class='footer-nav']/li/a");
		
//		List<WebElement> footerLink = visibilityOfAllElements(footerLinks, 10);
//		for (WebElement ele : footerLink) {
//			System.out.println(ele.getText());
//		}
		getPageLinksText(footerLinks, 10);

	}
	
	public static List<WebElement> visibilityOfAllElements(By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static void getPageLinksText(By locator,int timeout){
		List<WebElement> footerLink = visibilityOfAllElements(locator,timeout);
		for (WebElement ele : footerLink) {
			System.out.println(ele.getText());
		}
	}

}
