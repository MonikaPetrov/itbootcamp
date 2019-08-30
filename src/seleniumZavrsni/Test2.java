package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test2 {
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
		ArchiveFloater archiveFloater = new ArchiveFloater(driver);
		
		driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
		homePage.clickNavBar(1);
		homePage.clickNavFeaturedTop(0);
		homePage.getChildWindowUrl();
	//	System.out.println(homePage.getChildWindowUrl());
		homePage.clickLogo();
		archiveFloater.clickOneOfLinks(1);
		archiveFloater.getChildWindowUrl();
	//	System.out.println(archiveFloater.getChildWindowUrl());
		Assert.assertEquals(homePage.getChildWindowUrl(), archiveFloater.getChildWindowUrl());	
	
		homePage.clickLogo();
		archiveFloater.clickSearchBar();
		Assert.assertTrue(archiveFloater.dropIsDisplayed());
		
		archiveFloater.archiveSearchBar("qa");
		archiveFloater.archiveSearchButton();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=qa"));
		
		

		
		
		
	}
}
