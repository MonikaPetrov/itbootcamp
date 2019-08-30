package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {
	static WebDriver driver;
	
	 public DonatePage(WebDriver driver) {
		this.driver = driver;
	}
	 // Elements
	 private static List<WebElement> money() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	 }
	 private static WebElement inputMoneySeven() {
		 return driver.findElement(By.cssSelector("input#amount_custom")); 
	 }
	 // Actions
	 public List<WebElement> getButtons() {
		return money();
		}
	 public void donateButtons(Integer index) {
		getButtons().get(index).click(); 
		}
	 public void clickInputMoney() {
		 inputMoneySeven().click();
	 }
	 public void inputMoney(String searchTerm) {
		 inputMoneySeven().sendKeys(searchTerm);
	 }

}
