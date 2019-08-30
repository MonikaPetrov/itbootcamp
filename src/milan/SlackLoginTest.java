package milan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;


public class SlackLoginTest {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		// da se ne bi svaki put odjavljivao sa Slack-a
		// postavio sam opcije za privatan prozor
		// jer ne pamti logovanje nakon zatvaranja prozora
		FirefoxOptions opts = new FirefoxOptions();
		opts.addArguments("-private");
		
		driver = new FirefoxDriver(opts);
		wait = new WebDriverWait(driver, 30);
	}

	@Test
	public void loginAndSendMessTest() throws Exception {
		driver.navigate().to(SlackConst.URL);

		SlackHomePage shpt = new SlackHomePage(driver);
		shpt.pageLoadedWait(wait); 
		shpt.clickOnSignIn();
		
		
		SlackWorkspacePage swp = new SlackWorkspacePage(driver);
		swp.pageLoadedWait(wait);
		swp.typeWorkspaceName(SlackConst.WORKSPACE);
		swp.clickContinue();
		
		SlackLoginPage slg = new SlackLoginPage(driver);
		slg.pageLoadedWait(wait);
		slg.typeEmail(SlackConst.EMAIL);
		slg.typePassword(SlackConst.PASSWORD);
		slg.login();
		
		SlackRoomPage srp = new SlackRoomPage(driver);
		srp.pageLoadedWait(wait);		
		srp.myDirectMessageWait(wait);
		srp.goToMyDM();
		srp.chatLoadWait(wait);
		srp.typeMessage(SlackConst.MESSAGE);
		srp.sendMessage();
		driver.close();
	}
}