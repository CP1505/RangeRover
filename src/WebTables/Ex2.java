package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.englishclub.com/kids/numbers-chart.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	int rows=driver.findElements(By.xpath("//table[@class='ec-table']//tbody/tr")).size();
	int column=driver.findElements(By.xpath("//table[@class='ec-table']//tbody/tr[1]/td")).size();
	
	
	System.out.println("The number of rows are="+rows);
	System.out.println("The number of columns are="+column);
	
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=column;j++) {
			String data = driver.findElement(By.xpath("//table[@class='ec-table']//tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println("==>"+data);
		}System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
