package seleniumZavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test6 {
	
	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testForTopCollection() throws Exception {
			ArchiveFloater archive = new ArchiveFloater(driver);
	        CollectionPage collectionPage = new CollectionPage(driver);
	        
	        driver.navigate().to(URLsPage.ARCHIVE_HOME_PAGE);
	        
	        
	        SoftAssert asrt = new SoftAssert();

	        String numb1 = archive.getNumber();
	        
	        archive.getNumber();
	        
	       
	        String numb2 = collectionPage.number1();
	 
	        String newNumb1 = numb1.replace(",", "");
	        String newNumb2 = numb2.replace(",", "");
	        int result1 = Integer.valueOf(newNumb1);
	        System.out.println(result1);
	        int result2 = Integer.valueOf(newNumb2);
	        System.out.println(result2);
	        
	        int diference = result1 - result2;
	        System.out.println(diference);
	        
	        asrt.assertAll();
	        driver.close();
	}
}
