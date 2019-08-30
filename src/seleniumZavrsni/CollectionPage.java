package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage {
	static WebDriver driver;
	
	 public CollectionPage (WebDriver driver) {
		this.driver = driver;
	} 
	 private static List<WebElement> creator() {
		return driver.findElements(By.cssSelector("a.ikind.stealth"));
	}
	 private static List<WebElement> videos() {
		return driver.findElements(By.cssSelector("div.item-ia.hov"));
	}
	 private static List<WebElement> leftLists() {
		return driver.findElements(By.cssSelector("div.fatable"));
	}
	 private static List<WebElement> more() {
		return driver.findElements(By.cssSelector("span.iconochive-right-solid"));
	}
	 private static WebElement searchThisCollection() {
		 return driver.findElement(By.cssSelector("input.form-control.input-sm.searchlist"));
	 }
	 private static List<WebElement> icons() {
		return driver.findElements(By.cssSelector("a.stealth span.hidden-xs-span"));
	}
	 private static WebElement number() {
		 return driver.findElement(By.cssSelector("div.results_count"));
	 }
	 public String number1() {
		return number().getText();
	 }
	 //Actions
	 public List<WebElement> getCreator() {
		 return creator();
	 }
	 public void clickCreator(Integer index) {
		 getCreator().get(index).click();
	 }
	 public List<WebElement> getVideos() {
		 return videos();
	 }
	 public void clickVideo(Integer index) {
		 getVideos().get(index).click();
	 }
	 public List<WebElement> getLeftLists() {
		 return leftLists();
	 }
	 public void clickLeftLists(Integer index) {
		 getLeftLists().get(index).click();
	 }
	 public List<WebElement> getMoreList() {
		 return more();
	 }
	 public void clickMore(Integer index) {
		 getMoreList().get(index).click();
	 }
	 public void inputThisCollection(String searchTerm) {
		 searchThisCollection().sendKeys(searchTerm);
	 }
	 public List<WebElement> getIcons() {
		 return icons();
	 }
}
