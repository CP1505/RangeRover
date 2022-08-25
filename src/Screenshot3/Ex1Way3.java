package Screenshot3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1Way3 {

	public static WebDriver driver;
	public static void getscreenshot() throws IOException {
		
		Date D=new Date();
		System.out.println(D);
		String FileName = D.toString().replace(" ","_").replace(":","_")+".png";
		System.out.println(FileName);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\CP3508"+FileName);
		FileUtils.copyFile(Source, Destination);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		getscreenshot();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
