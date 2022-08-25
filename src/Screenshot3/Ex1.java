package Screenshot3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Ex1 {
	public static WebDriver driver;

	public static void ghescreenshot() throws IOException {
		
		Date b=new Date();
		
		System.out.println(b);
		
		String Filename = b.toString().replace(" ","_").replace(":","_")+".png";
		
		System.out.println(Filename);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
		File Destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\ScreenShot\\E_"+Filename);
		
		FileUtils.copyFile(Source, Destination);
		
		
		}
}
