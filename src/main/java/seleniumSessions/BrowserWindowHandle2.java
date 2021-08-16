package seleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(handles);
		String parentWindowId = windowList.get(0);
		System.out.println("parent window id is : " + parentWindowId);
		String childWindowId = windowList.get(1);
		System.out.println("child window id is : " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is : " + driver.getTitle());
		driver.quit();
		

	}

}
