package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PhpTravelsPage {
    static WebDriver driver;
    
    public PhpTravelsPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    // Elements
    private static List<WebElement> elementBox() {
        return driver.findElements(By.cssSelector("div.resource-box"));
    }
    
    private static List<WebElement> elementi() {
        return driver.findElements(By.cssSelector("div.col-md-6 div.row a"));
    }
    
    public List<WebElement> prviDrugiElement() {
        return elementi();
    }
    public void KlikPrviElement() {
        prviDrugiElement() .get(0).click();
    }
    public void klikDrugiElement() {
        prviDrugiElement().get(1).click();
    }
    
    // public void clickBox(Integer index) {
    //  prviDrugiElement().get(index).click(); }
    
      
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
