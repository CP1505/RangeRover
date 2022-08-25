package SiteOpenAndClose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1YouTube {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	//driver.close();
	
	//driver.quit();
	
	
	System.out.println(driver.getCurrentUrl());
	
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	//set size 
	
	Dimension z=new Dimension(300,150);
	driver.manage().window().setSize(z);
	
	//set position
	
	Point p=new Point(200,250);
	driver.manage().window().setPosition(p);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
