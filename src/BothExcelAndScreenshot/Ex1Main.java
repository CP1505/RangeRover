package BothExcelAndScreenshot;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1Main extends Ex1{
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
	FileInputStream File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	String value = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
	WebElement user = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	user.sendKeys(value);
	
	ghescreenshot();
	
}
}
