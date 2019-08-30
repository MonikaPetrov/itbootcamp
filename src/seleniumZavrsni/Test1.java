package seleniumZavrsni;

import org.testng.annotations.Test;

import demo.PhpTravelsPage;

import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForTopCollection() throws Exception {
		ArchiveFloater archiveFloater = new ArchiveFloater(driver);
		driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
		Assert.assertTrue(archiveFloater.sizeCollections() >= 20);
		archiveFloater.sizeCollections();
		List<WebElement> tekst = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
		for(WebElement i : tekst) {
		System.out.println(i.getText());
		Assert.assertTrue(i.getText().toLowerCase().contains("items"));
		}	
		
	}
	
}
