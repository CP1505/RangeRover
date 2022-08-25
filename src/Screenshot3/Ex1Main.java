package Screenshot3;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1Main extends Ex1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	driver.manage().window().maximize();
	
	ghescreenshot();
}
}
