package marko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	public static final String SEARCH_TERM = "java";

	
	WebDriver driver;
	//YouTubeHomePage youTubeHome = new YouTubeHomePage(driver);
	//YouTubeSearchResultsPage youTubeSearch = new YouTubeSearchResultsPage(driver);
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	
		driver = new FirefoxDriver();
	}
	
	@Test
	public void youTubeTest() throws Exception{
		
		driver.navigate().to(PageURLs.YT_MAIN_PAGE);
		new YouTubeHomePage(driver).sendTextToSearch(SEARCH_TERM);
		//Thread.sleep(3000);
		new YouTubeHomePage(driver).clickOnSearchButton();
		new YouTubeSearchResultsPage(driver).clickFilterButton();
		new YouTubeSearchResultsPage(driver).clickFirstFilter();
		//new YouTubeSearchResultsPage(driver).clickFirstElement();
		String string = new YouTubeSearchResultsPage(driver).prviElementText();
		
		System.out.println(string);
	//	Assert.assertTrue(string.toLowerCase().contains(SEARCH_TERM));
		Thread.sleep(3000);
	//	Assert.assertTrue(new YouTubeSearchResultsPage(driver).prviElementText().contains(SEARCH_TERM));
	}

}
