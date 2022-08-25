package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\12.png"));
	
	
	
	
	
	
	
	
	
}
}
