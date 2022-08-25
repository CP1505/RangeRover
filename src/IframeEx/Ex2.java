package IframeEx;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.imdb.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	
	 int numberOfTags = elements.size();
	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
