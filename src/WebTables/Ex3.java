package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	int rows=driver.findElements(By.xpath("//table[@id='anyid']//tbody/tr")).size();
	int column=driver.findElements(By.xpath("//table[@id='anyid']//tbody/tr/td")).size();
	
	
	System.out.println("The number of rows are="+rows);
	System.out.println("The number of columns are="+column);
	

}
}
