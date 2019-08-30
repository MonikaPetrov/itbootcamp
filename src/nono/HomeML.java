package nono;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeML {
	static WebDriver driver;
	
	public HomeML(WebDriver driver) {
		this.driver = driver;
	}
	private static WebElement video() {
		return driver.findElement(By.cssSelector
				("div.play-button-trigger.styles--introduction-asset__placeholder--3aYtt "
						+ "div.play-button.styles--play-button--akRnc"));
	}
	private static WebElement pustiVideo() {
		return driver.findElement(By.cssSelector
				("#previews__placeholder > div > div > div.asset-container__placeholder.play-button-trigger > "
						+ "div > div.play-button.play-button--initially-visible"));
	}
	public void clickVideo() {
		video().click();
	}
	public void clickPustiVIdeo() {
		pustiVideo().click();
	}
}
