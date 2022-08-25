package IRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTrainBooking {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	
	
	//Thread.sleep(2000);
	
	WebElement Ok = driver.findElement(By.xpath("//button[text()='OK']"));
	Ok.click();
	
	WebElement Reg = driver.findElement(By.xpath("//a[text()=' REGISTER ']"));
	Reg.click();
	
	//Thread.sleep(2000);
	
	WebElement Uname = driver.findElement(By.xpath("//input[@id='userName']"));
	Uname.sendKeys("anu15053508");
	
	WebElement Password = driver.findElement(By.xpath("//input[@id='usrPwd']"));
	Password.sendKeys("Anu@123#456789");
	
	WebElement Passconf = driver.findElement(By.xpath("//input[@id='cnfUsrPwd']"));
	Passconf.sendKeys("Anu@123#456789");
	
	WebElement lang = driver.findElement(By.xpath("//span[text()='Preferred Language']"));
	if(lang.isDisplayed()==true) {
		lang.click();
	}else {
		System.out.println("No Click On lang");
	}
	
	WebElement Eng = driver.findElement(By.xpath("//li[@aria-label='English']"));
	Eng.click();
	
	WebElement que = driver.findElement(By.xpath("//span[text()='Security Question']"));
	if(que.isDisplayed()==true) {
		que.click();
	}else {
		System.out.println("No Click");
	}
	
	WebElement que1 = driver.findElement(By.xpath("//span[text()='What is your favorite past-time?']"));
	que1.click();
	
	WebElement ans = driver.findElement(By.xpath("//input[@placeholder='Security Answer']"));
	ans.sendKeys("XYZ");
	
	WebElement cont = driver.findElement(By.xpath("//button[@label='Continue']"));
	cont.click();
	
	WebElement Fname = driver.findElement(By.xpath("//input[@id='firstName']"));
	Fname.sendKeys("Anuradha");
	
	WebElement Mname = driver.findElement(By.xpath("//input[@id='middleName']"));
	Mname.sendKeys("Dhananjay");
	
	WebElement Lname = driver.findElement(By.xpath("//input[@id='lastname']"));
	Lname.sendKeys("Mane");
	
	WebElement occ = driver.findElement(By.xpath("//span[text()='Select Occupation']"));
	if(occ.isDisplayed()==true) {
		occ.click();
	}else {
		System.out.println("Dont click");
	}
	
	WebElement self = driver.findElement(By.xpath("//span[text()='SELF EMPLOYED']"));
	self.click();
	
	WebElement Umm = driver.findElement(By.xpath("//label[text()='Unmarried']"));
	Umm.click();
	
	WebElement male = driver.findElement(By.xpath("//span[text()='Male']"));
	male.click();
	
	WebElement mb=driver.findElement(By.xpath("//input[@name='mobile']"));
	mb.sendKeys("9604410157");
	
//	WebElement country = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
//	Select s=new Select(country);
//	s.selectByValue("94");
	
	WebElement em = driver.findElement(By.xpath("//input[@id='email']"));
	em.sendKeys("chavaprasad1505cp@gmail.com");
	
	WebElement nation = driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
	Select s1=new Select(nation);
	s1.selectByValue("94");
	
//	WebElement calender = driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']"));
//	calender.sendKeys("01-07-1985");
	
	WebElement con = driver.findElement(By.xpath("//button[@label='Continue']"));
	con.click();
	
	WebElement inna = driver.findElement(By.xpath("//input[@placeholder='Flat/Door/Block No.']"));
	inna.sendKeys("1502");
	
	WebElement op = driver.findElement(By.xpath("//input[@placeholder='Street/Lane (Optional)']"));
	op.sendKeys("mahamarg");
	
	WebElement kk = driver.findElement(By.xpath("//input[@placeholder='Area/Locality (Optional)']"));
	kk.sendKeys("jay");
	
	WebElement pk = driver.findElement(By.xpath("//input[@placeholder='Pin code']"));
	pk.sendKeys("413520");
	
	//hit register
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
