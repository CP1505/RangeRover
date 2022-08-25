package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().window().maximize();
	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\Train.png"));
	
	
	
	
	
	
	
	
	
}
}
