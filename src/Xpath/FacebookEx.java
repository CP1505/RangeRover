package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookEx {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("-disable-notifications");
	
	//Module No==>1 Log in page.
	//input tab
//	WebElement input=driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
//	input.sendKeys("anuradha123@gmail.com");
	//password tab
//	WebElement pass=driver.findElement(By.xpath("//input[@aria-label='Password']"));
//	pass.sendKeys("anu@456#123");
	//login button
//	WebElement log=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
//	log.click();
//========================================================================================================
	//Module No==>2 SignUp page
	//create new account button
	WebElement sign=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	sign.click();
	
	Thread.sleep(2000);
    
	//first name
	WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
	first.sendKeys("Anuradha");
	//Surname
	WebElement sur=driver.findElement(By.xpath("//input[@name='lastname']"));
	sur.sendKeys("Pandit");
	//email
	WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("Anu@123.gmail.com");
	//new password
	WebElement newpass=driver.findElement(By.xpath("//input[@data-type='password']"));
	newpass.sendKeys("anu@123#456");
	
	////input[@name='reg_email_confirmation__']
	
	WebElement re=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	re.isDisplayed();
	if(re.isDisplayed()==true) {
		re.sendKeys("Anu@123.gmail.com");
	}else {
		System.out.println("no");
	}
	//Radio Button click
    WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
	radio.click();
//========================================================================================================
	//Module No=3==>DOB,MONTH,YEAR

	//DOB
	WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	//import support.ui
	Select s=new Select(dob);
	s.selectByValue("16");
	//MONTH
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(month);
    s1.selectByValue("2");
    //YEAR
    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select s2=new Select(year);
	s2.selectByValue("1996");
//========================================================================================================
	//Module No==>4==>SignUp hit Button
	
	WebElement sgup = driver.findElement(By.xpath("//button[@name='websubmit']"));
	
	sgup.click();

//===================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
