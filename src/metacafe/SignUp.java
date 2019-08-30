package metacafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	static WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement email() {
		return driver.findElement(By.cssSelector("input#signup_email"));
	}
	private static WebElement password() {
		return driver.findElement(By.cssSelector("input#signup_pass"));
	}
	private static WebElement passwordConfim() {
		return driver.findElement(By.cssSelector("input#signup_pass2"));
	}
	
	
	public void inputEmail(String searchTerm) {
		email().sendKeys(searchTerm);
	}
	public void inputPassword(String searchTerm) {
		password().sendKeys(searchTerm);
	}
	public void inputPasswordConfim(String searchTerm) {
		passwordConfim().sendKeys(searchTerm);
	}
}
