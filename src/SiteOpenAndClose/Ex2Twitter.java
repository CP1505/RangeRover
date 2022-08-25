package SiteOpenAndClose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2Twitter {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/");
	//driver.close();
	
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	String t=driver.getTitle();
	System.out.println(t);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.youtube.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//set size 
Dimension D=new Dimension(200,300);
driver.manage().window().setSize(D);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
