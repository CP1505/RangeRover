package SiteOpenAndClose;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3Amezon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//driver.close();
	
	//set position
	
	Point P=new Point(600,700);
	driver.manage().window().setPosition(P);
	
	//maximize
	
	//driver.manage().window().maximize();
	
	String S=driver.getTitle();
	System.out.println(S);
	
	//url
	
	String b=driver.getCurrentUrl();
	System.out.println(b);
	
	//navigate
	
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
