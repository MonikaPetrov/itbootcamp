package nono;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Domaci {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monika\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("https://www.udemy.com/machinelearning/"); 
	    
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       Thread.sleep(3000);

	       driver.findElement(By.cssSelector
("div.play-button-trigger.styles--introduction-asset__placeholder--3aYtt "
		+ "div.play-button.styles--play-button--akRnc")).click();
			Thread.sleep(6000);
		
			driver.findElement(By.cssSelector
("#previews__placeholder > div > div > div.asset-container__placeholder.play-button-trigger > "
		+ "div > div.play-button.play-button--initially-visible")).click();
			
	// 
			
			
			
			
			
			
			
			//driver.switchTo().frame("div#previews__placeholder div.w100p.h100p.video-player--container--YDQRW div.play-button play-button--initially-visible");
		//	div#previews__placeholder
		/*	System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************"); */
      }
}
