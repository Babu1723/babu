package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver chrome = new ChromeDriver(ops);
		    chrome.get("https://demoqa.com/automation-practice-form");
		    chrome.manage().window().maximize();
		Actions action = new Actions(chrome);
	WebElement first =	chrome.findElement(By.id("firstName"));	
	action.moveToElement(first).click().keyDown(first,Keys.SHIFT ).sendKeys("babu").keyUp(first,Keys.SHIFT ).build().perform();	
	WebElement last =	chrome.findElement(By.xpath("//*[@id='lastName']"));	
	action.moveToElement(last).click().keyDown(last,Keys.SHIFT ).sendKeys("mudhiraj").keyUp(last,Keys.SHIFT ).build().perform();	
	WebElement mail =	chrome.findElement(By.id("userEmail"));	
	action.moveToElement(mail).click().sendKeys("babu@172gmail.com").build().perform();	
	WebElement gender =	chrome.findElement(By.xpath("//label[text()='Male']"));	
	action.moveToElement(gender).click().build().perform();	
	WebElement phone =	chrome.findElement(By.id("userNumber"));	
	action.moveToElement(phone).click().sendKeys("8309351650").build().perform();				
	WebElement date =	chrome.findElement(By.id("dateOfBirthInput"));	
	action.moveToElement(date).click().build().perform();				
	WebElement year =	chrome.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));	
	action.moveToElement(year).click().build().perform();
	Thread.sleep(2000);
	//WebElement year1 =	chrome.findElement(By.xpath("//select[@class='react-datepicker__year-select']/*[99]"));	
//	action.moveToElement(year1).click().build().perform();	
	WebElement month =	chrome.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));	
	action.moveToElement(month).click().build().perform();	
	//WebElement month1 =	chrome.findElement(By.xpath("//select[@class='react-datepicker__month-select']/*[2]"));	
//	action.moveToElement(month1).click().build().perform();	
	Thread.sleep(2000);
	WebElement day =	chrome.findElement(By.xpath("//div[text()=13]"));	
	action.moveToElement(day).click().build().perform();			
	WebElement sub =	chrome.findElement(By.xpath("(//div[@class='css-1g6gooi'])[1]"));	
	action.moveToElement(sub).click().sendKeys("Maths").click().build().perform();		
	WebElement hobies =	chrome.findElement(By.xpath("//*[text()='Sports']"));	
	action.moveToElement(hobies).click().click().build().perform();		
	WebElement hobies2 =	chrome.findElement(By.xpath("//*[text()='Reading']"));	
	action.moveToElement(hobies2).click().build().perform();		
	WebElement hobies3 =	chrome.findElement(By.xpath("//*[text()='Music']"));	
	action.moveToElement(hobies3).click().build().perform();	
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) chrome;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//WebElement hob =	chrome.findElement(By.id("userNumber"));	
   // WebElement hop =	chrome.findElement(By.id("submit"));	
	//action.moveToElement(hop).build().perform();	
	Thread.sleep(1000);
	//WebElement file = chrome.f
	//action.moveToElement(file).click().build().perform();
	WebElement add =	chrome.findElement(By.id("currentAddress"));	
	action.moveToElement(add).click().sendKeys("mahaboobpet(vl),yadagirigutta(mdl),yadadri-bhongir()dst,pincode:508116").build().perform();	
	//WebElement hobies3 =	chrome.findElement(By.xpath("//*[text()='Music']"));	
	//action.moveToElement(hobies3).click().build().perform();	
	Thread.sleep(2000);
	WebElement select =	chrome.findElement(By.xpath("//diV[text()='Select State']"));	
	action.moveToElement(select).click().build().perform();	
	Thread.sleep(2000);
	WebElement state =	chrome.findElement(By.xpath("//div[text()='Uttar Pradesh']"));	
	action.moveToElement(state).click().build().perform();
	Thread.sleep(2000);
	//WebElement state1 =	chrome.findElement(By.xpath("//div[text()='Haryana']"));	
	//action.moveToElement(state1).click().build().perform();		
	WebElement city =	chrome.findElement(By.xpath("//diV[text()='Select City']"));	
	action.moveToElement(city).click().build().perform();
	Thread.sleep(1000);
	WebElement cit  = chrome.findElement(By.xpath("//diV[text()='Agra']"));	
	action.moveToElement(cit).click().build().perform();		
	WebElement submit  = chrome.findElement(By.id("submit"));	
	action.moveToElement(submit).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
Thread.sleep(2000)	;	
chrome.close();
chrome.quit();
		

	}

}
