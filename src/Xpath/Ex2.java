package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	
	WebElement train=driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains']"));
	train.click();
	
	WebElement live=driver.findElement(By.xpath("//span[@data-cy='liveTrainStatus']"));
	live.click();
	
	WebElement trainno=driver.findElement(By.xpath("//label[@for='trainNum']"));
	trainno.click();
	
//	WebElement tab=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
//	tab.sendKeys("Mumbai");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

}
