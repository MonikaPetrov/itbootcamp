package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	
	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForLogIn() throws Exception {
		ArchiveHomePage homePage = new ArchiveHomePage(driver);
		LogInPage logInPage = new LogInPage(driver);
		
		driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
		homePage.clickSignIn();
		logInPage.inputEmail("foo@gmail.com");
		logInPage.inputPass("bar");
		logInPage.clickLogInButton();
		Thread.sleep(2000);
		Assert.assertEquals(logInPage.getText(), "Email address and/or Password incorrect.");
	}
}
