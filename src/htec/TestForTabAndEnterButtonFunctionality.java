package htec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForTabAndEnterButtonFunctionality {
	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForLogin() throws Exception{
		LogInPage login = new LogInPage(driver);
		
		driver.get("https://qa-sandbox.apps.htec.rs");
		login.clickLogIn();
		
		login.inputKeywordsEmail("monikapetrov988@gmail.com");;
		login.inputKeywordsPassword("sifra123");;
		login.enterSubmit();

	}
}
