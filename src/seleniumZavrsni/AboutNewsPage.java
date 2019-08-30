package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutNewsPage {
	
	static WebDriver driver;
	
	public AboutNewsPage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements
	private static List<WebElement> viewPost() {
		return driver.findElements(By.cssSelector("div.box.well.well-sm a"));
	}
	
	// Actions
	public List<WebElement> getViewPost() {
		return viewPost();
	}
	public void viewPostElements(Integer index) {
		getViewPost().get(index).click();
	}
}
