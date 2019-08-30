package seleniumZavrsni;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	static WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input.form-element.input-email"));
	}
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input.form-element.input-password"));
	}
	private static WebElement logInButton() {
		return driver.findElement(By.cssSelector("input.btn.btn-primary.btn-submit.input-submit"));
	}
	private static WebElement signUpForFree() {
		return driver.findElement(By.
				linkText("Sign up for free!"));
	}
	private static WebElement forgotPassword() {
		return driver.findElement(By.cssSelector("span.reset-password a"));
	}
	private static WebElement chechBox() {
		return driver.findElement(By.cssSelector("input-checkbox"));
	}
    private static WebElement errorBlock() {
   	 return driver.findElement(By.cssSelector("span.login-error"));
   }
    public static WebElement terms() {
    	return driver.findElement(By.cssSelector("div.terms a"));
    }
    public void clickTerms() {
    	terms().click();
    }
	// Actions
	public void inputEmail(String searchTerm) {
		email().sendKeys(searchTerm);
	}
	public void inputPass(String searchTerm) {
		password().sendKeys(searchTerm);
	}
	public void clickLogInButton() {
		logInButton().click();
	}
	public void clickSignUpForFree() {
		signUpForFree().click();
	}
	public void clickForgotPassword() {
		forgotPassword().click();
	}
	public boolean isDisplayedPassword() {
		return forgotPassword().isDisplayed();
	}
	public void inputCheckBox() {
		chechBox().click();
	}
    public void getTextErrorBlock() {
    	errorBlock();
    }
    public String getText() {
	 return errorBlock().getText();
 }
    public String getChildWindowUrl() {
        Set<String> window = driver.getWindowHandles();
        Iterator iterator = window.iterator();
        String currentWindowId = null;
        String mainPage = driver.getWindowHandle();
        while(iterator.hasNext()){
            currentWindowId = iterator.next().toString();
            // Takes the url from child window
            if (!currentWindowId.equals(mainPage)){
                driver.switchTo().window(currentWindowId);
            }
        }
        return driver.getCurrentUrl();
    }
	
}
