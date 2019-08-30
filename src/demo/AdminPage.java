package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
static WebDriver driver;
    
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }
    private static WebElement name() {
        return driver.findElement(By.name("email"));
        }
    private static WebElement pass() {
        return driver.findElement(By.name("password"));
        }
    private static WebElement rememberMe() {
        return driver.findElement(By.cssSelector("div.icheckbox_square-grey"));
    }
    private static WebElement forgotPass() {
        return driver.findElement(By.cssSelector("a#link-forgot"));
    }
    private static WebElement logIn() {
        return driver.findElement(By.cssSelector("span.ladda-label"));
        }
    private static WebElement errorBlock() {
    	 return driver.findElement(By.cssSelector("div.resultlogin"));
    }
    
    public void inputName(String searchTerm) {
        name().sendKeys(searchTerm);
    }
    public void inputPass(String searchTerm) {
        pass().sendKeys(searchTerm);
    }
    public void inputRemember() {
        rememberMe().click();
    }
    public void clickForgot() {
        forgotPass().click();
    }
    public void clickLogIn() {
        logIn().click();
    }
    
    public void getTextErrorBlock() {
    	errorBlock();
    }
    public String getText() {
	 return errorBlock().getText();
 }
}
