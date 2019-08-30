package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
	
	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForTopCollection() throws Exception {
		ArchiveHomePage homePage = new ArchiveHomePage(driver);
		LogInPage logIn = new LogInPage(driver);
		
		
		driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
		homePage.clickSignIn();
		Assert.assertTrue(logIn.isDisplayedPassword());
		logIn.clickSignUpForFree();
		logIn.clickTerms();
		Thread.sleep(3000);
		Assert.assertTrue(logIn.getChildWindowUrl().contains("terms"));
		
		
	}
}
