package IRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcIndia {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	ChromeOptions Options=new ChromeOptions();
	Options.addArguments("-disable-notifications");
	driver.manage().window().maximize();
	
    //Step==1
	WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	ok.click();
	//Step==2
	WebElement register = driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']"));
	register.click();
	Thread.sleep(2000);
	//step==3
	WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
	user.sendKeys("anuradha1505645");
	
	WebElement P = driver.findElement(By.xpath("//input[@id='usrPwd']"));
	P.sendKeys("Cp@123456789");
	
	WebElement Re = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
	Re.sendKeys("Cp@123456789");
	
	WebElement pre = driver.findElement(By.xpath("//span[text()='Preferred Language']"));
	pre.isDisplayed();
	if(pre.isDisplayed()==true) {
		pre.click();
	}else {
		System.out.println("No");
	}
	
	WebElement lang = driver.findElement(By.xpath("//li[@aria-label='English']"));
	lang.click();
	
	WebElement sec = driver.findElement(By.xpath("//span[text()='Security Question']"));
	sec.isDisplayed();
	if(sec.isDisplayed()==true) {
		sec.click();
	}else {
		System.out.println("No");
	}
	WebElement mid = driver.findElement(By.xpath("//span[text()='What is your fathers middle name?']"));
	mid.click();
	WebElement ans = driver.findElement(By.xpath("//input[@placeholder='Security Answer']"));
	ans.sendKeys("Mane");
	
	WebElement cont = driver.findElement(By.xpath("//button[@label='Continue']"));
	cont.click();
	
	WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
	fname.sendKeys("Anuradha");
	
	WebElement mname = driver.findElement(By.xpath("//input[@name='middleName']"));
	mname.sendKeys("Dhananjy");
	
	WebElement sname = driver.findElement(By.xpath("//input[@name='lastname']"));
	sname.sendKeys("Mane");
	
	WebElement so = driver.findElement(By.xpath("//span[text()='Select Occupation']"));
	so.isDisplayed();
	if(so.isDisplayed()==true) {
		so.click();
	}else {
		System.out.println("No");
	}
	
	WebElement self = driver.findElement(By.xpath("//span[text()='SELF EMPLOYED']"));
	self.click();
	
	WebElement married = driver.findElement(By.xpath("//label[text()='Married']"));
	married.click();
	WebElement female = driver.findElement(By.xpath("//div[@aria-label='Female']"));
	female.click();
	WebElement mbno = driver.findElement(By.xpath("//input[@name='mobile']"));
	mbno.sendKeys("9604410157");
	WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
	em.sendKeys("anu@gmail.com");
	
	WebElement dob = driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']"));
	dob.isDisplayed();
	if(dob.isDisplayed()==true) {
		dob.click();
	}else {
		System.out.println("No");
	}
	Thread.sleep(1000);
	
//	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month ng-tns-c59-17 ng-star-inserted']"));
//	Select s=new Select(month);
//	s.selectByValue("0");
//	
//	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year ng-tns-c59-17 ng-star-inserted']"));
//	Select s1=new Select(year);
//	s1.selectByValue("1996");
//	
//	WebElement date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c59-17']"));
//	
//	Select s2=new Select(date);
//	s2.selectByVisibleText("5");

	
	WebElement calender = driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']"));
	calender.sendKeys("01-07-1999");
	
	
}
}
