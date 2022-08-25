package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2CaptureTheTitalOfWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
		driver.get("https://www.imdb.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		String title = jse.executeScript("return document.title;").toString();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
