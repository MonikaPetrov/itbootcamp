package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {
	static WebDriver driver;
	
	 public JobsPage(WebDriver driver) {
		this.driver = driver;
	}
	 //Elements
	 private static WebElement searchBar() {
		 return driver.findElement(By.cssSelector("input#q"));
	 }
	 private static WebElement searchButton() {
		 return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	 }
	 private static WebElement advanced() {
		 return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	 }
	 private static List<WebElement> jobs() {
		return driver.findElements(By.cssSelector("a.job_title_link"));
		}
	 
	 // Actions
	 public void clickSearchBar() {
		 searchBar().click();
	 }
	 public void inputSearchBar(String searchTerm) {
		 searchBar().sendKeys(searchTerm);
	 }
	 public void clickSearchButton() {
		 searchButton().click();
	 }
	 public void clickAdvanced() {
		 advanced().click();
	 }
	 public List<WebElement> getJobs() {
		return jobs();
		}
	 public void jobsList(Integer index) {
		 getJobs().get(index).click(); 
		}
	 public int jobsListSize() {
		 return jobs().size();
	 }
}
