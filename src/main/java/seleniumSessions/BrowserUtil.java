package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
	
	/**
	 * this is browser util, having different browser related generic functions
	 * @author akkch
	 */
	public WebDriver driver;
	
	/***
	 * This method used to launch the browser on the basis of given browser
	 * @param browser
	 * return driver
	 */
	
	public WebDriver launchBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares & Jars\\Jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Softwares & Jars\\Jars\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else{
			System.out.println("pass the correct browser name.....");
		}
		return driver;
	}
	/**
	 * this is used to launch url
	 * @param url
	 */
	public void launchUrl(String url){
		driver.get(url);
	}
	/**
	 * this is used to get pagetitle
	 * @param title
	 * @return String
	 */
	public String getPageTitle(){
		 return driver.getTitle();
		}
	/**
	 * this page get current pageUrl
	 * @return String
	 */
	public String getPageUrl(){
		return driver.getCurrentUrl();
	}
	/*
	 * used to close the browser
	 */
	public void closeBrowser(){
		driver.close();
	}
	/*
	 * used to close the browser
	 */
	public void quitBrowser(){
		driver.quit();
	}

}
