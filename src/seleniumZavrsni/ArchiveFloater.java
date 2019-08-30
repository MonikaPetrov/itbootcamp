package seleniumZavrsni;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArchiveFloater {
	static WebDriver driver;
	
	public ArchiveFloater(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	 private static WebElement searchBar() {
		 return driver.findElement(By.cssSelector("input.form-control.input-sm.roundbox20.js-search-bar"));
	}
	 private static WebElement searchButton() {
		 return driver.findElement(By.cssSelector("button.btn.btn-gray.label-primary.input-sm"));
	}
	 private static List<WebElement> links() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
		}
	 private static List<WebElement> topCollections() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
		}
	 private static WebElement advancedSearch() {
		 return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}
	 private static WebElement seeMore() {
		 return driver.findElement(By.cssSelector("div.pull-right a"));
	 }
	 private static WebElement dropDownMenu() {
		return driver.findElement(By.name("sin"));
		}
	 private static WebElement number() {
		return driver.findElement(By.cssSelector("num-items topinblock"));
		}
	 public String getNumber() {
		 return number().getText();
	 }
	 
	 // Actions
	public boolean dropIsDisplayed() {
		return dropDownMenu().isDisplayed();
	}

	public void clickSearchBar() {
		searchBar().click();
	}
	public void archiveSearchBar(String searchTerm) {
		searchBar().sendKeys(searchTerm);
	}
	public void archiveSearchButton() {
		searchButton().click();
	}
	public List<WebElement> collections() {
		return topCollections();
	}
	
	public void clickCollectrions(Integer index) {
		collections().get(index).click(); 
	}
	public void prviElementPregledi(Integer index) {
		collections().get(0); 
	}

	public int sizeCollections() {
		return collections().size();
	}
	
	public void clickAdvancedSearch() {
		advancedSearch().click();
	}
	public void clickSeeMore() {
		seeMore().click();
	}
	public List<WebElement> nineLinks() {
		return links();
	}
	public void clickOneOfLinks(Integer index) {
		nineLinks().get(index).click(); 
	}
    public String getChildWindowUrl() {
        Set<String> window = driver.getWindowHandles();
        Iterator iterator = window.iterator();
        String currentWindowId = null;
        String mainPage = driver.getWindowHandle();
        while(iterator.hasNext()){
            currentWindowId = iterator.next().toString();
            // Takes the url from child window
            if (!currentWindowId.equals(mainPage)){
                driver.switchTo().window(currentWindowId);
            }
        }
        return driver.getCurrentUrl();
    }
	
}
