package JavaScriptExecuterUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtils {
	public static void DrawBorderjs(WebDriver driver, WebElement element) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border='5px solid red'", element);
	
	}
	
	public static String Titalbyjs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

	//4. Generate an alert
	
	public static void alertbyJS(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	
	//5.Refresh
	
	public static void refreshbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	//6. Scroll down the  page
	
	public static void scrolldownbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
	}

	//7. Scroll up the  page
	
	 public static void scrollupbyJS(WebDriver driver, int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
	}
	 
	//8. scrollintoview.
	 
	 public static void scrollintoviewbyJS(WebDriver driver, WebElement element) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element );
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
