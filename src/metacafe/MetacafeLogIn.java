package metacafe;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetacafeLogIn {
	
		static WebDriver driver;
		
		public MetacafeLogIn(WebDriver driver) {
			this.driver = driver;
		}
	
		private static WebElement logIn() {
			return driver.findElement(By.cssSelector("div#mc-header-user-btn"));
		}
		
		private static WebElement email() {
			return driver.findElement(By.cssSelector("input#login_email"));
		}
		private static WebElement password() {
			return driver.findElement(By.cssSelector("input#login_pass"));
		}
		private static WebElement logButton() {
			return driver.findElement(By.cssSelector("button.submit.mc-btn-big.mc-btn-login"));
		}
	    private static WebElement errorBlock() {
	    	 return driver.findElement(By.cssSelector("div.mc-popup-main-error.generic-error"));
	    }
	    private static WebElement signUp() {
	    	 return driver.findElement(By.cssSelector("div.mc-popup-auth-footer-right a"));
	    }
		public void clickLogIn() {
			logIn().click();
		}
		public void inputEmail(String searchTerm) {
			email().sendKeys(searchTerm);
		}
		public void inputPassword(String searchTerm) {
			password().sendKeys(searchTerm);
		}
		public void clickLogButton() {
			logButton().click();
		}
		public void clickSignUp() {
			signUp().click();
		}
		
		
	    public void getTextErrorBlock() {
	    	errorBlock();
	    }
	    public String getText() {
		 return errorBlock().getText();
	 }


}
