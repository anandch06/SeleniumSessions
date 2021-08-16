package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcepts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement logIn = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement clubMenbers = driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[18]/ul/li[2]/a"));
		WebElement MemberLogin = driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[18]/ul/li[2]/ul/li[1]/a"));

		Actions act = new Actions(driver);
		act.moveToElement(logIn).
		moveToElement(clubMenbers)
		.moveToElement(MemberLogin).click().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		}
	}


