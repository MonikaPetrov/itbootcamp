package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {
	static WebDriver driver;
	
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements
	private static List<WebElement> news() {
		return driver.findElements(By.cssSelector("div.forumRow a"));
	}
	private static WebElement more() {
		return driver.findElement(By.
				linkText("[more]"));
	}

	
	// Actions
	
	public List<WebElement> getNews() {
		return news();
	}
	public int newsSize() {
		return news().size();
	}
	private void clickMore() {
		more().click();
	}

}
