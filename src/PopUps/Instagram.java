package PopUps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> window;
		Iterator<String> itr;
		//for first window
		
		window = driver.getWindowHandles();
		itr = window.iterator();
		String onewindow = itr.next();
		System.out.println(onewindow);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//div[text()='Meta']")).click();
		
		//for second window obivously in browser third windo
		
		window=driver.getWindowHandles();
		itr=window.iterator();
		itr.next();
		String secondwindow = itr.next();
		System.out.println(secondwindow);
		
		driver.switchTo().window(secondwindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[@aria-label='Facebook(opens in new tab)']")).click();
		
		//for third window
		
		window=driver.getWindowHandles();
		itr=window.iterator();
		itr.next();
		itr.next();
		String thirdwindow = itr.next();
		System.out.println(thirdwindow);
		driver.switchTo().window(thirdwindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.quit();
		
		
		
		
		
}
}
