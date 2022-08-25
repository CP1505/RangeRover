package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 {
public static void main(String[] args) throws InterruptedException, IOException {
	
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	 WebDriver driver=new ChromeDriver();
	
	 driver.get("https://www.jio.com/");
	 
	 driver.manage().window().maximize();
	
	 Thread.sleep(1000);

	// File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\ScreenShot\\Jio.png"));
	
	Date D=new Date();
	System.out.println(D);
	
	String FileName = D.toString().replace(" ","_").replace(":","_")+".png";
	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\ScreenShot\\Jio_"+FileName));
	
	
	
}
}
