package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDownsInDropdown {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);

		By choice = By.xpath("//span[@class='comboTreeItemTitle']");
		//		selectChoiceValue(choice, "choice 2 2", "choice 4" , "choice 6");
		//		selectChoiceValue(choice, "choice 5");
		//		selectChoiceValue(choice, "choice 1", "choice 7" );
		selectChoiceValue(choice, "all");


		Thread.sleep(5000);
		driver.quit();


	}

	public static void selectChoiceValue(By locator, String... value){
		List<WebElement> choiceList = driver.findElements(locator);
		if(!value[0].equalsIgnoreCase("all")){
			for(int i = 0; i<choiceList.size(); i++ ){
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for(int j = 0; j<value.length; j++){

					if(text.equals(value[j])){
						choiceList.get(i).click();
						break;
					}
				}
			}
		}

		else{
			try{
				for(int all=0; all<choiceList.size();all++){
					choiceList.get(all).click();
					}
				}catch(Exception e){

				}

			}
		

	}
}
