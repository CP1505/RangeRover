package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpEx0 {
public static void main(String[] args) {
	//Driver Launch
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	//xpath method and click it
	
	driver.switchTo().frame("iframeResult");
	
	WebElement me = driver.findElement(By.xpath("//button[text()='Try it']"));
	me.click();
	
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	
	al.accept();
	
	
}
}
