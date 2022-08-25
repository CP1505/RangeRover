package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Train {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("-disable-notifications");
		
		driver.manage().window().maximize();
	    WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    ok.click();
	    WebElement Resister = driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']"));
	    Resister.click();
	    Thread.sleep(2000);
	    WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
	    name.sendKeys("akshay12");
	    
	    WebElement pass = driver.findElement(By.xpath("//input[@id=\"usrPwd\"]"));
	    pass.sendKeys("AKSHAY@93");
	    
	    WebElement conformpass = driver.findElement(By.xpath("//input[@id=\"cnfUsrPwd\"]"));
	    conformpass.sendKeys("Akshay@93");
	    
	    Thread.sleep(1000);
	   
	    WebElement pre = driver.findElement(By.xpath("//span[@class='ng-tns-c66-14 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']"));
		pre.isDisplayed();
		if(pre.isDisplayed()==true) {
			pre.click();
		}else {
			System.out.println("No");
		}
		
		WebElement lang = driver.findElement(By.xpath("//span[text()='English']"));
		lang.click();
	    
}
}
