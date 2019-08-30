package metacafe;


import java.util.Iterator;
/*
 * menu
 * klin na prvi deo
 * klik na drugi deo
 * logo
 * searc?
 * logIn
 * navigation
 * video  prev, next
 * drustvene mreze
 * poslednji red
 * 
 *  */
	import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MetacafeHome {
		static WebDriver driver;
		
		public MetacafeHome(WebDriver driver) {
			this.driver = driver;
		}
		private static WebElement logo() {
			return driver.findElement(By.cssSelector("a.mc-header-logo"));
		}
		private static WebElement searchBox() {
			return driver.findElement(By.cssSelector("input#search_keyword_top"));
		}
		private static List<WebElement> filter() {
			return driver.findElements(By.cssSelector("div.mc-ma.mc-mt-menu a"));
		}
		private static List<WebElement> videos() {
			return driver.findElements(By.cssSelector("div.owl-item div.item.mc-cl.mc-preview"));
		}
	
		private static WebElement menu() {
			return driver.findElement(By.cssSelector("div.mc-header-menu-wrap"));
		}
		private static WebElement menuHome() {
			return driver.findElement(By.cssSelector("i.icon-home"));
		}
	//	private static WebElement menuProba() {
//			return	driver.findElement(By.id("Value")).sendKeys(Keys.ENTER); 
		
		public void clickMenu() {
			menu().click();
		}
		public void clickLogo() {
			logo().click();
		}
		public void clickSearchBox(String searchTerm) {
			searchBox().sendKeys(searchTerm);
		}
		public List<WebElement> getFilter() {
			return filter();
		}
		public void prviFilterLista() {
			getFilter().get(0).click();	
		}
		public void drugiFilterLista() {
			getFilter().get(1).click();	
		}
		public void treciFilterLista() {
			getFilter().get(2).click();	
		}
		public List<WebElement> getVideos() {
			return videos();
		}
		public void clickFirstVideo() {
			getVideos().get(0).click();
		}
		public void clickSecondVideo() {
			getVideos().get(12).click();
		}
		public void clickHome() {
			menuHome().click();
		}
	    public String getChildWindowUrl() {
	        Set<String> window = driver.getWindowHandles();
	        Iterator iterator = window.iterator();
	        String currentWindowId = null;
	        String mainPage = driver.getWindowHandle();
	        while(iterator.hasNext()){
	            currentWindowId = iterator.next().toString();
	            // Takes the url from child window
	            if (!currentWindowId.equals(mainPage)){
	                driver.switchTo().window(currentWindowId);
	            }
	        }
	        return driver.getCurrentUrl();
	    }
	}

