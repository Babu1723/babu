package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver chrome = new ChromeDriver();
		    chrome.get("https://demoqa.com/automation-practice-form");
		    chrome.switchTo().frame("iframe1");
		    chrome.findElement(By.id("sampleHeading"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    Thread.sleep(5000);	
			
		    chrome.close();
		    chrome.quit();
				
		
		
		
		
	}

}
