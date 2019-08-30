package milan;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSearchResultsPage {

	
	static WebDriver driver;
	
	public YouTubeSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement filterButton() {
		return driver.findElement(By.cssSelector("yt-icon.style-scope.ytd-toggle-button-renderer"));
	}
	
	private static List<WebElement> filterList() {
		return driver.findElements(By.cssSelector("yt-formatted-string.style-scope.ytd-search-filter-renderer"));
	}
	private static List<WebElement> searchTittle() {
		return driver.findElements(By.cssSelector("a#video-title"));
	}

	
	public List<WebElement> getFilterList() {
		return filterList();
	}
	public List<WebElement> getSearchTittle() {
		return searchTittle();
	}
	public void clickSearchTittle() {
		getSearchTittle().get(0).click();
	}

	
	public void clickFirstFilter() {
		getFilterList().get(0).click();
	}
	
	public void clickFilterButton() {
		filterButton().click();
	}
	
	public String getFirstTittle() {
		return getSearchTittle().get(0).getText();
	}

}

