package marko;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSearchResultsPage {

	
	static WebDriver driver;
	
	public YouTubeSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> searchVideos() {
		return driver.findElements(By.cssSelector("div#dismissable"));
	}
	
	private static WebElement filterButton() {
		return driver.findElement(By.cssSelector("yt-icon.style-scope.ytd-toggle-button-renderer"));
	}
	
	private static List<WebElement> filterList() {
		return driver.findElements(By.cssSelector("yt-formatted-string.style-scope.ytd-search-filter-renderer"));
	}
	private static List <WebElement> prviVideo() {
		return driver.findElements(By.cssSelector("a#video-title"));
	}
	
	// Actions  a#video-title

	
	public List<WebElement> getFilterList() {
		return filterList();
	}
	public void clickFirstFilter() {
		getFilterList().get(0).click();
	}
	
	public void clickFilterButton() {
		filterButton().click();
	}
	
	
	public List<WebElement> getPrviVideo() {
	return prviVideo();
}
	
	public String prviElementText() {
		return getPrviVideo().get(0).getText();
	}

	}

