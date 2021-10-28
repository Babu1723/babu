package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver chrome = new ChromeDriver();
    chrome.get("https://demoqa.com/automation-practice-form");
    chrome.manage().window().fullscreen();
   String tittle = chrome.getTitle();
   System.out.println(tittle);
  String url = chrome.getCurrentUrl();
  System.out.println(url);
  String source = chrome.getPageSource();
  System.out.println(source);
  chrome.findElement(By.id("firstName")).sendKeys("babu");
 String attvalue = chrome.findElement(By.id("firstName")).getAttribute("type");
 System.out.println(attvalue);
 String cssvalue = chrome.findElement(By.id("firstName")).getCssValue("color");
 System.out.println(cssvalue);
 Boolean disply = chrome.findElement(By.id("firstName")).isDisplayed();
 System.out.println(disply);
 String tagname = chrome.findElement(By.id("firstName")).getTagName();
  System.out.println(tagname);
  Boolean enable = chrome.findElement(By.id("firstName")).isEnabled();
  System.out.println(enable);
  // Boolean select = chrome.findElement(By.xpath("//label[@class='custom-control-label'])[4]")).isSelected();
//System.out.println( select);
 Point P = chrome.findElement(By.id("firstName")).getLocation();
  System.out.println(P.getX());
  System.out.println(P.getY());
  Rectangle R = chrome.findElement(By.id("firstName")).getRect();
  System.out.println(R.getHeight());
  System.out.println(R.getWidth());
  chrome.findElement(By.id("lastName")).sendKeys("mudhiraj");
  chrome.findElement(By.id("userEmail")).sendKeys("babu@172");
  chrome.findElement(By.id("userEmail")).sendKeys("babu@172");
  chrome.findElement(By.xpath("//label[text()='Male']")).click();
  chrome.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7306286221");
  //chrome.findElement(By.xpath("//div[@class='css-1g6gooi']")).sendKeys("rockstar");
  chrome.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
  chrome.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();
  chrome.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
  //Boolean select = chrome.findElement(By.xpath("//label[@class='custom-control-label'])[4]")).isSelected();
  //System.out.println( select);

  chrome.findElement(By.id("currentAddress")).sendKeys("Mahabobpet(vlg),yadagiriguta(mdl),yadadri-bhongir(dst)");
  //chrome.findElement(By.id("submit")).click();
	
	Thread.sleep(5000);	
		
    chrome.close();
    chrome.quit();
	
	}

}
