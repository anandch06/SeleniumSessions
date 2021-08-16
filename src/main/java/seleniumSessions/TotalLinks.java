package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
//driver.get("https://www.freshworks.com/");
List<WebElement> linkLists=driver.findElements(By.tagName("a"));
	System.out.println("total links are : " + linkLists.size());
	
	for(int i =0; i<linkLists.size();i++){
		String text = linkLists.get(i).getText();
		
			if(!text.isEmpty()){	
				System.out.println(i + "--->" + text);
				String hrefLinks = linkLists.get(i).getAttribute("href");
				System.out.println(hrefLinks);
			}
	}


	}

}
