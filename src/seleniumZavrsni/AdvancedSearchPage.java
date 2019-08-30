package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPage {
	static WebDriver driver;
	
	 public AdvancedSearchPage  (WebDriver driver) {
		this.driver = driver;
	} 
	 // Elements
	
	 private static List<WebElement> rightFields() {
		return driver.findElements(By.cssSelector("div.row div.col-sm-7"));
	 }
	 private static List <WebElement> searchButtons() {
		 return driver.findElements(By.cssSelector("input.btn.btn-primary"));
	 }
	 //Advanced Search returning JSON, XML, and more
	 
	 private static WebElement query() {
		 return driver.findElement(By.cssSelector("input.form-control.input-sm"));
	 }
	 private static WebElement numberResult() {
		 return driver.findElement(By.cssSelector("input#numresults"));
	 }
	 private static WebElement page() {
		 return driver.findElement(By.cssSelector("input.form-control.input-sm.pull-right"));
	 }
	 private static WebElement fieldsToReturn() {
		 return driver.findElement(By.name("fl[]")); //akcija ako bude trebalo		 
	 }
	 private static List<WebElement> format() {
		 return driver.findElements(By.name("output"));	 
	 }
	 private static List<WebElement> optional() {
		 return driver.findElements(By.name("sort[]"));	 
	 }

	 // Actions
	 public List<WebElement> getRightFields() {
			return rightFields();
		}
	 public void clickRightField(Integer index) {
		 getRightFields().get(index).click();
	 }
	 public List<WebElement> getSearchButtons() {
			return searchButtons();
		}
	 public void FirstSecondSearch(Integer index) {
		 getSearchButtons().get(index).click();
	 }
	 //Advanced Search returning JSON, XML, and more
	 public void inputQuey(String searchTerm) {
		 query().sendKeys(searchTerm);
	 }
	 public void inputNumberResult(String searchTerm) {
		 numberResult().sendKeys(searchTerm);
	 }
	 public void inputPage(String searchTerm) {
		 page().sendKeys(searchTerm);
	 }
	 public List<WebElement> getFormat() {
			return format();
		}
	 public void clickFormat(Integer index) {
		 getFormat().get(index).click();
	 }
	 public List<WebElement> getOptional() {
			return optional();
		}
	 public void clickOptionalList(Integer index) {
		 getOptional().get(index).click();
	 }
}
