package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TutorialLoginPage {

	public static void main(String[] args) throws InterruptedException {
		String browser = "chrome";
		By username = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@class='btn btn-primary']");
		
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser(browser);
		br.launchUrl("http://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(4000);
		String title = br.getPageTitle();
		System.out.println(title);
		
		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.doSendkeys(username, "akch.06@gmail.com");
		elementUtil.doSendkeys(password, "anand111$");
		elementUtil.doClick(login);
		
	

	}

}
