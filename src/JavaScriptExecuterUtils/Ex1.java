package JavaScriptExecuterUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQjwz96WBhC8ARIsAATR251gCZPVzG3YgfynoNysgONc6Tor5mK7yi_MgtynV0l5eGAj1HORyVkaAvWiEALw_wcB&cmp=SEM|D|DF|G|Generic|DF_Generic_Exact|Tickets_Exact|RSA|Offer3|483490446455&s_kwcid=AL!1631!3!483490446455!b!!g!!ticket%20booking&ef_id=Cj0KCQjwz96WBhC8ARIsAATR251gCZPVzG3YgfynoNysgONc6Tor5mK7yi_MgtynV0l5eGAj1HORyVkaAvWiEALw_wcB:G:s");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ok = driver.findElement(By.xpath("//a[text()='Search']"));
		JsUtils.DrawBorderjs(driver, ok);
	
		
	
}
}
