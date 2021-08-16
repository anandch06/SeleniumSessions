package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement accountLink=driver.findElement(By.xpath("//a[@title='My Account']"));
		if(accountLink.isDisplayed()){
			String text=accountLink.getText();
			System.out.println(text);
			accountLink.click();
			driver.close();
		}

	}

}
