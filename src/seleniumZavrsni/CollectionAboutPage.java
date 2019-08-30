package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionAboutPage {
	static WebDriver driver;
	
	public CollectionAboutPage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements
	 private static WebElement about() {
		 return driver.findElement(By.cssSelector("span.tabby-text"));
	 }
	 private static List<WebElement> contriButors() {
		return driver.findElements(By.cssSelector("div.items_list person"));
	}
	 private static List<WebElement> grafs() {
		return driver.findElements(By.cssSelector("div.grafs.about-box"));
	}
	 private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("div.topinblock span.iconochive-collection"));
	}
	 private static WebElement topRegions() {
		 return driver.findElement(By.cssSelector("table.stats-table"));
	 }
	 
	 // Actions
	 public void clickAbout() {
		 about().click();
	 }
	 public List<WebElement> getContiButors() {
		 return contriButors();
	 }
	 public void clickContriButor(Integer index) {
		 getContiButors().get(index).click();
	 }
	 public List<WebElement> getGrafs() {
		 return grafs();
	 }
	 public void clickGrafs(Integer index) {
		 getGrafs().get(index).click();
	 }
	 public List<WebElement> getRelatedCollections() {
		 return relatedCollections();
	 }
	 public void clickRelatedCollections(Integer index) {
		 getRelatedCollections().get(index).click();
	 }
}
