package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 {
	public static WebDriver driver;
	public static void ghescreenshot() throws IOException {
		
        
		
		Date d=new Date();
		System.out.println(d);
	    String Filename = d.toString().replace(" ","_").replace(":","_")+".png";
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\ScreenShot\\jio_"+Filename);
		
		FileUtils.copyFile(Source, Destination);
		
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.jio.com/");
		
		driver.manage().window().maximize();
		
		//ghescreenshot();
		
		driver.navigate().to("https://in.bookmyshow.com/explore/home/pune");
		ghescreenshot();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
