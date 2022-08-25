package MouceEventByActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1Self1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.1mg.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Order Now']")).click();
		Thread.sleep(2000);
		WebElement Close = driver.findElement(By.xpath("//span[@title='Close']"));
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();",Close);
		
		List<WebElement> Links = driver.findElements(By.xpath("//div[@class='styles__category-links___iU2im']/ul/li"));
		
		for(int i=0;i<Links.size();i++) {
			WebElement link = Links.get(i);
			Actions action=new Actions(driver);
			action.moveToElement(link).build().perform();
			System.out.println(link.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
