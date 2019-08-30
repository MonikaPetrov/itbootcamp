package seleniumZavrsni;




import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {
	static WebDriver driver;
	private List<WebElement> lista;
	
	 public PeoplePage (WebDriver driver) {
		this.driver = driver;
	}
	 private static List<WebElement> peoples() {
		return driver.findElements(By.cssSelector("div.bio img"));
		}
	 private static List<WebElement> listaKojaNamTReba() {
		return driver.findElements(By.cssSelector("div.bio img"));
		}
	 //Actions

	 
	 public void firstText() {
			System.out.println(peoples().size());
	
	
			List<WebElement> e = driver.findElements(By.cssSelector("div.bio b"));	
			for(WebElement var:e) {
				String lista = var.getText();
				ArrayList<String> people = new ArrayList<String>();
				people.add(lista);
				ArrayList<String> peoples = new ArrayList<String>();
				peoples.add(lista);

				
			}
	
			List<WebElement> i = driver.findElements(By.cssSelector("div.bio i"));	
			for(WebElement var1:i) {
				String lista1 = var1.getText();
				ArrayList<String> people1 = new ArrayList<String>();
				people1.add(lista1);

			}

		
	 }
	 

	
	 public List<WebElement> getPeoples() {
			return peoples(); 
	 }
	 public void lista(Integer index) {
		getPeoples().get(0).getText();
		
	}
	 public int getPeopleSize() {
		 return peoples().size();
	 }
	
	

}