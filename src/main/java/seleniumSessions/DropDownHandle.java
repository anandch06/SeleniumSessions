package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		
		By country = By.id("Form_submitForm_Country");
		
selectDropDownValueByVisisbleText(country, "India");
selectDropDownValueByIndex(country, 19);
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void selectDropDownValueByVisisbleText(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDownValueByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void selectDropDownValueByIndex(By locator, int value){
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);
	}

}
