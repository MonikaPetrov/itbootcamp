package nono;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForML {
	WebDriver driver;

	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void youTubeTest() throws Exception{
		
		driver.get("https://www.udemy.com/machinelearning/");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
	       HomeML ml = new HomeML(driver);
	       ml.clickVideo();
	       Thread.sleep(3000);
	       ml.clickPustiVIdeo();
}
}