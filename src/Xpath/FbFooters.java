package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbFooters {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList _509- _4ki _703 _6-i')]//a"));
	System.out.println(footerlinks.size());
	for(int i=0;i<footerlinks.size();i++) {
		String value = footerlinks.get(i).getAttribute("title");
		System.out.println(i+" "+value);	
	}
	
	
	
}
}
