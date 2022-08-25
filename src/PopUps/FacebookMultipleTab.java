package PopUps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMultipleTab {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Common for all
	Set<String> windows;
	Iterator<String> itr;
	
	//For First window
	
	windows = driver.getWindowHandles();
	itr = windows.iterator();
	String firstwindow = itr.next();
	System.out.println(firstwindow);
	
	WebElement pay = driver.findElement(By.xpath("//a[text()='Facebook Pay']"));
	pay.click();
	
	
	//For second window
	
	windows = driver.getWindowHandles();
	itr = windows.iterator();
	itr.next();
	String secondwindow = itr.next();
	System.out.println(secondwindow);
	
	driver.switchTo().window(secondwindow);
	
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("//a[text()='Payments Privacy Policy']")).click();
	
	//for third window
	
	windows = driver.getWindowHandles();
	itr = windows.iterator();
	
	itr.next();
	itr.next();
	String thirdwindow = itr.next();
	System.out.println(thirdwindow);
	
	driver.switchTo().window(thirdwindow);
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chavanprasad1505cp@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("159753258963");
	driver.close();
	driver.quit();
}
}
