package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
	static WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements
	 private static List<WebElement> navigateMenu() {
		return driver.findElements(By.cssSelector("li.menu-item"));
		}
	 private static WebElement searchBox() {
		 return driver.findElement(By.cssSelector("input#s"));
	 }
	 private static WebElement searchButton() {
		 return driver.findElement(By.cssSelector("input#searchsubmit"));
	 }
	 private static List<WebElement> facebookTwitter() {
		return driver.findElements(By.cssSelector("a.shareitem img"));
		}
	 // kad se ukuca it u search
	 private static List<WebElement> dinamic() { // kad se posalje it u search i ode na dr.str.
		return driver.findElements(By.cssSelector("h2.entry-title"));
		}
	 private static WebElement dropdown() {
		 return driver.findElement(By.cssSelector("select#archives-dropdown-2"));
	 }
	 // Actions
	public List<WebElement> getNavigateMenu() {
			return navigateMenu();
	}
	public void clickNavigateMenu(Integer index) {
			getNavigateMenu().get(index).click(); 
	}
	public void clickSearchBox() {
		searchBox().click();
	}
	public void inputSearch(String searchTerm) {
		searchBox().sendKeys(searchTerm);
	}
	public void clickButton() {
		searchButton().click();
	}
	public List<WebElement> getFacebookTwitter() {
		return facebookTwitter();
	}
	public void clickFacebookTwitter(Integer index) {
		getFacebookTwitter().get(index).click(); 
	}
	public List<WebElement> getDinamic() {
		return dinamic();
	}
	public void clickDinamicList(Integer index) {
		getDinamic().get(index).click(); 
	}
	 public void dropdownMenuSelect(String searchTerm) {
	      Select drp = new Select(dropdown());
	      drp.selectByVisibleText(searchTerm);
	}
}
