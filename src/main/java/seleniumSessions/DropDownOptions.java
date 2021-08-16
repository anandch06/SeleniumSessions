package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();

		By country = By.id("Form_submitForm_Country");
//		WebElement countryOptions = driver.findElement(country);
//		Select select = new Select(countryOptions);
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size());
//		for (WebElement ele : countryList) {
//			System.out.println(ele.getText());
//		}
		int countryList = getDropDownOptionsCount(country);
		System.out.println(countryList);
		List<String> countryValues = getDropDownOptionsValues(country);
		System.out.println(countryValues);
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator){
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		return options.size();
	}
	
	public static List<String> getDropDownOptionsValues(By locator){
		List<String> textList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		for (WebElement ele : options) {
			String text = ele.getText();
			textList.add(text);
		}
		return textList;
	}
}
