package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("age")).sendKeys("29");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("age"))).build().perform();
		WebElement tooltip = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));
System.out.println(tooltip.getText());
	}

}
