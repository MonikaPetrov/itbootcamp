package htec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForUnsuccessfulLoginBlanEmail {
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
		login.inputEmail("");
		login.inputPass("sifra123");
		login.clickSubmit();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://qa-sandbox.apps.htec.rs/login");
		Assert.assertEquals(login.getText(), "Email field is required");	
}
}