package JavaScriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4GenrateAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("alert('"+"Hey bob"+"')");
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
