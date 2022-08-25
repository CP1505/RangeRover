package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5NSE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/market-data/pre-open-market-cm-and-emerge-market");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int row = driver.findElements(By.xpath("//table[@id='livePreTable']//tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id='livePreTable']//tbody/tr/[1]td")).size();
		
		System.out.println("The number of rows are="+row);
		System.out.println("The number of columns are="+col);
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				String data = driver.findElement(By.xpath("//table[@id='livePreTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("="+data);
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
