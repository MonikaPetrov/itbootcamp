package seleniumZavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MachineSearchPage {
	static WebDriver driver;
	
	public MachineSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Eleements
	 private static List<WebElement> capture() {
		return driver.findElements(By.cssSelector("li.result-item"));
	}
	 
	 // Actions
	 public List<WebElement> getCapture() {
		 return capture();
	 }
	 public void clickCaptureList(Integer index) {
		 getCapture().get(index).click();
	 }
	
}
