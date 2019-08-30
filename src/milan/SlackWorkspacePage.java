package milan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlackWorkspacePage extends SlackLoadWaiter {
	
	static WebDriver driver;
	
	public SlackWorkspacePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement domain() {
		return driver.findElement(By.name("domain"));
	}
	
	private static WebElement continueBtn() {
		return driver.findElement(By.id("submit_team_domain"));
	}
	
	public WebElement getDomain() {
		return domain();
	}
	
	public WebElement getContinueBtn() {
		return continueBtn();
	}
	
	public void typeWorkspaceName(String workspaceName) {
		this.getDomain().sendKeys(workspaceName);
	}
	
	public void clickContinue() {
		this.getContinueBtn().click();
	}
}

