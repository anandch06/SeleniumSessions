package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestSearch {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		Thread.sleep(3000);
		
			List<WebElement> elementlist = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[@class='wM6W7d']/span"));
System.out.println(elementlist.size());

for (WebElement ele : elementlist) {
	String text = ele.getText();
	System.out.println(text);
	
	if(text.equals("testing types")){
		ele.click();
		break;
	}
	
}
	}

}
