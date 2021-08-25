package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuildingAction {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.myntra.com/shop/offers");	
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(driver.findElement(By.linkText("MEN"))).perform();
			actions.click(driver.findElement(By.linkText("Rain Jackets"))).perform();
			
	}

}