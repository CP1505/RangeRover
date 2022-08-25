package SiteOpenAndClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8JeevanSathi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jeevansathi.com/");
	driver.close();
	
	
	
	
	
	
	
	
}
}
