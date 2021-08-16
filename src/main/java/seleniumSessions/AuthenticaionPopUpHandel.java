package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticaionPopUpHandel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:addmin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.tagName("p")).getText());

	}

}
