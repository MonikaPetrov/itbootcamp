package milan;


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
		
		driver.get("https://www.youtube.com/");
		new YouTubeHomePage(driver).sendTextToSearch(SEARCH_TERM);
		//Thread.sleep(3000);
		new YouTubeHomePage(driver).clickOnSearchButton();
		new YouTubeSearchResultsPage(driver).clickFilterButton();
		new YouTubeSearchResultsPage(driver).clickFirstFilter();
		//new YouTubeSearchResultsPage(driver).clickFirstElement();
		Thread.sleep(3000);
		String string = new YouTubeSearchResultsPage(driver).getFirstTittle();
		System.out.println(string);
		Assert.assertTrue(string.toLowerCase().contains(SEARCH_TERM));

	}
	
}

