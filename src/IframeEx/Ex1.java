package IframeEx;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	
	 int numberOfTags = elements.size();
	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
	
	driver.switchTo().frame("iframeResult");
	WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me!']"));
    clickme.click();
	
    driver.switchTo().defaultContent();
	WebElement m = driver.findElement(By.xpath("//a[@title='Change Theme']"));
	m.click();
	
	
	
	
	
	
	
	
	
}
}
