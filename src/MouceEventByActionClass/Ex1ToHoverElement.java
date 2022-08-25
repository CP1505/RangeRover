package MouceEventByActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1ToHoverElement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Accept = driver.findElement(By.xpath("//button[text()='Accept All']"));
		Accept.click();
		
		List<WebElement> names = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
		
		for(int i=0;i<names.size();i++) {
			WebElement name = names.get(i);
			Actions action=new Actions(driver);
			action.moveToElement(name);
			action.build().perform();
			System.out.println(name.getText());
			
		}
		
		
		
		
		
		
		
		
	}
}
