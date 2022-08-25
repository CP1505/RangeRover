package Screenshot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(500);
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("C:\\\\Users\\\\hp\\\\OneDrive\\\\Pictures\\\\Screenshots\\YouTube.png"));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
