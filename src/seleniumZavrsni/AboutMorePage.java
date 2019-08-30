package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutMorePage {
	
	static WebDriver driver;
	
	public AboutMorePage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements
	private static List<WebElement> subjectsData() {
		return driver.findElements(By.cssSelector("tr.eve.forumRow"));
	}
	private static WebElement emailIcon() {
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}
	// Actions
	public List<WebElement> getSubjectsData() {
		return subjectsData();
	}
	public void subjectsDataList(Integer index) {
		getSubjectsData().get(index).click();
	}
	public void emailIconMore() {
		emailIcon().click();
	}

}
