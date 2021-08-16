package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsingTesting {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "edge";
//		if(browser.equalsIgnoreCase("chrome")){
//			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares & Jars\\Jars\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge")){
//			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Softwares & Jars\\Jars\\edgedriver_win64\\msedgedriver.exe");
//			driver = new EdgeDriver();
//		}
//		else{
//			System.out.println("pass the correct browser name.....");
//		}
		
		switch (browser) {
		case "edge":
			WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
			break;
			
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("pass the correct browser name.....");
			break;
		}
		
		
		
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
