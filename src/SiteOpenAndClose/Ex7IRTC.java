package SiteOpenAndClose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7IRTC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");

	
	
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
//	driver.close();
//	driver.quit();

	driver.getTitle();
	System.out.println(driver.getTitle());
	
	String S=driver.getTitle();
	System.out.println(S);
	
	//driver.manage().window().fullscreen();
	//driver.manage().window().maximize();
	
	driver.navigate().to("https://www.jeevansathi.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//set size
	
	Dimension D=new Dimension(400,400);
	driver.manage().window().setSize(D);
	
	//set position
	
	Point P=new Point(400,500);
	driver.manage().window().setPosition(P);
	
	driver.quit();
	
	
	
}
}
