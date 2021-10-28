package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\babum\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver chrome = new ChromeDriver();
    JavascriptExecutor js =(JavascriptExecutor)chrome;
    js.executeScript("window.location='https://demoqa.com/automation-practice-form'");
 String title =  js.executeScript("return document.title").toString();
	System.out.println( title);
	 String url =  js.executeScript("return document.URL").toString();
		System.out.println( url);		
		// String text=   js.executeScript("returndocument.url").toString();
		//	System.out.println( text);		
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 chrome.close();
	 chrome.quit();
		
		
		
		
	}

}
