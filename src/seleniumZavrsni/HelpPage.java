package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {
	static WebDriver driver;
	
	 public  HelpPage(WebDriver driver) {
		this.driver = driver;
	}
	 // Elements
	 private static List<WebElement> buttons() {
		return driver.findElements(By.cssSelector("li.blocks-item"));
		}
	 private static WebElement searchBox() {
		 return driver.findElement(By.cssSelector("input#query"));
	 }
	 private static WebElement signIn() {
		 return driver.findElement(By.cssSelector("a.login")); 
	 }
	 // Actions
	 public List<WebElement> getButtons() {
		return buttons();
		}
	 public void clickButton(Integer index) {
		getButtons().get(index).click(); 
		}
	 public void clickSearchBox() {
		 searchBox().click();
	 }
	 public void inputSearchBox(String searchTerm) {
		 searchBox().sendKeys(searchTerm + Keys.ENTER);
	 }
	 public void clickSignIn() {
		 signIn().click();
	 }
}
