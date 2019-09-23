package htec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	static WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	private static WebElement logIn() {
		return driver.findElement(By.cssSelector("div.col-md-12.text-center a.btn.btn-lg.btn-secondary"));
	}
	 private static List<WebElement> emailPassword() {
		return driver.findElements(By.cssSelector("input.value.input-group.form-control.form-control-lg.undefined"));
	}
	private static WebElement submit() {
		return driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block.mt-4"));
	}
    private static WebElement errorBlock() {
   	 return driver.findElement(By.cssSelector("div.invalid-feedback"));
   }
	public void clickEmail() {
		emailPassword().get(0).click();
	}
	public void clickPassword() {
		emailPassword().get(1).click();
	}
	 
    public void inputKeywordsEmail(String text) {
    	emailPassword().get(0).sendKeys(text + Keys.TAB);
		}
    public void inputKeywordsPassword(String text) {
    	emailPassword().get(1).sendKeys(text + Keys.TAB);
		}
    public void enterSubmit() {
    	submit().submit();;
		}
	public boolean errorIsDisplayed() {
		return errorBlock().isDisplayed();
	}

	 public void clickLogIn() {
		logIn().click();
	}
	 public List<WebElement> getEmailPassword() {
		 return emailPassword();
	 }
	 public void inputEmail(String email) {
		 emailPassword().get(0).sendKeys(email);
	 }
	 public void inputPass(String password) {
		 emailPassword().get(1).sendKeys(password);
	 }
	public boolean emailIsDisplayed() {
			return emailPassword().get(0).isDisplayed();
	}
	public boolean passwordIsDisplayed() {
		return emailPassword().get(1).isDisplayed();
	}	
	public boolean submitIsDisplayed() {
		return submit().isDisplayed();
	}	
    public void clickSubmit() {
		 submit().click();
	}
	public void getTextErrorBlock() {
	   	errorBlock();
    }
    public String getText() {
		 return errorBlock().getText();
   }

	 
	 
	 
}
