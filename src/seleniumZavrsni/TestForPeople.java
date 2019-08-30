package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForPeople {
	WebDriver driver;

//	private static final String SEARCH = "admin";
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForPeople() throws Exception{
		
		PeoplePage people = new PeoplePage(driver);
		
		driver.navigate().to(URLsPage.PEOPLE_PAGE);
		Thread.sleep(10000);
		people.firstText();
	//	people.firstTextCeo();
		
	//	System.out.println(people.firstText());
}
}