package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
//
//	WebElement tabinput=driver.findElement(By.xpath("//input[@type='text']"));
//	tabinput.sendKeys("chavanprasad1505cp@gmail.com");
//	
//	WebElement passkey=driver.findElement(By.xpath("//input[@type='password']"));
//	passkey.sendKeys("1523@1234");
	
//	WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
//	login.click();
    
//	driver.manage().window().maximize();
//	driver.navigate().back();
	
//	WebElement texttab=driver.findElement(By.xpath(""));
//	System.out.println(texttab.isEnabled());
	
//	WebElement tab=driver.findElement(By.xpath("//input[@type='text']"));
//	System.out.println(tab.isDisplayed());
	
	WebElement cret=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
	cret.click();
	
	WebElement mam=driver.findElement(By.xpath("//label[text()='Female']"));
	System.out.println(mam.isSelected());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
