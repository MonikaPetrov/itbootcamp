package milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlackHomePage extends SlackLoadWaiter {
	
	static WebDriver driver;
	
	public SlackHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement signInLink() {
		return driver.findElement(By.cssSelector("header .u-push--right"));
	}
	
	public WebElement getSignInLink() {
		return signInLink();
	}
	
	public void clickOnSignIn() {
		this.signInLink().click();
	}
}