package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {
	static WebDriver driver;
	
	 public ProjectsPage(WebDriver driver) {
		this.driver = driver;
	}
	 private static List<WebElement> pictures() {
		return driver.findElements(By.cssSelector("div.col-sm-3"));
		}
	 private static List<WebElement> texts() {
		return driver.findElements(By.cssSelector("div.col-sm-9"));
		}
	 public List<WebElement> getPictures() {
		return pictures();
		}
	 public List<WebElement> getTexts() {
		return texts();
		}	
	 public int textsNumber() {
		 return texts().size();
	 }
	 public int picturesNumber() {
		 return pictures().size();
	 }
}
