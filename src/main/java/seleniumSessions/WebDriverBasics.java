package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open browser
		//enter url
		//verify title of the page---actual vs expected
		//close the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares & Jars\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Googlee")){
			System.out.println("Title is correct");
		}
		else
			System.out.println("title is not correct");
		driver.close();
			}
	

}
