package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_class {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver chrome = new ChromeDriver();
		    chrome.get("https://demoqa.com/automation-practice-form");
		    chrome.manage().window().maximize();
		   Dimension dim = chrome.manage().window().getSize();
		    System.out.println(dim.getHeight());
		    System.out.println(dim.getWidth());
		  Point P = chrome.manage().window().getPosition();
		    System.out.println(P.getX());
		    System.out.println(P.getY());
		   // Point Pnt = new Point(100,100);
		  //  chrome.manage().window().setPosition(Pnt);
		    
		    
		    //--NAVIGATE_CLASS--
		   // chrome.navigate().forward();
		  //  chrome.navigate().back();
		    chrome.navigate().refresh();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(10000);	
	chrome.close();
	chrome.quit();
		
	}

}
