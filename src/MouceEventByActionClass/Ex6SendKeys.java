package MouceEventByActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6SendKeys {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		Actions action = new Actions(driver);
		//action.sendKeys(username, "anuradha").build().perform();
		action.keyDown(username,Keys.SHIFT).sendKeys("anuradha").keyUp(username, Keys.SHIFT).build().perform();
		action.sendKeys(pass, "123@15hja").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
