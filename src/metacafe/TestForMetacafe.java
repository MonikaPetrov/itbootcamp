package metacafe;



	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestForMetacafe {
		WebDriver driver;

//		private static final String SEARCH = "admin";
		@BeforeTest
		public void setup() {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		@Test
		public void testForCafe() throws Exception{
			driver.get("https://www.metacafe.com/");
			Thread.sleep(5000);
			
			MetacafeHome home = new MetacafeHome(driver);
		//	home.clickSearchBox("gaga");
			MetacafeLogIn logIn = new MetacafeLogIn(driver);
			SignUp signUp = new SignUp(driver);
			
			
/*			home.prviFilterLista();
			home.clickLogo();
			Thread.sleep(3000);
			home.drugiFilterLista();
			home.clickLogo();
			Thread.sleep(3000);
			home.treciFilterLista();
			home.clickLogo();
			Thread.sleep(3000);
			home.clickFirstVideo();
			home.clickLogo();
			home.clickSecondVideo();
		
			home.clickLogo();
			home.clickMenu();
			home.clickHome();
			
	*/		
			logIn.clickLogIn();
			Thread.sleep(3000);
			logIn.inputEmail("gaga@hotmail.com");
			logIn.inputPassword("kojiJeDatum22");
			Thread.sleep(3000);
			logIn.clickLogButton();
			Thread.sleep(3000);
			 Assert.assertEquals(logIn.getText(), "Invalid Login or Password. Login and Password are case-sensitive.");	
			 
			driver.get("https://www.metacafe.com/");
			Thread.sleep(3000);
			logIn.clickLogIn();
			logIn.clickSignUp();
			signUp.inputEmail("trala@hotmail.com");
			signUp.inputPassword("siFra123");
			signUp.inputPasswordConfim("sifra123");
			Thread.sleep(3000);
			
			

			Thread.sleep(3000);
			
	}
	
}
