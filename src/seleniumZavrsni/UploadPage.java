package seleniumZavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	static WebDriver driver;
	
	 public UploadPage (WebDriver driver) {
		this.driver = driver;
	}
	 // Elements
	 private static WebElement uploadFiles() {
		 return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));
	 }
	 private static WebElement liveMusic() {
		 return driver.findElement(By.cssSelector("a.btn.btn-primary"));
	 }
	 private static WebElement question() {
		 return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
	 }
	 private static WebElement logInSign() {
		 return driver.findElement(By.cssSelector("#maincontent > div > p > b:nth-child(5)"));
	 }
	 public boolean textIsDisplayed() {
		 return logInSign().isDisplayed();
	 }
	 public String getText() {
	return  logInSign().getText();
	 }
	 // Actions
	private void clickUploadFiles() {
		uploadFiles().click();
		}
	private void clickLiveMusic() {
		liveMusic().click();
		}
	private void clickQuestion() {
		question().click();
		}
}
