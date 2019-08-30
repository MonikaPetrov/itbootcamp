package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
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
			UploadPage uploadPage = new UploadPage(driver);
			
			driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
			homePage.clickUpload();
;
			Assert.assertEquals(uploadPage.getText(), "Log in or Sign up");
		}
}
