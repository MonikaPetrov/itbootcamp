package milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlackLoginPage extends SlackLoadWaiter {
	static WebDriver driver;
	
	public SlackLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement email() {
		return driver.findElement(By.name("email"));
	}
	
	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}
	private static WebElement signInBtn() {
		return driver.findElement(By.cssSelector("[id='signin_btn']"));
	}
	
	public WebElement getEmail() {
		return email();
	}
	
	public WebElement getPassword() {
		return password();
	}
	
	public WebElement getSignInBtn() {
		return signInBtn();
	}
	
	public void typeEmail(String email) {
		this.getEmail().sendKeys(email);
	}
	
	public void typePassword(String pass) {
		this.getPassword().sendKeys(pass);
	}
	
	public void login() {
		this.getSignInBtn().click(); // iz nekog razloga ne radi samo kad se jednom klikne
		this.getSignInBtn().click(); // nisam imao vremena da istrazujem, pronadjite bolje resenje
									 // moguce da je lose selektovan element
	}
}
