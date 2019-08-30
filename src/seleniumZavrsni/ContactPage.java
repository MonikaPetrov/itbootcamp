package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	static WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	 private static List<WebElement> maps() {
		return driver.findElements(By.cssSelector("div.col-md-9 img"));
		}
	 // Actions
		public List<WebElement> twoMaps() {
			return maps();
		}
		public void clickMap(Integer index) {
			twoMaps().get(index).click(); 
		}
}
