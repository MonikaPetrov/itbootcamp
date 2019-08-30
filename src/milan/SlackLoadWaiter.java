package milan;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

// ovu klasu nasledjuju svi page modeli
public abstract class SlackLoadWaiter {
	
	// izvucena je funkcija u ovu klasu, da se ne bi ponavljaja u svaku
	// funkcija ceka da se strana ucita
	public void pageLoadedWait(WebDriverWait wait) {
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				// strana je ucitana kada je readyState stranice postavljeno na complete
				System.out.println(((JavascriptExecutor) driver).executeScript("return document.readyState"));
				return (((JavascriptExecutor) driver).executeScript("return document.readyState")).equals("complete");
			}
		});
	}
}
