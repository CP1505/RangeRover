package SiteOpenAndClose;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6Adidas {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.adidas.co.in/");
	//driver.close();
	
	driver.getTitle();
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	System.out.println(driver.getTitle());
	String S=driver.getTitle();
	System.out.println(S);
	
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	//set size
	
	Dimension D=new Dimension(400,600);
	driver.manage().window().setSize(D);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
