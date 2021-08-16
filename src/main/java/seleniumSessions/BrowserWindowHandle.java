package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		System.out.println("parent window id is : " + parentWindow);
		String childWindow = it.next();
		System.out.println("child window id is : " + childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("child window title is : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("parent window title is : " + driver.getTitle());
		driver.quit();

	}

}
