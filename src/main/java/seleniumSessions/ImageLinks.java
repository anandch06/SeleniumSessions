package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> imgLinks = driver.findElements(By.tagName("img"));
		System.out.println("Total image links are : " + imgLinks.size());
		
//		for(int i=0; i<imgLinks.size(); i++){
//			System.out.println(imgLinks.get(i).getAttribute("src"));
//		}
		for (WebElement imgItems : imgLinks) {
			System.out.println(imgItems.getAttribute("src"));
			System.out.println(imgItems.getSize());
		}
		

	}

}
