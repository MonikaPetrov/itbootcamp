package milan;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class SlackRoomPage extends SlackLoadWaiter {
	static WebDriver driver;

	public SlackRoomPage(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> directMessages() {
		return driver.findElements(By.cssSelector("[role='listitem'] a .p-channel_sidebar__name span"));
	}

	private static WebElement messageInput() {
		return driver.findElement(By.cssSelector(".ql-editor"));
	}

	public List<WebElement> getdirectMessages() {
		return directMessages();
	}

	public WebElement getMessageInput() {
		return messageInput();
	}

	// funkcija ceka da se prikaze ovaj element
	// jer se kontaktni na Slacku ucitavaju nakon ucitavanja stranice
	public void myDirectMessageWait(WebDriverWait wait) {
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.cssSelector(".p-channel_sidebar__you_label")));
		wait.until(new Function<WebDriver, WebElement>() {       
			public WebElement apply(WebDriver driver) { 
			return driver.findElement(By.cssSelector(".p-channel_sidebar__you_label"));     
			 }  
			});  
	}

	public void goToMyDM() {
		driver.findElement(By.cssSelector(".p-channel_sidebar__you_label")).click();
	}

	// kada se kliknete na svoj DirectMessage
	// potrebno je vreme da vam se ucita desni deo za poruke
	// ceka se element koji kaze da se ucitano (to je element u vrhu, gde pise [Ime Prezime] (you)
	public void chatLoadWait(WebDriverWait wait) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("span.p-classic_nav__model__title__is_you")));
	}

	public void typeMessage(String message) {
		this.getMessageInput().sendKeys(message);
	}
	// nakon iskucane poruke
	// s obzirom da nemamo dugme na kom mozemo da kliknemo i posaljemo poruku
	// potrebno je da posaljemo poruku pomocu Entera
	// ovo je nacin za to
	public void sendMessage() {
		this.getMessageInput().sendKeys(Keys.ENTER);
	}
}
