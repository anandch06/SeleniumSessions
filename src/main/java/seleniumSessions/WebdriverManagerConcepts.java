	package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerConcepts {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
