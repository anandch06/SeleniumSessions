package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		doLinkClick(langList, "తెలుగు");
		//		System.out.println(langList.size());
		//		for (WebElement lang : langList) {
		//			String text = lang.getText();
		//			System.out.println(text);
		//			
		//			if(text.equals("తెలుగు")){
		//				lang.click();
		//				break;


	}
	public static void doLinkClick(List<WebElement> linkList,String value){
		System.out.println(linkList.size());
		for (WebElement lang : linkList) {
			String text = lang.getText();
			System.out.println(text);

			if(text.equals(value)){
				lang.click();
				break;
			}
		}
	}

}
