package Xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
    
//    WebElement tab=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//	tab.sendKeys("Hello");
	
	WebElement dot=driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_8d gb_8c']"));
	dot.click();
	
	WebElement ip=driver.findElement(By.xpath("//input[@type='email']"));
	
	ip.sendKeys("chavanprasad1505cp@gmail.com");
	
	WebElement cret=driver.findElement(By.xpath("//span[text()='Create account']"));
	cret.click();
	
	WebElement to=driver.findElement(By.xpath("//span[text()='To manage my business']"));
	to.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
