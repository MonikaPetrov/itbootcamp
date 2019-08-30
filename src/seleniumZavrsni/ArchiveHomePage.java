package seleniumZavrsni;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArchiveHomePage {
	
		static WebDriver driver;
		
		public ArchiveHomePage(WebDriver driver) {
			this.driver = driver;
		}
		
		// Elements
		
		private static WebElement logo() {
			return driver.findElement(By.cssSelector("span.iconochive-logo"));
		}
		private static WebElement signIn() {
			return driver.findElement(By.cssSelector("a.nav-user"));
		}
		
		private static WebElement upload() {
			return driver.findElement(By.cssSelector("span.hidden-xs-span"));
		}

		private static List<WebElement> navBar() {
			return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
		}
		private static List<WebElement> navPictures() {
			return driver.findElements(By.cssSelector("div.widgets"));
		}
		private static List<WebElement> navFeaturedTop() {
			return driver.findElements(By.cssSelector("div.linx a"));
		}
		private static List<WebElement> abouts() {
			return driver.findElements(By.cssSelector("div#nav-abouts a"));
		}
		private static WebElement mayBack() {
			return driver.findElement(By.cssSelector("div.col-sm-6"));
		}
		private static WebElement enterKeywords() {
			return driver.findElement(By.cssSelector("input#nav-wb-url"));
		}
		private static WebElement hiddenSearch() {
			return driver.findElement(By.cssSelector("input#search-bar-2"));
		}
		private static WebElement user() { //kad si ulogovan
			return driver.findElement(By.cssSelector("span.hidden-xs-span"));
		}
		private static WebElement uploadLogIn() {
			return driver.findElement(By.linkText("Log in"));
		}
		private static WebElement uploadSignUp() {
			return driver.findElement(By.linkText("Sign up"));
		}
		
		public boolean logInIsDisplayed() {
			return uploadLogIn().isDisplayed();
		}
		public boolean signUpIsDisplayed() {
			return uploadSignUp().isDisplayed();
		}
		// Actions
		public void clickLogo() {
			logo().click();
		}
		public void clickInputKeywords() {
			enterKeywords().click();
		}
		public void inputKeywords(String searchTerm) {
			enterKeywords().sendKeys(searchTerm + Keys.ENTER);
		}
		public void clickMayBack() {
			mayBack().click();
		}
		
		public void clickSignIn() {
			signIn().click();
		}
		public void clickUpload() {
			upload().click();
		}
		public List<WebElement> getNavBar() {
			return navBar();
		}
		public void clickNavBar(Integer index) {
				getNavBar().get(index).click();
		}
		public List<WebElement> getNavPictures() {
			return navPictures();
		}
		public void clickNavPictures(Integer index) {
			getNavPictures().get(index).click();
		}
		public List<WebElement> getNavFeaturedTop() {
			return navFeaturedTop();
		}
		public void clickNavFeaturedTop(Integer index) {
			getNavFeaturedTop().get(index).click();
		}
		public List<WebElement> getAbouts() {
			return abouts();
		}
		public void clickAbouts(Integer index) {
			getAbouts().get(index).click();
		}
		public void clickHiddenSearch() {
			hiddenSearch().click();
		}
		public void inputHiddenSearch(String searchTerm) {
			hiddenSearch().sendKeys(searchTerm + Keys.ENTER);
		}
		public void clickUser() {
			user().click();
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
