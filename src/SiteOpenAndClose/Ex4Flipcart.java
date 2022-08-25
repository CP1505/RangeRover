package SiteOpenAndClose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4Flipcart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
//	driver.close();
//	driver.quit();
	
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	String S=driver.getTitle();
	System.out.println(S);
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com/watch?v=CXKXdIf5vEA");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//set size
	Dimension D=new Dimension(200,400);
	driver.manage().window().setSize(D);
	
	//set position
	Point P=new Point(200,50);
	driver.manage().window().setPosition(P);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
