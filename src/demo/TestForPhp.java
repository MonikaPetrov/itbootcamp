package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class TestForPhp {
    
    
    WebDriver driver;
    private static final String SEARCH = "admin";
    @BeforeTest
	public void setup() {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    
    @Test
    public void testForPhp() throws Exception{
        driver.get("https://phptravels.com/demo/");
        PhpTravelsPage php = new PhpTravelsPage(driver);
   //   php.KlikPrviElement();
       // Thread.sleep(8000);
     // driver.get("https://phptravels.com/demo/");
        Thread.sleep(5000);
        php.klikDrugiElement();
        Thread.sleep(4000); 
        Assert.assertTrue(new PhpTravelsPage(driver).getChildWindowUrl().contains(SEARCH));
        AdminPage admin = new AdminPage(driver);
        Thread.sleep(4000); 
        admin.inputName("monika");
        Thread.sleep(4000); 
        admin.inputPass("sS12345");
        Thread.sleep(4000); 
        admin.clickLogIn();
        Thread.sleep(4000); 
        
      Assert.assertEquals(admin.getText(), "The Email field must contain a valid email address.");
        //The Email field must contain a valid email address.
    }
}
